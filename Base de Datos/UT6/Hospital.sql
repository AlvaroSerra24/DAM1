--1 Modifica a 60 el n�mero de camas de la sala Cardiolog�a del Hospital General.
UPDATE SALA
SET NUM_CAMA=60
WHERE HOSPITAL_COD = (SELECT HOSPITAL_COD
FROM HOSPITAL WHERE NOMBRE LIKE 'General') AND 
NOMBRE LIKE 'Cardiolog�a';

--2 Aumenta el sueldo un 10% a los doctores del Hospital La Paz.
UPDATE PLANTILLA
SET SALARIO=(SALARIO*10)/100
WHERE HOSPITAL_COD = (SELECT HOSPITAL_COD 
FROM HOSPITAL WHERE NOMBRE LIKE 'La Paz');

--3 La nueva direcci�n del Hospital San Carlos en Av. Universitaria. 
UPDATE HOSPITAL
SET DIRECCION = 'Av. Universitaria'
WHERE NOMBRE LIKE 'San Carlos';

--4. Modifica el turno de tarde a turno de ma�ana de los enfermeros que trabajen en el mismo hospital que el doctor Cajal R. (Consulta la tabla de doctores).
UPDATE PLANTILLA
SET TURNO = 'M'
WHERE HOSPITAL_COD = (SELECT HOSPITAL_COD 
FROM DOCTOR WHERE APELLIDO = 'Cajal R.') AND FUNCION = 'Enfermero';

--5. El n�mero de camas del hospital San Carlos ahora es el doble del numero de camas de la Sala de Recuperaci�n del Hospital La Paz. Realiza la modificaci�n SIN utilizar HOSPITAL_COD=22.
UPDATE HOSPITAL
SET NUM_CAMAS= (
SELECT 2*NUM_CAMAS
FROM SALA
WHERE HOSPITAL_COD = (SELECT HOSPITAL_COD
FROM HOSPITAL WHERE NOMBRE = 'La Paz')
AND NOMBRE='RECUPERACION')
WHERE NOMBRE = 'San Carlos';

--6 EL ENFERMO CON NUMERO DE INSCRIPCI�N 38702 SE HA MUDADO Y AHORA VIVE EN LA MISMA DIRECCI�N DONDE SE ENCUENTRA EL HOSPITAL PROVINCIAL
UPDATE ENFERMO
SET DIRECCION = (SELECT DIRECCION FROM HOSPITAL
WHERE NOMBRE = 'Provincial')
WHERE INSCRIPCION = 38702;

--7 Cambiar el turno de tarde a turno de ma�ana para los enfermeros que trabajen en el hospital General. 
UPDATE PLANTILLA
SET TURNO = 'M'
WHERE FUNCION LIKE 'Enfermera' AND HOSPITAL_COD = (
SELECT HOSPITAL_COD FROM HOSPITAL WHERE NOMBRE LIKE 'General');

--8. Han aumentado el sueldo un 10% a los doctores que trabajan en turno de noche. Realiza las modificaciones. 
UPDATE PLANTILLA
SET SALARIO=(SALARIO*10)/100
WHERE TURNO LIKE 'T';

--9. Han modificado el numero de camas de la sala de Maternidad del Hospital de La Paz. Debes restarle al numero de camas de esa sala la media de camas del hospital General 
--y sumarle el doble de camas de la sala de Cuidados intensivos del Hospital Provincial. 
UPDATE SALA
SET NUM_CAMA= NUM_CAMA - (
SELECT AVG(NUM_CAMA) FROM HOSPITAL WHERE NOMBRE LIKE 'General') + 
(SELECT NUM_CAMA*2 FROM SALA WHERE NOMBRE LIKE 'Cuidados intensivos' AND HOSPITAL_COD = (SELECT HOSPITAL_COD 
FROM HOSPITAL WHERE NOMBRE LIKE 'Provincial'))
WHERE NOMBRE LIKE 'Maternidad' AND
HOSPITAL_COD = (SELECT HOSPITAL_COD FROM HOSPITAL WHERE NOMBRE LIKE 'La Paz');

--10. Ha ingresado una nueva enferma, que viv�a con la enferma Valentina Serrano, en el hospital San Carlos. 
--Ingr�salo realizando dos consultas dentro del comando VALUES.
INSERT INTO ENFERMO
VALUES(19902, 'Romero A.', (SELECT DIRECCION 
FROM ENFERMO WHERE APELLIDO = 'Serrano V.'), '01/03/1942', 
'F', 470294390, (SELECT HOSPITAL_COD
FROM HOSPITAL
WHERE NOMBRE = 'San Carlos'));

--11. Ma�ana le realizan a una mujer llamada Carmen Cuesta una operaci�n de coraz�n en el Hospital en el que trabaja Hernesto Frank. 
--Ins�rtala donde corresponda.  (No utilices HOSPITAL_COD= 45).
INSERT INTO ENFERMO
VALUES(2134214,'Cuesta C.', 'Av. Carrasco, 20', '20/10/1986','F',1324525621, (SELECT HOSPITAL_COD))