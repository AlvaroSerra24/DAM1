/*1. Obtener APELLIDOS y NOMBRE en un solo campo, que se llamará NOMBRE COMPLETO y la población, de la tabla ALUMNOS, de los alumnos que vivan en TALAVERA, ordenado alfabéticamente por APELLIDOS. ¿Ves algo mejorable?*/
SELECT CONCAT (NOMBRE, APELLIDOS) "NOMBRE COMPLETO",
                POBLACION
FROM ALUMNOS
WHERE TRIM(POBLACION) LIKE 'TALAVERA' OR
                 TRIM(POBLACION) LIKE 'TALAVERA DE LA REINA'
ORDER BY APELLIDOS;
/*2. Obtener el NOMBRE en mayúsculas, CURSO y el NIVEL en minúsculas de la tabla ALUMNOS, de los alumnos que estén en el segundo curso de un ciclo formativo, ordenado de tal forma que aparezcan primero los alumnos de grado superior.*/
SELECT UPPER(NOMBRE), CURSO, LOWER(NIVEL)
FROM ALUMNOS
WHERE CURSO=2 AND TRIM (NIVEL) LIKE 'CFG%'
ORDER BY NIVEL DESC;
/*3. Mostrar NOMBRE, POBLACION (con sólo la primera letra en mayúsculas) y PROVINCIA (en minúsculas), de la tabla ALUMNOS, de aquellos alumnos, que tengan un nombre compuesto. No se pueden utilizar comodines.*/
SELECT INITCAP(NOMBRE), INITCAP(POBLACION), LOWER(PROVINCIA)
FROM ALUMNOS
WHERE INSTR(TRIM(NOMBRE),' ')>0;
/*4. Obtener la mejor nota (MEJOR Nota) y la peor nota (PEOR Nota), obtenida por los alumnos en cada una de las evaluaciones, de la tabla NOTAS_ALUMNOS.*/
SELECT MAX(NOTA1) "MEJOR 1º EVA", MIN(NOTA1) "PEOR 1º EVA",
                 MAX(NOTA2) "MEJOR 2º EVA", MIN(NOTA2) "PEOR 2º EVA",
                  MAX(NOTA3) "MEJOR 3º EVA", MIN(NOTA3) "PEOR 3º EVA"
FROM NOTAS_ALUMNOS;
/*5. Obtener APELLIDOS y NOMBRE en un solo campo, que se llamará NOMBRE COMPLETO, de la tabla ALUMNOS. El campo APELLIDOS tendrá una longitud de 20 caracteres (si el campo ocupa menos de 20 caracteres rellenaremos con el carácter ‘.’ hasta completar los 20 caracteres). No se puede utilizar la función CONCAT
MARTIN SANCHEZ......BLANCA*/
SELECT RPAD(APELLIDOS,20,'.') | | TRIM(NOMBRE) "NOMBRE COMPLETO"
FROM ALUMNOS;
/*6. Obtener TEMA de la tabla LIBRERIAS de los temas que empiecen por ‘GEO’ y acaben en ‘ia’ y tengan entre 5 y 20 ejemplares.*/
SELECT TEMA
FROM LIBRERIAS
WHERE UPPER(TRIM(TEMA)) LIKE 'GEO%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%ia' AND 
                 EJEMPLARES BETWEEN 5 AND 20;
/*7. Obtener cuantos TEMAS de la tabla LIBRERIAS de los temas que empiecen por ‘geo’ y acaben en ‘ia’ y tengan entre 5 y 20 ejemplares.*/
SELECT COUNT(TEMA)
FROM LIBRERIAS
WHERE LOWER(TRIM(TEMA)) LIKE 'geo%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%ia' AND 
                 EJEMPLARES BETWEEN 5 AND 20;
/*8. Obtener TEMA y cuantos TEMAS de la tabla LIBRERIAS de los temas que empiecen por ‘geo’ y acaben en ‘fia’ y tengan entre 5 y 20 ejemplares. ¿Qué resultados obtienes? Explica el resultado obtenido.*/
SELECT TEMA, COUNT(TEMA)
FROM LIBRERIAS
WHERE LOWER(TRIM(TEMA)) LIKE 'geo%' AND 
                 LOWER(TRIM(TEMA)) LIKE '%fia' AND 
                 EJEMPLARES BETWEEN 5 AND 20
GROUP BY TEMA;
/*9. Obtener el NOMBRE, DIRECCION y PROVINCIA de la tabla ALUMNOS, de los alumnos que vivan en la provincia de TOLEDO y que no vivan en el número de 20 de su calle o avenida.*/
SELECT NOMBRE, DIRECCION, PROVINCIA
FROM ALUMNOS
WHERE PROVINCIA LIKE 'TOLEDO' AND 
                SUBSTR(TRIM(DIRECCION), LENGTH(TRIM(DIRECCION))-2, 3) NOT LIKE '%20';
/*10. Obtener la media de las faltas, de todos los alumnos, de la primera evaluación con dos decimales (MEDIA FALTAS 1ª EVALUACIÓN), la suma de las faltas de todos los alumnos, de la segunda evaluación (SUMA FALTAS SEGUNDA EVALUACION), el número de alumnos que tenemos actualmente (TOTAL ALUMNOS), de la tabla ALUMNOS.*/
SELECT ROUND(AVG(FALTAS1),2) "MEDIA FALTAS",
                SUM(FALTAS2) "SUMA",
                COUNT(*)
FROM ALUMNOS;
/*11. Obtener el NOMBRE, APELLIDOS, POBLACIÓN y la media de faltas, redondeado al entero superior de la tabla ALUMNOS, de los alumnos que tengan una media más de un tres, y menos de un 7, que se llamen ‘BLANCA’ de nombre, vivan en ‘TORRIJOS’ y se apelliden ‘LOPEZ’.*/
SELECT NOMBRE, APELLIDOS, POBLACION, CEIL((FALTAS1+FALTAS2+FALTAS3)/3) "MEDIA FALTAS"
FROM ALUMNOS
WHERE (FALTAS1+FALTAS2+FALTAS3)/3 BETWEEN 3 AND 7
                 AND TRIM(NOMBRE) LIKE 'BLANCA'
                 AND TRIM(POBLACION) LIKE 'TORRIJOS'
                 AND TRIM(APELLIDOS) LIKE '%LOPEZ%';
/*12. Obtener el mayor y el menor número de faltas en la tercera evaluación.*/
SELECT MAX(FALTAS3), MIN(FALTAS3) "FALTAS"
FROM ALUMNOS;
/*13. Obtener la media de las faltas, de todos los alumnos, de la tercera evaluación con dos decimales. No se puede utilizar la función AVG.*/
SELECT SUM(FALTAS3)/COUNT(*)
FROM ALUMNOS;
/*14. Obtener NOMBRE, APELLIDOS, DIRECCIÓN, POBLACION, PROVINCIA, además tendrás que mostrar el CURSO y la CLASE en un solo campo que se llamará GRUPO y la media de faltas de cada alumno, que se llamará FALTAS, de la tabla ALUMNOS, de los alumnos que tengan una media de faltas superior a 5 faltas, ordenado por la media de las faltas. El NOMBRE y los APELLIDOS, aparecerán con la primera letra en mayúscula y el resto en minúscula.
La POBLACION, la PROVINCIA y la DIRECCIÓN, aparecerán en mayúsculas.
CURSO y CLASE, es decir GRUPO, aparecerá en minúsculas de la siguiente forma: ‘2ºc’
La media de faltas, es decir FALTAS, aparecerá con dos decimales.*/
SELECT INITCAP(NOMBRE), INITCAP(APELLIDOS), UPPER(DIRECCION), UPPER(POBLACION), UPPER(PROVINCIA),
                CONCAT (CURSO, CONCAT('º', LOWER(CLASE))) "GRUPO",
                ROUND (((FALTAS1+FALTAS2+FALTAS3)/3),2) "MEDIA FALTAS"
FROM ALUMNOS
WHERE ((FALTAS1+FALTAS2+FALTAS3)/3) >5
ORDER BY 7;
/*15. Obtener sólo los APELLIDOS y la nota media de las tres evaluaciones, que se llamará NOTA MEDIA de la tabla NOTAS_ALUMNOS, de aquellos alumnos que hayan aprobado todas las evaluaciones. Ordenado alfabéticamente por APELLIDOS.
La NOTA MEDIA será el valor al entero inmediatamente superior a la nota media obtenida, y los APELLIDOS aparecerán sin la coma al final.*/
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
/*18. Obtener NOMBRE, APELLIDOS y el segundo APELLIDO, que se llamara SEGUNDO APELLIDO de la tabla ALUMNOS, de los alumnos que tengan de segundo apellido ‘martin’.
Aunque el criterio de selección sea en minúsculas, el SEGUNDO APELLIDO debe aparecer en mayúsculas en la salida.
Realizar la consulta sin comodines.*/
SELECT NOMBRE, APELLIDOS, 
                SUBSTR(APELLIDOS, INSTR(APELLIDOS,' ')+1) "SEGUNDO APELLIDO"
FROM ALUMNOS
WHERE LOWER (SUBSTR(APELLIDOS, INSTR(APELLIDOS,' ')+1)) LIKE 'martin';
/*19. Obtener NOMBRE y APELLIDOS de la tabla ALUMNOS, de los alumnos que tengan de primer apellido ‘martin’.
Aunque el criterio de selección sea en minúsculas, el SEGUNDO APELLIDO debe aparecer en mayúsculas en la salida.
Realizar la consulta sin comodines.*/
SELECT NOMBRE, APELLIDOS
FROM ALUMNOS
WHERE LOWER(SUBSTR(APELLIDOS,1,INSTR(APELLIDOS,' ')-1)) LIKE 'martin';
/*20. Obtener la fecha actual de dos formas diferentes, compara los resultados.*/
SELECT TO_CHAR(SYSDATE,'DD month YYYY'),
                TO_CHAR(SYSDATE,'DAY, DD/MM/YYYY')
FROM DUAL;
/*21. Obtener NOMBRE, APELLIDOS y FECHA_NAC, en la salida aparecerá como FECHA DE NACIMIENTO, de la tabla ALUMNOS, ordenado por fecha, de tal forma que aparezcan en primer lugar las fechas más recientes.*/
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
/*23. Obtener NOMBRE, APELLIDOS y FECHA_NAC, en la salida aparecerá como FECHA DE NACIMIENTO, así como el nombre del mes y el número de días del mes en el que nacieron cada uno de los alumnos, de la tabla ALUMNOS, ordenado por fecha, de tal forma que aparezcan en primer lugar las fechas más recientes.*/
SELECT NOMBRE, APELLIDOS, FECHA_NAC "FECHA DE NACIMIENTO", 
                TO_CHAR(FECHA_NAC,'month') "MES DE NACIMINETO",
                TO_CHAR(FECHA_NAC,'DD') "DIA DE NACIMIENTO"
FROM ALUMNOS
ORDER BY FECHA_NAC DESC;
