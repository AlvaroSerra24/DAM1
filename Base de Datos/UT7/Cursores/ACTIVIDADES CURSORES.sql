--SET SERVEROUTPUT ON
--SET VERIFY OFF
/*1. Programa que visualice por cada departamento: el departamento, el número de
empleados, la media de salario, el salario máximo, el salario mínimo y la suma de salarios.*/


DECLARE
        CURSOR C_EMP IS 
            SELECT DEPT_NO, COUNT(*) NUM_EMPLE, AVG(SALARIO) MEDIA_SALARIO, MAX(SALARIO) MAX_SAL,
                            MIN(SALARIO) MIN_SAL, SUM(SALARIO) SUM_SALARIOS
            FROM EMPLE
            GROUP BY DEPT_NO;
        R_EMP C_EMP%ROWTYPE;    --REGISTRO PARA PROCESOR ELEMENTOS DEL CURSOR
        TOTAL_EMPLE NUMBER(4):=0;
        TOTAL_MEDIA NUMBER(12):=0;
        TOTAL_MAX_SAL NUMBER(12):=0;
        TOTAL_MIN_SAL NUMBER(12):=0;
        TOTAL_SUM_SAL NUMBER(12):=0;
BEGIN
DBMS_OUTPUT.PUT_LINE('DEPT_NO       NUM EMPLES        MEDIA SALARIO      SALARIO MAX       SALARIO MIN       SUMA SALARIO');
DBMS_OUTPUT.PUT_LINE('------------       -----------------       ---------------------      -------------------      -----------------        -------------------');

OPEN C_EMP;

LOOP
    FETCH C_EMP INTO R_EMP;
    EXIT WHEN C_EMP%NOTFOUND;
    
    DBMS_OUTPUT.PUT_LINE(RPAD(TO_CHAR(R_EMP.DEPT_NO), 25, ' ') || 
                                                    RPAD(TO_CHAR(R_EMP.NUM_EMPLE,'99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(R_EMP.MEDIA_SALARIO, '9G999G999D99'), 37, ' ') ||
                                                    RPAD(TO_CHAR(R_EMP.MAX_SAL, '9G999G99D99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(R_EMP.MIN_SAL, '9G999G99D99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(R_EMP.SUM_SALARIOS, '9G999G99D99'), 25, ' '));
                                                    
    TOTAL_EMPLE := TOTAL_EMPLE + R_EMP.NUM_EMPLE;
        TOTAL_MEDIA := TOTAL_MEDIA + R_EMP.MEDIA_SALARIO;
        TOTAL_MAX_SAL := TOTAL_MAX_SAL + R_EMP.MAX_SAL;
        TOTAL_MIN_SAL := TOTAL_MIN_SAL + R_EMP.MIN_SAL;
        TOTAL_SUM_SAL := TOTAL_SUM_SAL + R_EMP.SUM_SALARIOS;
END LOOP;

DBMS_OUTPUT.PUT_LINE('------------       -----------------       ---------------------      -------------------      -----------------        -------------------');

DBMS_OUTPUT.PUT_LINE(RPAD('TOTALES: ', 25, ' ') || 
                                                    RPAD(TO_CHAR(TOTAL_EMPLE, '9G999G999D99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(TOTAL_MEDIA, '9G999G999D99'), 37, ' ') ||
                                                    RPAD(TO_CHAR(TOTAL_MAX_SAL, '9G999G999D99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(TOTAL_MIN_SAL, '9G999G999D99'), 25, ' ') ||
                                                    RPAD(TO_CHAR(TOTAL_SUM_SAL, '9G999G999D99'), 25, ' '));
                

CLOSE C_EMP;
END;

/*3. Realizar un bloque PL para visualizar los artículos de un número de compra leído de teclado.
Obtener
NUM COMPRA CODARTI DENOMINACION CATEGORIA UNIDADES PVP IMPORTE STOCK-ACTUAL
---------- --------- -------------- ---------- ---------- ------ -------- -------
xxxxxxxxxx xxxx xxxxxxxxxx xxxxxx xxxxx xxxx xxxxxx xxxxxxx
xxxxxxxxxx xxxx xxxxxxxxxx xxxxxx xxxxx xxxx xxxxxx xxxxxxx
---------- --------- -------------- ---------- ---------- ------ -------- -------
TOTALES DE UNIDADES: xxxxxx
TOTAl IMPORTE: xxxxxxxx
Donde IMPORTE = PVP * UNIDADES
STOCK-ACTUAl = STOCK – UNIDADES*/

DECLARE
        --CURSOR
        CURSOR C1 (NCOMP NUMBER) IS
                SELECT NUM_COMPRA, CODARTI, DENOMINACION, CATEGORIA, UNIDADES, 
                PVP,  (PVP+UNIDADES) "IMPORTE", (STOCK-UNIDADES) "STOCK_UNIDADES"
                FROM DET_COMPRAS JOIN ARTICULOS
                USING (CODARTI)
                WHERE NCOMP=NUM_COMPRA;
        --REG ELEMENTOS CURSOR
        REG C1%ROWTYPE;
        
        
        --NUMERO DE COMPRA
        NCOMP DET_COMPRAS.NUM_COMPRA%TYPE:=&NUMERO_DE_COMPRA;
        
        TOTALUNIDADES NUMBER(6):=0;
        TOTALIMPORTE NUMBER(8, 2):=0;
        
        CONT NUMBER(1):=0;
BEGIN 
            -- COMPROBAR EL NUMERO DE COMPRA EXISTE
            SELECT COUNT(*) INTO CONT FROM COMPRAS WHERE NUM_COMPRA=NCOMP;
            IF CONT>0 THEN
                    DBMS_OUTPUT.PUT_LINE('NUM COMPRA      CODARTI        DENOMINACION        CATEGORIA         UNIDADES        PVP        IMPORTE        STOCK-ACTUAL');
                    DBMS_OUTPUT.PUT_LINE('------------------      ------------         ---------------------        ----------------        --------------       ------       -----------        ---------------------');
                    OPEN C1(NCOMP);
                    
                    LOOP
                            FETCH C1 INTO REG;
                            EXIT WHEN C1%NOTFOUND;
                            
                            DBMS_OUTPUT.PUT_LINE('          ' || RPAD(TO_CHAR(REG.NUM_COMPRA),30,' ') ||
                            RPAD(TO_CHAR(REG.CODARTI),23,' ') ||
                            RPAD(REG.DENOMINACION,43,' ') ||
                            RPAD(REG.CATEGORIA,27,' ') ||
                            RPAD(TO_CHAR(REG.UNIDADES),15,' ') ||
                            RPAD(TO_CHAR(REG.PVP,'99D99')|| '€',15,' ') ||
                            RPAD(TO_CHAR(REG.IMPORTE,'99D99')|| '€',20,' ') ||
                            RPAD(TO_CHAR(REG.STOCK_UNIDADES),24,' ')                            
                            );
                    
                    
                    TOTALUNIDADES:=TOTALUNIDADES+REG.UNIDADES;
                    TOTALIMPORTE:=TOTALIMPORTE+REG.IMPORTE;
                    
                    END LOOP;
                    CLOSE C1;
                    DBMS_OUTPUT.PUT_LINE('TOTALES DE UNIDADES: ' || TO_CHAR(TOTALUNIDADES));
                    DBMS_OUTPUT.PUT_LINE('TOTAL IMPORTE: '|| TO_CHAR(TOTALIMPORTE, '9G999D99') || '€');
            ELSE
            DBMS_OUTPUT.PUT_LINE('NO EXISTE UNA FACTURA CON ESE ID');
            END IF;
            
            
END;