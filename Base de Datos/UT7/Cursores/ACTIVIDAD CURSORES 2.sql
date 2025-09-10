SET SERVEROUTPUT ON
SET VERIFY OFF
/*1. Visualizar por cada departamento los empleados que tiene, el total y la media de salario.  Por departamento debe salir el siguiente informe:

NUM DEPART:  xxxx  NOMBRE DEPART: xxxx  LOCALIDA: xxxxxxx
APELLIDO        OFICIO      SALARIO    FECHA_ALT
--------------- ---------------  -------------- ---------------
xxxxxxx          xxxxxxxx        xxxxxx      xxxxxx
xxxxxxx          xxxxxxxx        xxxxxx      xxxxxx
TOTAL SALARIO: xxx
MEDIA SALARIO: xxxx

NUM DEPART:  xxxx  NOMBRE DEPART: xxxx  LOCALIDA: xxxxxxx
APELLIDO        OFICIO      SALARIO    FECHA_ALT
--------------- ---------------  -------------- ---------------
xxxxxxx          xxxxxxxx        xxxxxx      xxxxxx
xxxxxxx          xxxxxxxx        xxxxxx      xxxxxx
TOTAL SALARIO: xxx
MEDIA SALARIO: xxxx*/

DECLARE
        CURSOR C1 IS SELECT * FROM DEPART;
        REGDEPART C1%ROWTYPE; --REGISTRO PARA EXTRAER LOS ELEMENTOS DE C1
        
        CURSOR C2(DEP NUMBER) IS SELECT APELLIDO, OFICIO, SALARIO, FECHA_ALT
        FROM EMPLE
        WHERE DEPT_NO=DEP;
        
        REGEMP C2%ROWTYPE;
        
        TOTAL_SALARIO NUMBER:=0;
        MEDIA NUMBER(8,2):=0;
        CONT NUMBER:=0;
BEGIN
        
        OPEN C1;
        LOOP
                FETCH C1 INTO REGDEPART;
                EXIT WHEN C1%NOTFOUND;
                DBMS_OUTPUT.PUT_LINE('NUM DEPART:'||REGDEPART.DEPT_NO||'  NOMBRE DEPART:'|| REGDEPART.DNOMBRE||'  LOCALIDA:'||REGDEPART.LOC);
                
                --LISTAR LOS EMPLEADOS DE DPTO
                OPEN C2(REGDEPART.DEPT_NO);
                LOOP
                    FETCH C2 INTO REGEMP;
                    EXIT WHEN C2%NOTFOUND;
                    DBMS_OUTPUT.PUT_LINE('   APELLIDO        OFICIO           SALARIO       FECHA_ALT');
                     DBMS_OUTPUT.PUT_LINE('---------------   ---------------    --------------   -----------------');
                     DBMS_OUTPUT.PUT_LINE(RPAD(REGEMP.APELLIDO,12,' ')||
                                                                        RPAD(REGEMP.OFICIO,12,' ')||
                                                                        RPAD(TO_CHAR(REGEMP.SALARIO,'9G999'),12,' ')||
                                                                        TO_CHAR(REGEMP.FECHA_ALT,'DD-MM-YYYY'));
                    TOTAL_SALARIO:=TOTAL_SALARIO+REGEMP.SALARIO;
                    CONT:=CONT+1;
                END LOOP;
                DBMS_OUTPUT.PUT_LINE(RPAD('=', 65, '='));
                DBMS_OUTPUT.PUT_LINE('TOTAL SALARIOS '|| TOTAL_SALARIO);
                CLOSE C2;
        END LOOP;
        CLOSE C1;
END;

