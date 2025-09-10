SET SERVEROUTPUT ON
SET VERIFY OFF
/*1. Crear una funci�n almacenada que reciba un n�mero de almac�n y que devuelva true si
existe en la BD y false si no existe.*/

CREATE OR REPLACE FUNCTION EXISTE_ALMACEN (COD ALMACENES.CODALMA%TYPE)
            RETURN BOOLEAN
            IS
                CONT NUMBER(1):=0;
            BEGIN
                    --REALIZAR SELECT PARA VER SI EEXISTE ALMAC�N.
                    SELECT COUNT(*) INTO CONT
                    FROM ALMACENES
                    WHERE COD=CODALMA;
                    
                    IF CONT>0 THEN RETURN TRUE;
                    ELSE RETURN FALSE;
                    END IF;
                                       
                    --RETURN CONT>0;
            END;
            
            DECLARE
            --EXISTE BOOLEAN:=FALSE;
            BEGIN
                IF EXISTE_ALMACEN(0) THEN
                    DBMS_OUTPUT.PUT_LINE('EL ALMACEN EXISTE');
                ELSE
                    DBMS_OUTPUT.PUT_LINE('EL ALMACEN NO EXISTE');
                END IF;
            END;
            
/*2. Realiza una procedure almacenada para insertar datos en la tabla almacenes. La procedure
recibe los datos del almac�n. La procedure har� uso de la funci�n anterior para comprobar
que existe el almac�n. Si no existe el almac�n se insertar� un reg en la BD, pero antes hay
que comprobar que el nombre y la poblaci�n sean distintas de null, y que la facturaci�n sea
mayor que 0.
Visualizar los mensajes que correspondan de lo que ocurra (almac�n ya existe, la poblaci�n
no puede ser nula, la facturaci�n debe ser mayor que 0, etc ...).*/

CREATE OR REPLACE
PROCEDURE INSERTA_ALMACEN (COD ALMACENES.CODALMA%TYPE,
                                                                    NOMBRE_A ALMACENES.NOMBRE%TYPE,
                                                                    POB_A ALMACENES.POBLACION%TYPE,
                                                                    FAC_A ALMACENES.FACTURACION%TYPE) IS
         ERROR BOOLEAN:=FALSE;                                                           
BEGIN
        --COMPROBAR QUE EL ALMACEN NO EXISTE
        IF EXISTE_ALMACEN(COD) THEN
                ERROR:=TRUE;
                DBMS_OUTPUT.PUT_LINE('EL CODIGO DE ALMAC�N EXISTE EN LA BD');
        ELSE
                --COMPROBAR POBLACION
                IF POB_A IS NULL THEN
                    ERROR:=TRUE;
                    DBMS_OUTPUT.PUT_LINE('LA POBLACI�N NO DEBE SER NULA');
                ELSE
                    --COMPROBAR NOMBRE
                        IF NOMBRE_A IS NULL THEN
                            ERROR:=TRUE;
                            DBMS_OUTPUT.PUT_LINE('EL NOMBRE NO DEBE SER NULO');
                            ELSE
                                    IF FAC_A<0 THEN
                                        ERROR:=TRUE;
                                        DBMS_OUTPUT.PUT_LINE('LA FACTURACI�N DEBE SER MAYOR QUE 0');
                                    END IF;
                        END IF;
                END IF;
        END IF;
        
        IF NOT ERROR THEN
            INSERT INTO ALMACENES VALUES (COD, NOMBRE_A, POB_A, FAC_A);
            DBMS_OUTPUT.PUT_LINE('ALMAC�N ' || COD|| 'INSERTADO');
        END IF;
END;

-- PRUEBAS
--CASO SIN ERRORES
EXEC INSERTA_ALMACEN(9, 'Almacen 9', 'Talavera', 2000);
EXEC INSERTA_ALMACEN(9, 'Almacen 9', 'Talavera', 2000);
EXEC INSERTA_ALMACEN(10, null, 'Talavera', 2000);
EXEC INSERTA_ALMACEN(10, 'Almacen 9', null, 2000);
EXEC INSERTA_ALMACEN(10, 'Almacen 10', 'Talavera', -2000);

/*3. Crear una funci�n almacenada que reciba de par�metro un n�mero de almac�n y una
subida de salario. La funci�n deber� actualizar el salario de los empleados de ese almac�n y
devolver� el n�mero de empleados actualizados. La actualizaci�n consistir� en sumar la
subida al salario.*/

CREATE OR REPLACE FUNCTION SUBIDA_SUELDO(COD_A EMPLEADOS.CODALMA%TYPE,
                                                                                                    SUBIDA NUMBER) RETURN NUMBER IS
                                                                                                    
BEGIN
    IF EXISTE_ALMACEN(COD_A) THEN
        DBMS_OUTPUT.PUT_LINE('EL ALMAC�N NO EXISTE');
        RETURN 0;
    ELSE
        IF SUBIDA <0 THEN
            DBMS_OUTPUT.PUT_LINE('LA SUBIDA DEBE SER MAYOR QUE 0');
            RETURN 0;
        ELSE
            -- HACER LA MODIFICACI�N EN TABLAS
            UPDATE EMPLEADOS SET SALARIO=SALARIO+SUBIDA
            WHERE CODALMA=COD_A;
            RETURN SQL%ROWCOUNT;
            
        END IF;
    END IF;
    
    
END;

DECLARE
    COD_A EMPLEADOS.CODALMA%TYPE:=2;
    SUBIDA NUMBER:=100;
    NUM_EMPLES NUMBER:=0;
BEGIN
    NUM_EMPLES:=SUBIDA_SUELDO(COD_A, SUBIDA);
    DBMS_OUTPUT.PUT_LINE('SE SUBE EL SUELDO ' ||SUBIDA||' A '||NUM_EMPLES||' EMPLEADOS');
END;

/*5. Crea una procedure almacenada que reciba un c�digo de almac�n y devuelva (par�metros
OUT) su nombre, su poblaci�n, el n�mero de empleados que tiene, el n�mero de compras
que ha realizado, y el total importe de todas sus compras. Esta procedure har� uso de la
funci�n del ejercicio 1 para comprobar si existe o no el almac�n.
Si el almac�n no existe debe devolver en nombre la cadena 'ALMAC�N NO EXISTE', el resto de
datos a 0 los num�ricos y null las cadenas (excepto el nombre).
Realizar un bloque PL que haga uso de esta procedure, y visualice los datos devueltos (La
procedure no debe visualizar nada).*/

CREATE OR REPLACE PROCEDURE DATOS_ALMACEN(COD IN OUT ALMACENES.CODALMA%TYPE ,
                                                                                                            NOM OUT ALMACENES.NOMBRE%TYPE ,
                                                                                                            POB OUT ALMACENES.POBLACION%TYPE ,
                                                                                                            FAC OUT ALMACENES.FACTURACION%TYPE ,
                                                                                                            NUMEMP OUT NUMBER ,
                                                                                                            NUMCOMP OUT NUMBER ,
                                                                                                            TOTAL OUT NUMBER) IS
BEGIN
    IF EXISTE_ALMACEN (COD) THEN
        SELECT NOMBRE, POBLACION, FACTURACION INTO NOM, POB, FAC
        FROM ALMACENES
        WHERE CODALMA=COD;
        
        SELECT COUNT(*) INTO NUMEMP FROM EMPLEADOS
        WHERE CODALMA=COD;
        
        SELECT COUNT(*) INTO NUMCOMP FROM COMPRAS
        WHERE CODALMA=COD;
        
        SELECT SUM(PVP*UNIDADES) INTO TOTAL
        FROM ARTICULOS JOIN DET_COMPRAS
        USING (CODARTI) JOIN COMPRAS
        USING (NUM_COMPRA)
        WHERE CODALMA=COD;
    ELSE
        NOM:='ALMACEN NO EXISTE';
        POB:=NULL;
        FAC:=0;
        NUMEMP:=0;
        NUMCOMP:=0;
        TOTAL:=0;
    END IF;
END;


DECLARE
COD  ALMACENES.CODALMA%TYPE:=1;
NOM ALMACENES.NOMBRE%TYPE:=NULL;
POB ALMACENES.POBLACION%TYPE:=NULL ;
FAC ALMACENES.FACTURACION%TYPE:=0;
NUMEMP NUMBER:=0 ;
NUMCOMP NUMBER:=0; 
TOTAL NUMBER:=0;

BEGIN
    DATOS_ALMACEN(COD, NOM, POB, FAC, NUMEMP, NUMCOMP, TOTAL);
    DBMS_OUTPUT.PUT_LINE(COD || ' ' || NOM || ' ' || POB || ' ' || FAC || ' ' || NUMEMP || ' EMPLEADOS ' || 'NUMERO DE COMPRAS: ' || NUMCOMP || 
    ' TOTAL IMPORTE COMPRAS: '|| TOTAL);
END;
