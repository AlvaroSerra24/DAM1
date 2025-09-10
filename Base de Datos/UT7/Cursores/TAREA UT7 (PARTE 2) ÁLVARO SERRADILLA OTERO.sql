SET SERVEROUTPUT ON
SET VERIFY OFF
--Este bloque de PL/SQL sirve para ver todo los juegos que se encuentran en la base de datos segun su tipo
DECLARE
        CURSOR C1(TIPOS VARCHAR2) IS 
        SELECT COD_JUEGO, NOMBRE, PRECIO, DURACION, COUNT(*) NUM_JUEGOS
        FROM JUEGOS 
        WHERE TIPOS = TIPO
        GROUP BY COD_JUEGO, NOMBRE, PRECIO, DURACION;
        
        REG C1%ROWTYPE;
        
        TIPOS JUEGOS.TIPO%TYPE;
        
        CONT NUMBER:=0;
        TOTAL_JUEGOS NUMBER:=0;
BEGIN
        TIPOS:='&EL_TIPO_DEL_JUEGO';
        
        
        SELECT COUNT(*) INTO CONT FROM JUEGOS WHERE TIPOS =TIPO;
        --Los ejemplos que pùeden valer son Un jugador o Multijugador
        IF CONT>0 THEN
        DBMS_OUTPUT.PUT_LINE('COD_JUEGO                 NOMBRE                     PRECIO            DURACION');
        DBMS_OUTPUT.PUT_LINE('---------------       --------------------------      --------------      --------------');
        OPEN C1(TIPOS);
        LOOP
            FETCH C1 INTO REG;
            EXIT WHEN C1%NOTFOUND;
            
            DBMS_OUTPUT.PUT_LINE(RPAD(TO_CHAR(REG.COD_JUEGO),30,' ')||
            RPAD(REG.NOMBRE, 30,' ') ||
            RPAD(TO_CHAR(REG.PRECIO, '999D99')|| '€',30,' ') ||
            RPAD(TO_CHAR(REG.DURACION),30,' '));
            TOTAL_JUEGOS:=TOTAL_JUEGOS+REG.NUM_JUEGOS;
        END LOOP;
        
        DBMS_OUTPUT.PUT_LINE('EL NUMERO DE JUEGOS DE '|| TIPOS ||' ES: '||TOTAL_JUEGOS);
        CLOSE C1;
        --Con escribir cualquier otro tipo de juego como aventura
        ELSE 
        DBMS_OUTPUT.PUT_LINE('NO EXISTEN JUEGOS DE ESE TIPO');
        END IF;
END;