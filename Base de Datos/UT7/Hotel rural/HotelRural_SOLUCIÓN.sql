/* 1.	Crea una función HABITACION_LIBRE que devuelva TRUE o FALSE. La función 
recibirá por parámetro un número de habitación y si la habitación está actualmente 
ocupada devolverá TRUE, de lo contrario, devolverá FALSE; */
CREATE OR REPLACE FUNCTION HABITACION_LIBRE (NUMERO number) RETURN BOOLEAN IS 
CONT NUMBER(1):=0;
BEGIN
    SELECT COUNT(*) INTO CONT 
    FROM RESERVAS 
    WHERE NUMHABITACION=NUMERO AND 
          SYSDATE BETWEEN FECHAENTRADA AND FECHASALIDA;
    IF CONT > 0 THEN 
       RETURN FALSE;
    ELSE RETURN TRUE;
    END IF;
END;

DECLARE 
    NUM NUMBER(4):=&num_habitacion;
BEGIN 
    IF HABITACION_LIBRE(NUM) THEN
       DBMS_OUTPUT.PUT_LINE('LA HABITACIÓN '||NUM||' HOY ESTÁ LIBRE');
    ELSE 
       DBMS_OUTPUT.PUT_LINE('LA HABITACIÓN '||NUM||' ESTÁ OCUPADA');
    END IF;
END;




/* 2A) Añade un campo a la tabla HABITACIONES, llamado NUMRESERVAS */
ALTER TABLE HABITACIONES ADD (NUMRESERVAS NUMBER(4) DEFAULT 0);
/* 2B) Actualiza el valor del campo NUMRESERVAS con el número de veces que se 
ha reservado cada habitación */
UPDATE HABITACIONES H SET NUMRESERVAS = (SELECT COUNT(*) FROM RESERVAS
                                      WHERE NUMHABITACION=H.NUMHABITACION);
COMMIT;
/* 2C) CREA UN TRIGGER QUE MANTENGA ACTUALIZADO ESTE CAMPO EN LOS SIGUIENTES CASOS:
        - Al realizarse una nueva reserva, incrementando el campo. 
        - Cuando se produzca una cancelación (borrado), decrementando el valor del
          campo. 
        - Cuando el usuario decida cambiar de habitación, incrementando y decrementando
          según corresponda. Solo debe contemplarse la modificación del número 
          de la habitación. 
*/

CREATE OR REPLACE TRIGGER TABLA_HABITACIONES 
BEFORE INSERT OR DELETE OR UPDATE ON HABITACIONES FOR EACH ROW
DECLARE

BEGIN
    IF INSERTING THEN 
        UPDATE HABITACIONES SET NUMRESERVAS=NUMRESERVAS+1
        WHERE NUMHABITACION=:NEW.NUMHABITACION;
    END IF;
    IF DELETING THEN
        UPDATE HABITACIONES SET NUMRESERVAS=NUMRESERVAS-1
        WHERE NUMHABITACION=:OLD.NUMHABITACION;
    END IF;
    IF UPDATING('NUMHABITACION') THEN
        UPDATE HABITACIONES SET NUMRESERVAS=NUMRESERVAS+1
        WHERE NUMHABITACION=:NEW.NUMHABITACION;
        UPDATE HABITACIONES SET NUMRESERVAS=NUMRESERVAS-1
        WHERE NUMHABITACION=:OLD.NUMHABITACION;
    END IF;
END;


/* Mostrar un listado de habitaciones y reservas 
   el listado deberá cumplir el siguiente formato:
   
   HABITACIÓN:  NOMBRE_HABITACON       NUMERO: NUMERO      TIPO:  TIPO 
   =======================================================================
   CLIENTE             PAIS           FECHA ENTRADA       FECHA SALIDA
   ------------------ --------------  ----------------  ---------------
   NOMBRE APELLIDO     PAIS           DD/MM/AA           DD/MM/AA         
   
   --------------------------------------------------------------------
   TOTAL DE RESERVAS: XX */
   
 
/* Mostrar un listado de habitaciones y reservas 
   el listado deberá cumplir el siguiente formato:
   
   HABITACIÓN:  NOMBRE_HABITACON       NUMERO: NUMERO      TIPO:  TIPO 
   =======================================================================
   CLIENTE             PAIS           FECHA ENTRADA       FECHA SALIDA
   ------------------ --------------  ----------------  ---------------
   NOMBRE APELLIDO     PAIS           DD/MM/AA           DD/MM/AA         
   
   --------------------------------------------------------------------
   TOTAL DE RESERVAS: XX */
   
CREATE OR REPLACE PROCEDURE LISTA_HABITACIONES_RESERVAS AS
CURSOR C1 IS SELECT NOMBREHABITACION, NUMHABITACION, TIPO 
             FROM HABITACIONES;
    R1 C1%ROWTYPE;
    CURSOR C2(NUMERO HABITACIONES.NUMHABITACION%TYPE) IS 
       SELECT NOMBRECLIENTE, APELLIDO, PAIS, FECHAENTRADA, FECHASALIDA, CAMASSUPLETORIAS
             FROM CLIENTES JOIN RESERVAS
             USING(CODIGOCLIENTE)
             WHERE NUMHABITACION=NUMERO;
    R2 C2%ROWTYPE;
    CS NUMBER:=0;
    NUMC NUMBER:=0;
    NUMR NUMBER:=0;
    BEGIN
        OPEN C1;
        LOOP
            FETCH C1 INTO R1;
            EXIT WHEN C1%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE('HABITACIÓN: '||R1.NOMBREHABITACION||'     NUMERO: '||R1.NUMHABITACION||'    TIPO: '||R1.TIPO);
            DBMS_OUTPUT.PUT_LINE('=======================================================================');
            OPEN C2(R1.NUMHABITACION);
            DBMS_OUTPUT.PUT_LINE('CLIENTE                  PAIS         ENTRADA  SALIDA');
            DBMS_OUTPUT.PUT_LINE('------------------------ ------------ -------- --------');
            LOOP
                FETCH C2 INTO R2;
                EXIT WHEN C2%NOTFOUND;
                DBMS_OUTPUT.PUT_LINE(RPAD(R2.NOMBRECLIENTE||' ' ||R2.APELLIDO,25,' ')||
                                     RPAD(R2.PAIS,13,' ')||
                                     RPAD(R2.FECHAENTRADA,9,' ')||
                                     R2.FECHASALIDA);
                IF R2.CAMASSUPLETORIAS >0 THEN
                    CS:=CS+1;
                    NUMC:=NUMC+R2.CAMASSUPLETORIAS;
                END IF;
                NUMR:=NUMR+1;
            END LOOP;
            CLOSE C2;
            DBMS_OUTPUT.PUT_LINE('-----------------------------------------------------------------------');
            DBMS_OUTPUT.PUT_LINE('RESERVAS CON CAMAS SUPLETORIAS: ' ||CS);
            DBMS_OUTPUT.PUT_LINE('=======================================================================');
            DBMS_OUTPUT.PUT_LINE('');
        CS:=0;
        END LOOP;
        DBMS_OUTPUT.PUT_LINE('=======================================================================');
        DBMS_OUTPUT.PUT_LINE('NÚMERO TOTAL DE CAMAS SUPLETORIAS CONTRATADAS: '||NUMC);
        DBMS_OUTPUT.PUT_LINE('MEDIA DE CAMAS POR RESERVA: '||TO_CHAR(NUMC/NUMR,'9D99')||' CAMAS');
        CLOSE C1;
    END;

EXEC LISTA_HABITACIONES_RESERVAS;
EXEC LISTA_HABITACIONES_RESERVAS;