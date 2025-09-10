SET SERVEROUTPUT ON
SET VERIFY OFF
/*Ejercicio 1*/
CREATE OR REPLACE PROCEDURE INSERTA_MEDICINA (NOM MEDICINAS.NOMBRE%TYPE, 
                                                                                                                DO MEDICINAS.DOSIS%TYPE,
                                                                                                                LA MEDICINAS.LABORATORIO%TYPE,
                                                                                                                CO MEDICINAS.COMPUESTO%TYPE,
                                                                                                                T MEDICINAS.COMPUESTO%TYPE)IS
INSERTA BOOLEAN:=TRUE;
CONT NUMBER(1):=0;
ID_M MEDICINAS.ID_MED%TYPE;
BEGIN
SELECT MAX(ID_MED)+1 INTO ID_M FROM MEDICINAS;
 SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE NOM=NOMBRE;
    
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE('Ya existe en la tabla de medicinas');
        SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE DO=DOSIS;
        IF CONT>0 THEN
            DBMS_OUTPUT.PUT_LINE(NOM || ' está dado ya de alta en dosis de ' || DO);
            INSERTA:=FALSE;
        END IF;
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE T=TIPO;
    
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE(NOM || ' esta dado de alta en los medicamentos de tipo ' || T);
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE LA=LABORATORIO;
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE(NOM ||' es fabricado por el laboratorio ' || LA);
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE CO=COMPUESTO;
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE('El componente principal de '||NOM||' es '||CO);
    END IF;
    
    IF INSERTA THEN
        INSERT INTO MEDICINAS VALUES (1+(SELECT MAX(ID_MED) FROM MEDICINAS) ,NOM, DO, LA, CO, T);
        DBMS_OUTPUT.PUT_LINE('Ha sido insertado el medicamento');
    ELSE
        DBMS_OUTPUT.PUT_LINE('No se puede insertar el medicamento');
    END IF;   
    
    EXCEPTION
        When Dup_Val_On_Index Then
        Dbms_Output.Put_Line('Error, esa fila ya existe');
END;

EXEC INSERTA_MEDICINA('Med_1','Astrazeneca','Componente 1', 'anticelulosa');
/*---------------------------------------------------------------------------------------------------------*/
DECLARE
    NOM MEDICINAS.NOMBRE%TYPE;
    DO MEDICINAS.DOSIS%TYPE;
    LA MEDICINAS.LABORATORIO%TYPE;
    CO MEDICINAS.COMPUESTO%TYPE;
    T MEDICINAS.COMPUESTO%TYPE;
    INSERTA BOOLEAN:=TRUE;
    CONT NUMBER(1):=0;
BEGIN
    NOM:='&EL_NOMBRE_DE_LA_MEDICINA';
    DO:='&LA_DOSIS_DEL_MEDICAMENTO';
    LA:='&EL_LABORATORIO';
    CO:='&EL_COMPUESTO';
    T:='&EL_TIPO';
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE NOM=NOMBRE;
    
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE('Ya existe en la tabla de medicinas');
        SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE DO=DOSIS;
        IF CONT>0 THEN
            DBMS_OUTPUT.PUT_LINE(NOM || ' está dado ya de alta en dosis de ' || DO);
            INSERTA:=FALSE;
        END IF;
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE T=TIPO;
    
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE(NOM || ' esta dado de alta en los medicamentos de tipo ' || T);
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE LA=LABORATORIO;
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE(NOM ||' es fabricado por el laboratorio ' || LA);
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM MEDICINAS WHERE CO=COMPUESTO;
    IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE('El componente principal de '||NOM||' es '||CO);
    END IF;
    
    IF INSERTA THEN
        INSERT INTO MEDICINAS VALUES (1+(SELECT MAX(ID_MED) FROM MEDICINAS) ,NOM, DO, LA, CO, T);
        DBMS_OUTPUT.PUT_LINE('Ha sido insertado el medicamento');
    ELSE
        DBMS_OUTPUT.PUT_LINE('No se puede insertar el medicamento');
    END IF;   
    
    EXCEPTION
        When Dup_Val_On_Index Then
        Dbms_Output.Put_Line('Error, esa fila ya existe');
END;

/*Actividad 2*/
CREATE OR REPLACE PROCEDURE TURISTA_ENFERMOS (RESERVAS NUMBER) IS
CURSOR CTURISTAS IS SELECT UNIQUE(DNI_TUT),NOMBRE,APELLIDO1,APELLIDO2
                                                     FROM TURISTAS 
                                                     WHERE DNI_TUT = RESERVAS;
CURSOR CTRATAMIENTO(TURISTAS NUMBER) IS SELECT FECHA_INICIO, FECHA_FIN
                                                                                                FROM TRATAMIENTOS TRA 
                                                                                                WHERE TRA.DNI_TUT = TURISTAS;
REGTURISTA CTURISTAS%ROWTYPE;                       
BEGIN
    DBMS_OUTPUT.PUT_LINE('LISTADO DE TURISTAS CON TRATAMIENTOS MÉDICOS');
    DBMS_OUTPUT.PUT_LINE('*********************************************************************');
    OPEN CTURISTAS;
    FETCH CTURISTAS INTO REGTURISTA;
    WHILE(CTURISTAS %FOUND) LOOP
    DBMS_OUTPUT.PUT_LINE('TURISTA: ' || REGTURISTA.DNI_TUT || ' - ' || REGTURISTA.NOMBRE || ' ' || REGTURISTA.APELLIDO1 || ' ' || REGTURISTA.APELLIDO2);
    END LOOP;
    CLOSE CTURISTAS;
END;
/*Actividad 3*/

CREATE TABLE AUDITA_ASTRONAUTAS
(
    MENSAJE VARCHAR2(400)
);

CREATE OR REPLACE TRIGGER AUDITA_ASTRONAUTAS BEFORE INSERT OR UPDATE OR DELETE ON 
                                                                                                        ASTRONAUTAS FOR EACH ROW
DECLARE
   MENSAJE VARCHAR2(400):= '';
BEGIN
    MENSAJE :=(TO_CHAR(SYSDATE,'dd/mm/yyyy HH:MM')|| ' - INSERCIÓN: ' || :NEW.DNI_AST ||' '|| :NEW.NOMBRE||' '||:NEW.APE1||' '||:NEW.APE2);

    IF INSERTING THEN
        MENSAJE := (TO_CHAR(SYSDATE,'dd/mm/yyyy HH:MM')|| ' - MODIFICACIÓN: ' || :NEW.DNI_AST ||' '|| :NEW);
    END IF;    

    IF DELETING THEN
        MENSAJE := (TO_CHAR(SYSDATE,'dd/mm/yyyy HH:MM')|| ' - BORRADO: ' || :NEW.DNI_AST ||' '|| :NEW.NOMBRE||' '||:NEW.APE1||' '||:NEW.APE2);
    END IF;
    INSERT INTO AUDITA_ASTRONAUTAS VALUES (MENSAJE);
END;
