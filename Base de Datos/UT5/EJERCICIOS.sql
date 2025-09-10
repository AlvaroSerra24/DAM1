--1. Obtener todos los datos de la tabla ALUMNOS.--

--2. Obtener DNI, APELLIDOS y DIRECCION de la tabla ALUMNOS.--

--3. Obtener DNI, NOMBRE, APELLIDOS, FECHA_NAC, DIRECCION, POBLACION, PROVINCIA, CURSO, NIVEL, CLASE, FALTAS1, FALTAS2, FALTAS3 de la tabla de ALUMNOS.--

--4. Obtener NOMBRE, APELLIDOS Y FECHA_NAC de la tabla de ALUMNOS. En la salida queremos que el campo FECHA_NAC aparece como FECHA DE NACIMIENTO.--

--5. Obtener todos los datos de la tabla LIBRERIAS.--

--6. Obtener TEMA Y EJEMPLARES de la tabla de LIBRERIAS.--

--7. Realiza la consulta anterior con un alias para la tabla que tendrás que utilizar para identificar los campos.--

--8. Obtener todos los datos de la tabla NOTAS_ALUMNO.--

--9. Obtener NOMBRE_ALUMNO, NOTA1, NOTA2, NOTA3 de la tabla NOTAS_ALUMNO. En la salida queremos que el campo NOMBRE_ALUMNO aparezca como NOMBRE, el campo NOTA1 aparece como PRIMERA EVALUACION, el campo NOTA2 aparece como SEGUNDA EVALUACION y el campo NOTA3 aparece como TERCERA EVALUACION.--

--10. Obtener NOMBRE de la tabla de ALUMNOS. Observa el resultado. ¿Puedes realizar alguna mejora?--

--11. Obtener PROVINCIAS de la tabla de ALUMNOS.--

--12. Obtener NOMBRE y NIVEL de la tabla de ALUMNOS En la salida queremos que el campo NIVEL aparece como NIVEL ACADEMICO.--

--13. Obtener todos los datos de la tabla ALUMNOS que viven en TALAVERA--

--14. Obtener todos los datos de la tabla ALUMNOS que NO viven en TALAVERA.--

--15. Obtener el TEMA de la tabla LIBRERIAS que tengan 7 o más ejemplares, ordenados de forma decreciente por el nombre del tema.--

--16. Obtener el TEMA de la tabla LIBRERIAS que tengan más de 7 ejemplares y menos de 15 ejemplares, ordenados alfabéticamente.--

--17. Obtener el TEMA de la tabla LIBRERIAS que tengan más de 1 ejemplar y menos de 8 ejemplares y también de los que tengan más de 16 ejemplares y menos de 25 ejemplares.--

--18. Obtener el NOMBRE de la tabla NOTA ALUMNOS que no tengan nota en NOTA1.--

--19. Obtener el DNI, NOMBRE y APELLIDOS de la tabla de ALUMNOS, de aquellos alumnos que tengan una media de faltas superior a 5.--

--20. Obtener el CUROS, NOMBRE, APELLIDOS, DIRECCION, POBLACION Y PROVINCIA, de la tabla de ALUMNOS, de aquellos que estén en primer curso.--

--21. Obtener DNI, NOMBRE y APELLIDOS de los alumnos que tengan como nombre “BLANCA”.--
SELECT DNI, NOMBRE, APELLIDOS
FROM ALUMNOS
WHERE NOMBRE='BLANCA'; 

SELECT DNI, NOMBRE, APELLIDOS
FROM ALUMNOS
WHERE NOMBRE LIKE 'BLANCA'
ORDER BY APELLIDOS; 
--22. Obtener NOMBRE, APELLIDOS, DIRECCION Y FECF_NAC de la tabla ALUMNOS, de los alumnos nacidos el “07/09/1998”. La FECHA_NAC debe aparecer en la salida como FECHA DE NACIMIENTO.--
SELECT NOMBRE, APELLIDOS, DIRECCION, FECHA_NAC "FECHA DE NACIMIENTO"
FROM ALUMNOS
WHERE FECHA_NAC='07/09/1998';
--23. Obtener NOMBRE, APELLIDOS y FECF_NAC de la tabla ALUMNOS, de los alumnos nacido en 1998, ordenador por FECF_NAC decrecientemente.--
SELECT NOMBRE, APELLIDOS, FECHA_NAC
FROM ALUMNOS
WHERE FECHA_NAC >='01/01/1998' AND FECHA_NAC <='31/12/1998'
ORDER BY FECHA_NAC DESC;

SELECT NOMBRE, APELLIDOS, FECHA_NAC
FROM ALUMNOS
WHERE FECHA_NAC BETWEEN '01/01/1998' AND '31/12/1998'
ORDER BY FECHA_NAC DESC;
--24. Obtener NOMBRE y POBLACION de la tabla ALUMNOS, de los alumnos que viven en TALAVERA y ORORPESA, ordenados alfabéticamente, de forma decreciente.--
SELECT NOMBRE, POBLACION
FROM ALUMNOS
WHERE POBLACION='TALAVERA' OR POBLACION='OROPESA'
ORDER BY NOMBRE DESC;

SELECT NOMBRE, POBLACION
FROM ALUMNOS
WHERE POBLACION IN ('TALAVERA', 'OROPESA')
ORDER BY NOMBRE DESC;
--25. Obtener todos los datos de la tabla ALUMNOS, de los alumnos que NO vivan ni en TALAVERA ni en ORORPESA.--
SELECT *
FROM ALUMNOS
WHERE  POBLACION NOT IN ('TALAVERA', 'OROPESA');
--26. Obtener NOMBRE, APELLIDOS y POBLACION de la tabla ALUMNOS, de los alumnos de que NO sean de TORRIJOS. Ordenado por NOMBRE y POBLACION.--
SELECT NOMBRE, APELLIDOS, POBLACION
FROM ALUMNOS
WHERE POBLACION NOT LIKE 'TORRIJOS'
ORDER BY NOMBRE, POBLACION;
--27. Obtener todos los datos de la tabla LIBRERIAS, cuyo TEMA empiece por “GEO”.--
SELECT *
FROM LIBRERIAS
WHERE TEMA LIKE 'GEO%';
--28. Obtener NOMBRE de la tabla ALUMNOS, de los alumnos de TOLEDO. El NOMBRE debe aparecer en la salida como ALUMNOS DE TOLEDO.--
SELECT NOMBRE "ALUMNOS DE TOLEDO"
FROM ALUMNOS
WHERE PROVINCIA LIKE 'TOLEDO';
--29. Obtener DNI de la tabla ALUMNOS, de los alumnos de MADRID. El DNI debe aparecer en la salida como DNI ALUMNOS DE MADRID.--
SELECT DNI "DNI ALUMNOS DE MADRID"
FROM ALUMNOS
WHERE PROVINCIA LIKE 'MADRID';
--30. Obtener NOMBRE, APELLIDOS y NIVEL de la tabla ALUMNOS, de los alumnos de CFGM Y CFGS.--
SELECT NOMBRE, APELLIDOS, NIVEL
FROM ALUMNOS
WHERE NIVEL IN('CFGM','CFGS');
--31. Obtener NOMBRE y la suma de las tres notas, que identificaremos con el nombre de SUMA NOTAS de la tabla NOTAS_ALUMNOS, de los alumnos que su media sea igual o mayor que 5.--
SELECT  NOMBRE_ALUMNO, NOTA1+NOTA2+NOTA3 "SUMA NOTAS"
FROM NOTAS_ALUMNOS
WHERE (NOTA1+NOTA2+NOTA3)/3 >= 5 ;
--32. Obtener NOMBRE, APELLIDOS y DIRECCION de la tabla ALUMNOS, de los alumnos de que no vivan en una avenida. Ordenado por DIRECCION y APELLIDO.--
SELECT NOMBRE, APELLIDOS, DIRECCION
FROM ALUMNOS
WHERE DIRECCION NOT LIKE 'AV/%'
ORDER BY DIRECCION, APELLIDOS;
--33. Obtener el TEMA de la tabla LIBRERIAS, de aquellos temas de los que no haya ningún ejemplar. El TEMA debe aparecer en la salida como TEMA SIN EJEMPLARES. Ordenado alfabéticamente.--
SELECT TEMA"TEMA SIN EJEMPLARES"
FROM LIBRERIAS
WHERE EJEMPLARES=0
ORDER BY TEMA;
--34. Obtener el TEMA y ESTANTE de la tabla LIBRERIAS, de los estantes A y D.--
SELECT TEMA, ESTANTE
FROM LIBRERIAS
WHERE ESTANTE IN ('A','D');
--35. Obtener el TEMA y EJEMPLARES de la tabla LIBRERIAS, de DIBUJO, MEDICINA, LABORES, INFORMATICA Y GEOGRAFIA.--
SELECT TEMA, EJEMPLARES
FROM LIBRERIAS
WHERE TEMA IN ('DIBUJO','MEDICINA','LABORES','INFORMATICA','GEOGRAFIA');
--36. Obtener APELLIDOS de la tabla ALUMNOS, de los alumnos que su primer apellido empiece por la letra G. Ordenado alfabéticamente.--

--37. Obtener NOMBRE y cada una de las notas incrementadas en un 10% de la tabla NOTAS_ALUMNOS de aquellos alumnos que tengan una media de notas inferior a 6. Ordenado por las notas incrementadas.--
SELECT NOMBRE_ALUMNO, NOTA1*1.1, NOTA2*1.1, NOTA3*1.1
FROM NOTAS_ALUMNOS
WHERE (NOTA1+NOTA2+NOTA3)/3 < 6
ORDER BY 2,3,4;
--38. Obtener el NOMBRE, FALTAS1, FALTAS2 y FALTAS3 de la tabla ALUMNOS de aquellos alumnos cuyo número de FALTAS3 sea mayor que la resta de FALTAS2 de FALTAS1.--

--39. Obtener el NOMBRE, FALTAS1 multiplicado por FALTAS2, FALTAS2 multiplicado por FALTAS3 de la tabla ALUMNOS de los alumnos que el producto de FALTAS1 por FALTAS2 sea igual al producto de FALTAS2 por FALTAS3. Utiliza un alias para los productos que deben aparecer en la salida.--
