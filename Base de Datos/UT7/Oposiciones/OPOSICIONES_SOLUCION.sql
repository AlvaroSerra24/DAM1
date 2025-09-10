SET SERVEROUTPUT ON
SET VERIFY OFF
/*1. Crear un procedimiento almacenado al que le pasaremos un código de academia, de tal forma que nos mostrará todos sus profesores y para cada profesor los datos de los opositores que se han preparado en esa academia.*/
CREATE OR REPLACE PROCEDURE ACADEMIA_PROFESOR_OPOSITOR (ACADEMIA NUMBER) IS

   CURSOR CPROFESORES IS SELECT UNIQUE(P.COD_PROFESOR), P.NOM_PROFESOR, P.APE_PROFESOR, P.EMAIL_PROFESOR 
                         FROM PROFESORES P JOIN opositor_academia_profesor OAP ON(P.COD_PROFESOR = OAP.COD_PROFESOR) 
                         WHERE OAP.COD_ACADEMIA = ACADEMIA; 
    
    CURSOR COPOSITORES (PROFESOR NUMBER) IS SELECT O.NOM_OPOSITOR, O.APE_OPOSITOR, O.FECHA_NAC 
                         FROM OPOSITORES O JOIN opositor_academia_profesor OAP ON(O.COD_OPOSITOR = OAP.COD_OPOSITOR) 
                         WHERE OAP.COD_PROFESOR = PROFESOR; 

    REGPROFESORES        CPROFESORES%ROWTYPE;
    REGOPOSITORES        COPOSITORES%ROWTYPE;
    NOMBRE_ACADEMIA VARCHAR2(50);
    CONT_PROFESORES NUMBER:=0;
    CONT_OPOSITORES NUMBER:=0;
BEGIN
    SELECT NOM_ACADEMIA INTO NOMBRE_ACADEMIA FROM ACADEMIAS WHERE COD_ACADEMIA = ACADEMIA;
 OPEN CPROFESORES;
    FETCH CPROFESORES INTO REGPROFESORES;
    DBMS_OUTPUT.PUT_LINE('NOMBRE DEL ACADEMIA:  ' || NOMBRE_ACADEMIA );
    DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------------------------------');
    WHILE(CPROFESORES %FOUND) LOOP
         DBMS_OUTPUT.PUT_LINE(RPAD('      PROFESOR: ', 17)|| REGPROFESORES.NOM_PROFESOR || ' '  || REGPROFESORES.APE_PROFESOR);        
        DBMS_OUTPUT.PUT_LINE('      --------------------------------------------------------------------------');
            OPEN COPOSITORES (REGPROFESORES.COD_PROFESOR);
            FETCH COPOSITORES  INTO REGOPOSITORES ;
            DBMS_OUTPUT.PUT_LINE(RPAD('          NOMBRE', 30)|| RPAD('APELLIDOS', 25)|| RPAD('FECHA NACIMIENTO', 20));
            DBMS_OUTPUT.PUT_LINE('          ----------------------------------------------------------------------');
            WHILE(COPOSITORES  %FOUND) LOOP
                DBMS_OUTPUT.PUT_LINE('          ' ||RPAD(REGOPOSITORES.NOM_OPOSITOR, 20)||RPAD(REGOPOSITORES.APE_OPOSITOR, 25)|| RPAD(REGOPOSITORES.FECHA_NAC, 15));   
                CONT_OPOSITORES  := CONT_OPOSITORES  + 1;
                FETCH COPOSITORES  INTO REGOPOSITORES;
            END LOOP;  
    DBMS_OUTPUT.PUT_LINE('          ----------------------------------------------------------------------');        
    CLOSE COPOSITORES;        
    CONT_PROFESORES  := CONT_PROFESORES  + 1;
    FETCH CPROFESORES INTO REGPROFESORES;
    END LOOP;
    CLOSE CPROFESORES;
    DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------------------------------');
    DBMS_OUTPUT.PUT_LINE(RPAD(('     NÚMERO DE PROFESORES: ' ||  CONT_PROFESORES ), 35)         || 'NÚMERO DE OPOSITORES: ' ||  CONT_OPOSITORES);
    DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------------------------------');
END;    

BEGIN
ACADEMIA_PROFESOR_OPOSITOR (3);
END;

/*2. Realizar un trigger para controlar las operaciones de inserción, modificación y borrado en la tabla de OPOSITORES. */
CREATE OR REPLACE TRIGGER AUDITA_OPOSITOR BEFORE INSERT OR UPDATE OR DELETE ON 
                                                                                                        OPOSITORES FOR EACH ROW
DECLARE
   MENSAJE VARCHAR2(400):= '';
BEGIN
    MENSAJE :='FECHA: '||SYSDATE||', HORA:'||TO_CHAR(SYSDATE,'HH:MM:SS');

    IF INSERTING THEN
        MENSAJE := MENSAJE || ', OPERACION: INSERCIÓN ';
    END IF;    

    IF DELETING THEN
        MENSAJE := MENSAJE || ', OPERACION: BORRADO ' || ', NOMBRE: ' ||:OLD.NOM_OPOSITOR || ' ' ||:OLD.APE_OPOSITOR
                                || ', FECHA NACIMIENTO: ' || :OLD.FECHA_NAC ;
    END IF;

    IF UPDATING THEN -- SE PUEDE HACER SIN ESTA INSTRUCCIÓN
        MENSAJE := MENSAJE || ', OPERACION: MODIFICACIÓN ';

        IF UPDATING('NOM_OPOSITOR') THEN
          MENSAJE := MENSAJE ||', NOMBRE ANTERIOR: '||:OLD.NOM_OPOSITOR || ', NOMBRE NUEVO: '||:NEW.NOM_OPOSITOR ||'. ';
        END IF;

        IF UPDATING('APE_PASAJERO') THEN
           MENSAJE := MENSAJE ||', APELLIDO ANTERIOR: '||:OLD.APE_OPOSITOR || ', APELLIDO NUEVO: '||:NEW.APE_OPOSITOR ||'. ';
        END IF;

        IF UPDATING('FECHA_NAC') THEN
         MENSAJE := MENSAJE ||', FECHA NACIMIENTO ANTERIOR: '||:OLD.FECHA_NAC || ', FECHA NACIMIENTO NUEVA: '||:NEW.FECHA_NAC ||'. ';
        END IF;
    END IF;
    INSERT INTO  AUDITA_OPOSITORES VALUES (MENSAJE);
END;