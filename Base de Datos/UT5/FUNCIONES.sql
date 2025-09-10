/*1. Obtener APELLIDOS y NOMBRE en un solo campo, que se llamar� NOMBRE COMPLETO y la poblaci�n, de la tabla ALUMNOS, de los alumnos que vivan en TALAVERA, ordenado alfab�ticamente por APELLIDOS. �Ves algo mejorable?*/
SELECT CONCAT (NOMBRE, APELLIDOS) "NOMBRE COMPLETO",
                POBLACION
FROM ALUMNOS
WHERE TRIM(POBLACION) LIKE 'TALAVERA' OR
                 TRIM(POBLACION) LIKE 'TALAVERA DE LA REINA'
ORDER BY APELLIDOS;
/*2. Obtener el NOMBRE en may�sculas, CURSO y el NIVEL en min�sculas de la tabla ALUMNOS, de los alumnos que est�n en el segundo curso de un ciclo formativo, ordenado de tal forma que aparezcan primero los alumnos de grado superior.*/
SELECT UPPER(NOMBRE), CURSO, LOWER(NIVEL)
FROM ALUMNOS
WHERE CURSO=2 AND TRIM (NIVEL) LIKE 'CFG%'
ORDER BY NIVEL DESC;
/*3. Mostrar NOMBRE, POBLACION (con s�lo la primera letra en may�sculas) y PROVINCIA (en min�sculas), de la tabla ALUMNOS, de aquellos alumnos, que tengan un nombre compuesto. No se pueden utilizar comodines.*/
SELECT INITCAP(NOMBRE), INITCAP(POBLACION), LOWER(PROVINCIA)
FROM ALUMNOS
WHERE INSTR(TRIM(NOMBRE),' ')>0;
/*4. Obtener la mejor nota (MEJOR Nota) y la peor nota (PEOR Nota), obtenida por los alumnos en cada una de las evaluaciones, de la tabla NOTAS_ALUMNOS.*/
SELECT MAX(NOTA1) "MEJOR 1� EVA", MIN(NOTA1) "PEOR 1� EVA",
                 MAX(NOTA2) "MEJOR 2� EVA", MIN(NOTA2) "PEOR 2� EVA",
                  MAX(NOTA3) "MEJOR 3� EVA", MIN(NOTA3) "PEOR 3� EVA"
FROM NOTAS_ALUMNOS;
/*5. Obtener APELLIDOS y NOMBRE en un solo campo, que se llamar� NOMBRE COMPLETO, de la tabla ALUMNOS. El campo APELLIDOS tendr� una longitud de 20 caracteres (si el campo ocupa menos de 20 caracteres rellenaremos con el car�cter �.� hasta completar los 20 caracteres). No se puede utilizar la funci�n CONCAT
MARTIN SANCHEZ......BLANCA*/
SELECT RPAD(APELLIDOS,20,'.') | | TRIM(NOMBRE) "NOMBRE COMPLETO"
FROM ALUMNOS;
/*6. Obtener TEMA de la tabla LIBRERIAS de los temas que empiecen por �GEO� y acaben en �ia� y tengan entre 5 y 20 ejemplares.*/
SELECT TEMA
FROM LIBRERIAS
WHERE UPPER(TRIM(TEMA)) LIKE 'GEO%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%ia' AND 
                 EJEMPLARES BETWEEN 5 AND 20;
/*7. Obtener cuantos TEMAS de la tabla LIBRERIAS de los temas que empiecen por �geo� y acaben en �ia� y tengan entre 5 y 20 ejemplares.*/
SELECT COUNT(TEMA)
FROM LIBRERIAS
WHERE LOWER(TRIM(TEMA)) LIKE 'geo%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%ia' AND 
                 EJEMPLARES BETWEEN 5 AND 20;
/*8. Obtener TEMA y cuantos TEMAS de la tabla LIBRERIAS de los temas que empiecen por �geo� y acaben en �fia� y tengan entre 5 y 20 ejemplares. �Qu� resultados obtienes? Explica el resultado obtenido.*/
SELECT TEMA, COUNT(TEMA)
FROM LIBRERIAS
WHERE LOWER(TRIM(TEMA)) LIKE 'geo%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%fia' AND 
                 EJEMPLARES BETWEEN 5 AND 20
GROUP BY TEMA;
/*9. Obtener el NOMBRE, DIRECCION y PROVINCIA de la tabla ALUMNOS, de los alumnos que vivan en la provincia de TOLEDO y que no vivan en el n�mero de 20 de su calle o avenida.*/
SELECT NOMBRE, DIRECCION, PROVINCIA
FROM ALUMNOS
WHERE PROVINCIA LIKE 'TOLEDO' AND 
                SUBSTR(TRIM(DIRECCION), LENGTH(TRIM(DIRECCION))-2, 3) NOT LIKE '%20';
/*10. Obtener la media de las faltas, de todos los alumnos, de la primera evaluaci�n con dos decimales (MEDIA FALTAS 1� EVALUACI�N), la suma de las faltas de todos los alumnos, de la segunda evaluaci�n (SUMA FALTAS SEGUNDA EVALUACION), el n�mero de alumnos que tenemos actualmente (TOTAL ALUMNOS), de la tabla ALUMNOS.*/
SELECT ROUND(AVG(FALTAS1),2) "MEDIA FALTAS",
                SUM(FALTAS2) "SUMA",
                COUNT(*)
FROM ALUMNOS;
/*11. Obtener el NOMBRE, APELLIDOS, POBLACI�N y la media de faltas, redondeado al entero superior de la tabla ALUMNOS, de los alumnos que tengan una media m�s de un tres, y menos de un 7, que se llamen �BLANCA� de nombre, vivan en �TORRIJOS� y se apelliden �LOPEZ�.*/
SELECT NOMBRE, APELLIDOS, POBLACION, CEIL((FALTAS1+FALTAS2+FALTAS3)/3) "MEDIA FALTAS"
FROM ALUMNOS
WHERE (FALTAS1+FALTAS2+FALTAS3)/3 BETWEEN 3 AND 7
                 AND TRIM(NOMBRE) LIKE 'BLANCA'
                 AND TRIM(POBLACION) LIKE 'TORRIJOS'
                 AND TRIM(APELLIDOS) LIKE '%LOPEZ%';
/*12. Obtener el mayor y el menor n�mero de faltas en la tercera evaluaci�n.*/
SELECT MAX(FALTAS3), MIN(FALTAS3) "FALTAS"
FROM ALUMNOS;
/*13. Obtener la media de las faltas, de todos los alumnos, de la tercera evaluaci�n con dos decimales. No se puede utilizar la funci�n AVG.*/
SELECT SUM(FALTAS3)/COUNT(*)
FROM ALUMNOS;
/*14. Obtener NOMBRE, APELLIDOS, DIRECCI�N, POBLACION, PROVINCIA, adem�s tendr�s que mostrar el CURSO y la CLASE en un solo campo que se llamar� GRUPO y la media de faltas de cada alumno, que se llamar� FALTAS, de la tabla ALUMNOS, de los alumnos que tengan una media de faltas superior a 5 faltas, ordenado por la media de las faltas. El NOMBRE y los APELLIDOS, aparecer�n con la primera letra en may�scula y el resto en min�scula.
La POBLACION, la PROVINCIA y la DIRECCI�N, aparecer�n en may�sculas.
CURSO y CLASE, es decir GRUPO, aparecer� en min�sculas de la siguiente forma: �2�c�
La media de faltas, es decir FALTAS, aparecer� con dos decimales.*/
SELECT INITCAP(NOMBRE), INITCAP(APELLIDOS), UPPER(DIRECCION), UPPER(POBLACION), UPPER(PROVINCIA),
                CONCAT (CURSO, CONCAT('�', LOWER(CLASE))) "GRUPO",
                ROUND (((FALTAS1+FALTAS2+FALTAS3)/3),2) "MEDIA FALTAS"
FROM ALUMNOS
WHERE ((FALTAS1+FALTAS2+FALTAS3)/3) >5
ORDER BY 7;
/*15. Obtener s�lo los APELLIDOS y la nota media de las tres evaluaciones, que se llamar� NOTA MEDIA de la tabla NOTAS_ALUMNOS, de aquellos alumnos que hayan aprobado todas las evaluaciones. Ordenado alfab�ticamente por APELLIDOS.
La NOTA MEDIA ser� el valor al entero inmediatamente superior a la nota media obtenida, y los APELLIDOS aparecer�n sin la coma al final.*/
SELECT SUBSTR(NOMBRE_ALUMNO, 1, INSTR(NOMBRE_ALUMNO,',')-1 ) "APELLIDOS",
                CEIL((NOTA1+NOTA2+NOTA3)/3) "NOTA MEDIA"
FROM NOTAS_ALUMNOS;
/*16. Una vez hayas realizado la consulta del apartado anterior, realiza la misma consulta cambiando que la NOTA MEDIA sea el valor al entero inmediatamente inferior a la nota media obtenida. Observa los resultados obtenidos.*/
SELECT SUBSTR(NOMBRE_ALUMNO, 1, INSTR(NOMBRE_ALUMNO,',')-1 ) "APELLIDOS",
                FLOOR((NOTA1+NOTA2+NOTA3)/3) "NOTA MEDIA"
FROM NOTAS_ALUMNOS;
/*17. Una vez hayas realizado la consulta del apartado anterior, realiza la misma consulta cambiando que la NOTA MEDIA se redondee a dos decimales. Observa los resultados obtenidos.*/
SELECT SUBSTR(NOMBRE_ALUMNO, 1, INSTR(NOMBRE_ALUMNO,',')-1 ) "APELLIDOS",
                ROUND(((NOTA1+NOTA2+NOTA3)/3),2) "NOTA MEDIA"
FROM NOTAS_ALUMNOS;
/*18. Obtener NOMBRE, APELLIDOS y el segundo APELLIDO, que se llamara SEGUNDO APELLIDO de la tabla ALUMNOS, de los alumnos que tengan de segundo apellido �martin�.
Aunque el criterio de selecci�n sea en min�sculas, el SEGUNDO APELLIDO debe aparecer en may�sculas en la salida.
Realizar la consulta sin comodines.*/
SELECT NOMBRE, APELLIDOS, 
                SUBSTR(APELLIDOS, INSTR(APELLIDOS,' ')+1) "SEGUNDO APELLIDO"
FROM ALUMNOS
WHERE LOWER (SUBSTR(APELLIDOS, INSTR(APELLIDOS,' ')+1)) LIKE 'martin';
/*19. Obtener NOMBRE y APELLIDOS de la tabla ALUMNOS, de los alumnos que tengan de primer apellido �martin�.
Aunque el criterio de selecci�n sea en min�sculas, el SEGUNDO APELLIDO debe aparecer en may�sculas en la salida.
Realizar la consulta sin comodines.*/
SELECT NOMBRE, APELLIDOS
FROM ALUMNOS
WHERE LOWER(SUBSTR(APELLIDOS,1,INSTR(APELLIDOS,' ')-1)) LIKE 'martin';
/*20. Obtener la fecha actual de dos formas diferentes, compara los resultados.*/
SELECT TO_CHAR(SYSDATE,'DD month YYYY'),
                TO_CHAR(SYSDATE,'DAY, DD/MM/YYYY')
FROM DUAL;
/*21. Obtener NOMBRE, APELLIDOS y FECHA_NAC, en la salida aparecer� como FECHA DE NACIMIENTO, de la tabla ALUMNOS, ordenado por fecha, de tal forma que aparezcan en primer lugar las fechas m�s recientes.*/
SELECT NOMBRE, APELLIDOS, FECHA_NAC "FECHA DE NACIMINETO"
FROM ALUMNOS
ORDER BY FECHA_NAC DESC;
/*22. Obtener la fecha de hoy para que aparezca con los siguientes formatos:*/
SELECT TO_CHAR(SYSDATE, 'month DD, YYYY'), 
                TO_CHAR(SYSDATE, 'MM-DD-YY'),
                TO_CHAR(SYSDATE,'MM'),
                TO_CHAR(SYSDATE,'YY'),
                TO_CHAR(SYSDATE,'YYYY'),
                TO_CHAR(SYSDATE,'mon'),
                TO_CHAR(SYSDATE,'MON')
FROM DUAL;
/*23. Obtener NOMBRE, APELLIDOS y FECHA_NAC, en la salida aparecer� como FECHA DE NACIMIENTO, as� como el nombre del mes y el n�mero de d�as del mes en el que nacieron cada uno de los alumnos, de la tabla ALUMNOS, ordenado por fecha, de tal forma que aparezcan en primer lugar las fechas m�s recientes.*/
SELECT NOMBRE, APELLIDOS, FECHA_NAC "FECHA DE NACIMIENTO", 
                TO_CHAR(FECHA_NAC,'month') "MES DE NACIMINETO",
                TO_CHAR(FECHA_NAC,'DD') "DIA DE NACIMIENTO"
FROM ALUMNOS
ORDER BY FECHA_NAC DESC;
