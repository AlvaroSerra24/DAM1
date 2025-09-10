SET SERVEROUTPUT ON
SET VERIFY OFF
/*1. Crear un procedimiento almacenado al que le pasaremos un código de academia, 
de tal forma que nos mostrará todos sus profesores y para cada profesor los datos de 
los opositores que se han preparado en esa academia.*/
CREATE OR REPLACE PROCEDURE ACADEMIA_PROFESOR_OPOSITOR (ACADEMIA NUMBER) IS
    CURSOR C1 IS SELECT UNIQUE(P.COD_PROFESOR), P.NOM_PROFESOR, P.APE_PROFESOR, P.EMAIL_PROFESOR
    FROM PROFESORES P JOIN OPOSITOR_ACADEMIA_PROFESOR OAP ON(P.COD_PROFESOR = OAP.COD_PROFESOR)
    WHERE OAP.COD_ACADEMIA = ACADEMIA;
    REGPROF C1%ROWTYPE;
    
    CURSOR C2 (PROFESOR NUMBER) IS SELECT O.NOM_OPOSITOR, O.APE_OPOSITOR, O.FECHA_NAC

    COD ACADEMIAS.COD_ACADEMIA%TYPE;
    NOM ACADEMIAS.NOM_ACADEMIA%TYPE;
BEGIN

    COD:='&DIEME_ELCODIGO_DE_LA_ACADEMIA';
   SELECT NOM_ACADEMIA INTO NOM FROM ACADEMIAS WHERE COD_ACADEMIA = COD;
    OPEN C1;
     DBMS_OUTPUT.PUT_LINE('NOMBRE DE LA ACADEMIA: ' || NOM);
    LOOP
    FETCH C1 INTO REGPROF;
    EXIT WHEN C1%NOTFOUND;
    IF COD = REGPROF.COD_ACADEMIA THEN
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------------------------------------------');
    DBMS_OUTPUT.PUT_LINE('PROFESOR: '||REGPROF.NOM_PROFESOR);
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------------------------------------------');
    DBMS_OUTPUT.PUT_LINE('NOMBRE ALUMNO          APELLIDOS ALUMNO         FECHA NACIMIENTO');
        OPEN C2;
        LOOP
            FETCH C2 INTO REGOPO;
            EXIT WHEN C2%NOTFOUND;
            IF REGPROF.COD_OPOSITOR = REGOPO.COD_OPOSITOR THEN
            DBMS_OUTPUT.PUT_LINE(RPAD(REGOPO.NOM_OPOSITOR,12) || 
                                                            RPAD(REGOPO.APE_OPOSITOR,12) || 
                                                            TO_CHAR(REGOPO.FECHA_NAC));
            END IF;
        END LOOP;
        CLOSE C2;
    END IF;
    END LOOP;
    CLOSE C1;
END;