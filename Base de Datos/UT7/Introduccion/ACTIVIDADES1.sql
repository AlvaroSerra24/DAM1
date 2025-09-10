--SET SERVEROUTPUT ON       
--SET VERIFY OFF

/*1. Realizar un bloque PL para insertar registros en la tabla SUMINISTROS. El código de
proveedor y de artículo leerlo de teclado.*/
/*
DECLARE
    CODP SUMINISTROS.CODPROV%TYPE:=&PROV;
    CODA SUMINISTROS.CODARTI%TYPE:=&ARTI;
    CONT SUMINISTROS.CODPROV%TYPE:=0;
    INSERTA BOOLEAN := TRUE;
    NO_EXISTE_PROVEEDOR EXCEPTION;
    NO_EXISTE_ARTICULO EXCEPTION;
BEGIN
    SELECT COUNT(*) INTO CONT FROM PROVEEDORES WHERE CODPROV = CODP;
    
    IF (CONT = 0) THEN
        RAISE NO_EXISTE_PROVEEDOR;
    
    END IF;
    
    SELECT COUNT(*) INTO CONT FROM ARTICULOS WHERE CODARTI = CODA;
    
    IF (CONT = 0) THEN
        RAISE NO_EXISTE_ARTICULO;
    
    END IF;
        INSERT INTO SUMINISTROS VALUES (CODP, CODA);
        DBMS_OUTPUT.PUT_LINE('Suministro añadido, proveedor: '||CODP||', artículo: '||CODA);
    EXCEPTION
    WHEN NO_EXISTE_PROVEEDOR THEN
    DBMS_OUTPUT.PUT_LINE('No exixste el provedor: '|| CODP ||', no se inserta ningun suministro');
    WHEN NO_EXISTE_ARTICULO THEN 
    DBMS_OUTPUT.PUT_LINE('No existe el articulo: '|| CODA ||', no se inserta ningun suministro');
    When Dup_Val_On_Index Then
    Dbms_Output.Put_Line('Error, suministro ya existe, proveedor: ' || CODP ||', artículo:'||CODA);
END;*/

/*2. Realizar un bloque PL para insertar registros en la tabla ARTICULOS. Leer de teclado
DENOMINACIÓN, CATEGORÍA y PRECIO. Insertar un artículo en la tabla ARTICULOS, teniendo en cuenta:*/
/*
DECLARE
    denon Articulos.Denominacion%Type;
    cat Articulos.Categoria%Type;
    precio Articulos.Pvp%Type;
    inserta BOOLEAN:= TRUE;
BEGIN
    cat:='&cat';
    precio:=&precio;
    denon:='&denon';
    
    IF UPPER(cat) NOT IN ('A','B','C') THEN
    DBMS_OUTPUT.PUT_LINE('Categoria incorrecta (A,B,C)');
    inserta:= false;
    END IF;
    IF precio <= 0 THEN
    DBMS_OUTPUT.PUT_LINE('Precio debe ser > 0');
    inserta:=false;
    END IF;
    
    IF inserta THEN
    INSERT INTO ARTICULOS VALUES ((SELECT MAX(CODARTI)+1 FROM ARTICULOS),
    denon, cat, precio,
    (SELECT AVG(STOCK) FROM ARTICULOS JOIN SUMINISTROS USING(CODARTI) JOIN 
    PROVEEDORES USING(CODPROV) WHERE UPPER(ZONA)= 'CENTRO'));
    DBMS_OUTPUT.PUT_LINE('REGISTRO INSERTADO');
    END IF;
    
    EXCEPTION
        WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('ERROR');
        ROLLBACK;
END;*/

/*3. Leer de teclado la subida, la categoría y el código de almacén*/
/*
DECLARE
        subida ARTICULOS.STOCK%TYPE;
        categ ARTICULOS.CATEGORIA%TYPE;
        cod_alma ALMACENES.CODALMA%TYPE;
        cont NUMBER(1):=0;
        correcto BOOLEAN:= TRUE;
BEGIN
        cod_alma:=&codigo_almacen;
        categ:='&categoria_articulo';
        subida:=&subida_de_stock;
        
        
        -- COMPROBAMOS LA CATEGORÍA.
        IF categ NOT IN ('A','B','C') THEN
            DBMS_OUTPUT.PUT_LINE('CATEGORIA INCORRECTA. LOS VALORES SON:A,B,C');
            correcto:=FALSE;
        END IF;
        
        
        -- COMPROBAMOS EL CODIGO DEL ALMACEN (QUE EXISTA)
        SELECT COUNT(CODALMA) INTO cont FROM ALMACENES WHERE CODALMA=cod_alma;
        
        IF cont<=0 THEN
            DBMS_OUTPUT.PUT_LINE('ALMACÉN INDICADO NO EXISTE');
            correcto:=FALSE;
        END IF;
        
        --COMPROBAMOS LA SUBIDA DEL STOCK
        IF subida<=0 THEN
            DBMS_OUTPUT.PUT_LINE('LA SUBIDA DE STOCK NO PUEDE SER NEGATIVA');
            correcto:=FALSE;
        END IF;
        
        IF correcto THEN
            UPDATE ARTICULOS SET STOCK=STOCK+subida
            WHERE CATEGORIA=categ AND CODARTI IN 
                    (SELECT CODARTI FROM DET_COMPRAS JOIN COMPRAS USING (NUM_COMPRA) WHERE CODALMA=cod_alma);
        END IF;
END;
*/

/*4. Realizar un bloque PL para insertar datos en la tabla DET_COMPRAS se leen de
teclado NUM_COMPRA, CODARTI, UNIDADES.*/

DECLARE
    n_compra DET_COMPRAS.NUM_COMPRA%TYPE;
    cod_arti DET_COMPRAS.CODARTI%TYPE;
    unidades DET_COMPRAS.UNIDADES%TYPE;
    cont NUMBER(1):=0;
    correcto BOOLEAN := TRUE;
BEGIN
    n_compra := &numero_de_compras;
    cod_arti := &codigo_de_articulo;
    unidades := &numero_de_unidades;
    
    -- COMPROBAR ARTÍCULO EXISTE
    SELECT COUNT(CODARTI) INTO cont FROM ARTICULOS WHERE CODARTI=cod_arti;
    IF cont <= 0 THEN
    DBMS_OUTPUT.PUT_LINE('EL ARTICULO NO EXISTE');
        correcto:=FALSE;
    END IF;
    
     SELECT COUNT(NUM_COMPRA) INTO cont FROM COMPRAS WHERE NUM_COMPRA=n_compra;
    IF cont <= 0 THEN
    DBMS_OUTPUT.PUT_LINE('EL NÚMERO DE COMPRA NO ES CORRECTO');
        correcto:=FALSE;
    END IF;
    
    -- COMPRAS UNIDADES
    IF unidades <= 0 THEN
    DBMS_OUTPUT.PUT_LINE('EL NÚMERO DE UNIDADES NO PUEDE SER NEGATIVO');
        correcto:=FALSE;
    END IF;
    
    SELECT STOCK INTO cont FROM ARTICULOS 
    WHERE CODARTI=cod_arti;
    IF cont<unidades THEN
        DBMS_OUTPUT.PUT_LINE('NO HAY STOCK SUFICIENTE');
        correcto:=FALSE;
    END IF;
    
    IF correcto THEN
        INSERT INTO DET_COMPRAS VALUES (n_compra, cod_arti, unidades);
    END IF;
    
    EXCEPTION 
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('YA HAS COMPRADO ESE ARTICULO');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('ERROR');
END;