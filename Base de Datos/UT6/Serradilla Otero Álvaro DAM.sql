DROP TABLE PROFESORES CASCADE CONSTRAINTS;
DROP TABLE INCIDENCIAS CASCADE CONSTRAINTS;
DROP TABLE EXPULSIONES CASCADE CONSTRAINTS;
DROP TABLE ALUMNOS CASCADE CONSTRAINTS;
DROP TABLE PARTES CASCADE CONSTRAINTS;
DROP TABLE PARTES_EXPULSION CASCADE CONSTRAINTS;


CREATE TABLE profesores(
    cod_profesor INTEGER NOT NULL,
    ape_profesor VARCHAR(40)NOT NULL,
    nom_profesor VARCHAR(30)NOT NULL,
    email_profesor VARCHAR(75) NOT NULL,
    grupo_profesor VARCHAR(30),
    tipo_profesor integer NOT NULL,
    PRIMARY KEY (cod_profesor)
);

CREATE TABLE incidencias(
    cod_incidencia INTEGER NOT NULL,
    nom_incidencia VARCHAR(100) NOT NULL,
    puntos_incidencia  INTEGER NOT NULL,
    descripcion_incidencia VARCHAR(255),
    PRIMARY KEY (cod_incidencia)
);

CREATE TABLE expulsiones(
    cod_expulsion integer NOT NULL,
    fecha_inicio_expulsion DATE,
    fecha_fin_expulsion DATE,
    PRIMARY KEY(cod_expulsion)
);

CREATE TABLE alumnos(
    cod_alumno INTEGER NOT NULL,
    nom_alumno VARCHAR(30) NOT NULL,
    ape_alumno VARCHAR(40) NOT NULL,
    dni_nie_alumno VARCHAR(12) NOT NULL,
    grupo_alumno VARCHAR(20) NOT NULL,
    dir_alumno VARCHAR(200) NOT NULL,
    PRIMARY KEY(cod_alumno) 
);

CREATE TABLE partes(
    cod_parte INTEGER NOT NULL,
    cod_profesor INTEGER NOT NULL,
    cod_alumno INTEGER NOT NULL,
    cod_incidencia INTEGER NOT NULL,
    materia_parte VARCHAR(20),
    fecha_parte DATE, 
    hora_parte VARCHAR(20), 
    puntos_parte INTEGER NOT NULL,
    PRIMARY KEY(cod_parte),
    FOREIGN KEY(cod_profesor) REFERENCES profesores(cod_profesor),
    FOREIGN KEY(cod_alumno) REFERENCES alumnos(cod_alumno),
    FOREIGN KEY (cod_incidencia) REFERENCES incidencias(cod_incidencia)
);

CREATE TABLE partes_expulsion(
    cod_parte_expulsion INTEGER NOT NULL,
    cod_expulsion INTEGER NOT NULL,    
    cod_profesor INTEGER NOT NULL,
    cod_alumno INTEGER NOT NULL,
    cod_incidencia INTEGER NOT NULL,
    materia_parte VARCHAR(25),
    fecha_parte DATE, 
    hora_parte VARCHAR(20), 
    puntos_parte INTEGER NOT NULL,
    PRIMARY KEY(cod_parte_expulsion),
    FOREIGN KEY (cod_expulsion) REFERENCES expulsiones(cod_expulsion),
    FOREIGN KEY(cod_profesor) REFERENCES profesores(cod_profesor),
    FOREIGN KEY(cod_alumno) REFERENCES alumnos(cod_alumno),
    FOREIGN KEY (cod_incidencia) REFERENCES incidencias(cod_incidencia)
);

INSERT INTO incidencias VALUES (1,'Parte convivencia.',0,' ');

 INSERT INTO incidencias VALUES (2,'Comer y beber en aulas o pasillos.',1,'');
 INSERT INTO incidencias VALUES (3,'Comer chicles o caramelos en aulas o pasillos.',1,'');
 INSERT INTO incidencias VALUES (4,'Interrumpir la clase.',1,'');
 INSERT INTO incidencias VALUES (5,'Ensuciar el centro.',1,'');
 INSERT INTO incidencias VALUES (6,'Postura inadecuada.',1,'');
 INSERT INTO incidencias VALUES (7,'Desordenar material y mobiliario.',1,'');
 INSERT INTO incidencias VALUES (8,'Llegar tarde a primera hora.',1,'');
 INSERT INTO incidencias VALUES (9,'Cambiarse de sitio sin permiso.',1,'');
 INSERT INTO incidencias VALUES (10,'No traer el material.',1,'');
 INSERT INTO incidencias VALUES (11,'Estar en el pasillo.',1,'');
 INSERT INTO incidencias VALUES (12,'Otros.',1,'');

 INSERT INTO incidencias VALUES (13,'Llegar tarde a clase.',2,'');
 INSERT INTO incidencias VALUES (14,'Falta injustificada de asistencia.',2,'');
 INSERT INTO incidencias VALUES (15,'No realizar las tareas de manera reiterada.',2,'');
 INSERT INTO incidencias VALUES (16,'No traer la agenda firmada por los padres.',2,'');
 INSERT INTO incidencias VALUES (17,'Estar en otra aula que no corresponde.',2,'');
 INSERT INTO incidencias VALUES (18,'Formar alboroto en los cambios de clase.',2,'');
 INSERT INTO incidencias VALUES (19,'Estar en los pasillos o aulas durante el recreo.',2,'');
 INSERT INTO incidencias VALUES (20,'Otros.',2,'');

 INSERT INTO incidencias VALUES (21,'Insultar a un compa�ero.',3,'');
 INSERT INTO incidencias VALUES (22,'Desobedecer al profesor o personal del centro.',3,'');
 INSERT INTO incidencias VALUES (23,'Reincidencia en una conducta negativa.',3,'');
 INSERT INTO incidencias VALUES (24,'Formar alboroto durante las clases.',3,'');
 INSERT INTO incidencias VALUES (25,'No realizar las tareas de expulsi�n.',3,'');
 INSERT INTO incidencias VALUES (26,'Uso de vocabulario inapropiado.',3,'');
 INSERT INTO incidencias VALUES (27,'Acumular 3 partes de convivencia.',3,'');
 INSERT INTO incidencias VALUES (28,'Otros.',3,'');

 INSERT INTO incidencias VALUES (29,'Faltar el respeto gravemente.',5,'');
 INSERT INTO incidencias VALUES (30,'Reincidencia en una misma falta. (3 veces)',5,'');
 INSERT INTO incidencias VALUES (31,'Romper, inutilizar y/o perder material de forma premeditada.',5,'');
 INSERT INTO incidencias VALUES (32,'No reponer o reparar el material inutilizado.',5,'');
 INSERT INTO incidencias VALUES (33,'Otros.',5,'');

 INSERT INTO incidencias VALUES (34,'Agresi�n.',10,'');
 INSERT INTO incidencias VALUES (35,'Robo.',10,'');
 INSERT INTO incidencias VALUES (36,'Falta de respeto al profesor o personal del centro.',10,'');
 INSERT INTO incidencias VALUES (37,'Incumplimiento de una sanci�n.',10,'');
 INSERT INTO incidencias VALUES (38,'Fumar en el centro.',10,'');
 INSERT INTO incidencias VALUES (39,'Vandalismo.',10,'');
 INSERT INTO incidencias VALUES (40,'Utilizar el m�vil en el centro.',10,'');
 INSERT INTO incidencias VALUES (41,'Suplantaci�n de personalidad.',10,'');
 INSERT INTO incidencias VALUES (42,'Salir del centro sin permiso.',10,'');
 INSERT INTO incidencias VALUES (43,'Otros.',10,'');
 
 INSERT INTO profesores VALUES (1,  'Escalera',   'Adrian',   'adrian@gmail.com', NULL, 1);
 INSERT INTO profesores VALUES (2,  'Sanchez',    'Francisco','francisco@gmail.com',   NULL, 1);
 INSERT INTO profesores VALUES (3,  'Lopez',      'Silvia',   'silvia@yahoo.es',  '1�B', 2);
 INSERT INTO profesores VALUES (4,  'Cid',        'Juan',     'juan@yahoo.es', NULL, 1);
 INSERT INTO profesores VALUES (5,  'Rodr�guez',  'Anibal',   'anibal@gmail.com', '1�A', 2);
 INSERT INTO profesores VALUES (6,  'G�mez',      'Daniel',   'daniel@gmail.com', NULL, 1);
 INSERT INTO profesores VALUES (7,  'Escalonilla','Marina',   'marina@gmail.com', NULL, 1);
 INSERT INTO profesores VALUES (8,  'Viso',       'Alejandro','alejandro@telefonica.net', '1�E', 2);
 INSERT INTO profesores VALUES (9,  'Juarez',     'Amelia',   'ameliaj@gmail.com',  'SMR1', 2);
 INSERT INTO profesores VALUES (10, 'Mart�n',     'Amelia',   'ameliam@gmail.com',  '3�A', 2);
 INSERT INTO profesores VALUES (11, 'Matute',     'Ana Mar�a','anamaria@hotmail.com', '3�A', 2);
 INSERT INTO profesores VALUES (12, 'Madrid',     'Pedro',    'pedro@hotmail.com', '2�F', 2);
 INSERT INTO profesores VALUES (13, 'M�rida',     'Antonia',  'antonia@hotmail.com',  '2�BACHA', 2);
 INSERT INTO profesores VALUES (14, 'S�nchez',    'Antonio',  'antonio@hotmail.com', 'FPB1', 2);
 INSERT INTO profesores VALUES (15, 'Bermudez',   'Beatriz',  'bermudez@gmail.com',  'ASIR1', 2);
 INSERT INTO profesores VALUES (16, 'Salinero',   'Beatriz',  'salinero@hotmail.com',  NULL, 1);
 INSERT INTO profesores VALUES (17, 'Montes',     'Juoaquin', 'montes@gmail.com',  NULL, 1);
 INSERT INTO profesores VALUES (18, 'Sanz',       'Camilo',   'camilo@hotmail.com',  '1�B', 2);
 INSERT INTO profesores VALUES (19, 'Rodrigo',    'Carlos',   'carlitos@gmail.com', 'ASIR2', 2);
 INSERT INTO profesores VALUES (20, 'Valdepe�as', 'Carmen',   'carmen@yahoo.es',  NULL, 1);
 
 
INSERT INTO alumnos  VALUES(1,  'Juan',    'Juarez Mu�oz', '04242045V', '1�A', 'C/ Santa Cristina N�3 -P.1 C $SAN ROMAN DE LOS MONTES $TOLEDO $45646');
INSERT INTO alumnos  VALUES(2,  'Antonio', 'Ferm�n Sardinero', '640401', '1�A', 'C/ Cercas N�24 $SAN ROMAN DE LOS MONTES $TOLEDO $45646');
INSERT INTO alumnos  VALUES(3,  'Marisa',  'Bermudez Loaisa ', '587046', '1�B', 'C/ Arboleda N�1 -P.B D $SAN ROMAN DE LOS MONTES $TOLEDO $45646');
INSERT INTO alumnos  VALUES(4,  'Marina',  'Lopez Saez', '53803735L', '1�B', 'C/ TORREJON N�18 -Esc.2 -P.1 D $SAN ROMAN DE LOS MONTES $TOLEDO $45646');
INSERT INTO alumnos  VALUES(5,  'Jorge',   'Recuero Carrascosa', '631799', '1�B', 'C/ Pintor Zuloaga N�15  $TALAVERA DE LA REINA $TOLEDO $45600' );
INSERT INTO alumnos  VALUES(6,  'Luis',    'Mart�n Jim�nez', '651853', '1�C', 'C/ Ecolog�a N�16 $SAN ROMAN DE LOS MONTES $TOLEDO $45646');
INSERT INTO alumnos  VALUES(7,  'Carmen',  'Bueno Lorente', '648517', '1�D', 'C/ Valdelagua N�55  $TALAVERA DE LA REINA $TOLEDO $45600');
INSERT INTO alumnos  VALUES(8,  'Tob�as',  'Lorente Sanchez', '758755', '1�D', 'C/ El Puntal N�7 $MEJORADA $TOLEDO $45621');
INSERT INTO alumnos  VALUES(9,  'Lucia',   'Matamoros Toledo', '500607', '1�D', 'C/ Agua N�53 $TALAVERA DE LA REINA $TOLEDO $45600' );
INSERT INTO alumnos  VALUES(10, 'Beatriz', 'Cid Romela', '640408', '1�E', 'C/ Estornino N�7 $SEGURILLA $TOLEDO $45621');
INSERT INTO alumnos  VALUES(11, 'Pablo',   'Iniesta Alejo', '648772', '1�E', 'C/ FERIA N�8 P.1 b  $TALAVERA DE LA REINA $TOLEDO $45600');
INSERT INTO alumnos  VALUES(12, 'Mauro',   'G�mez G�mez', '648988', '1�E', 'C/ GRAN CAPITAN N�2 A $TALAVERA DE LA REINA $TOLEDO $45600');
INSERT INTO alumnos  VALUES(13, 'Jes�s',   'Perez Caminero', '7781253', '1�E', 'C/ Francisco Aguirre, 23 2�A $TALAVERA DE LA REINA $TOLEDO $45600');
INSERT INTO alumnos  VALUES(14, 'Marina',  'Rodr�guez G�mez', '1234567', '1�E', 'C/ Benita Hormigos,2  $TALAVERA DE LA REINA $TOLEDO $45600');

INSERT INTO partes VALUES (1, 1, 1, 28, 'Lengua', '17-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (2, 2, 2, 10, 'Ingl�s', '25-10-2017','5� hora', 1);
INSERT INTO partes VALUES (3, 4, 4, 23, 'Ingl�s', '2511-2017', '6� hora', 3);
INSERT INTO partes VALUES (4, 1, 1, 28, 'Lengua', '10-10-2017','1� hora', 3);
INSERT INTO partes VALUES (5, 2, 7, 20, 'Ciencias Naturales', '7-11-2017', '4� hora', 2);
INSERT INTO partes VALUES (6, 3, 6, 21, 'Ingl�s', '27-10-2017', '6� hora', 3);
INSERT INTO partes VALUES (7, 4, 7, 20, 'Tecnolog�a', '28-11-2017', '2� hora',3);
INSERT INTO partes VALUES (8, 5, 4, 13, 'Matem�ticas', '21-10-2017', '1� hora',1);
INSERT INTO partes VALUES (9, 6, 4, 23, 'Lengua', '17-10-2017', '5� hora', 3);
INSERT INTO partes VALUES (10, 7, 5, 22, 'Ingl�s', '25-10-2017', '6� hora', 3);
INSERT INTO partes VALUES (11, 8, 8, 6, 'Lengua', '18-01-2017', '6� hora', 1);
INSERT INTO partes VALUES (12, 9, 9, 33, 'Lengua', '21-11-2017', '3� hora', 5);
INSERT INTO partes VALUES (13, 10, 3, 22, 'Matem�ticas', '2-02-2018', '6� hora', 3);
INSERT INTO partes VALUES (14, 10, 3, 4, 'Matem�ticas', '8-02-2018', '2� hora', 1);
INSERT INTO partes VALUES (15, 1, 5, 28, 'Lengua', '7-10-2017', '5� hora', 3);
INSERT INTO partes VALUES (16, 1, 7, 28, 'Lengua', '1-10-2017', '2� hora', 3);
INSERT INTO partes VALUES (17, 12, 8, 28, 'Tecnolog�a', '21-10-2017', '6� hora',3);
INSERT INTO partes VALUES (18, 5, 8, 24, 'Ciencias Naturales', '15-10-2017', '6� hora',5);
INSERT INTO partes VALUES (20, 4, 8, 24, 'Ciencias Naturales', '14-12-2017', '2� hora', 3);
INSERT INTO partes VALUES (21, 4, 6, 23, 'Ingl�s', '3-11-2017', '6� hora', 3  );
INSERT INTO partes VALUES (22, 8, 7, 12, 'Matem�ticas', '4-11-2017', '1� hora', 1 );
INSERT INTO partes VALUES (23, 4, 6, 23, 'Ingl�s', '5-11-2017', '6� hora', 3);
INSERT INTO partes VALUES (24, 1, 6, 23, 'Lengua', '25-10-2017', '5� hora', 3);
INSERT INTO partes VALUES (25, 1, 6, 21, 'Lengua', '12-10-2017', '5� hora', 3);
INSERT INTO partes VALUES (26, 1, 6, 22, 'Ingl�s', '13-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (27, 10, 1, 21, 'Franc�s', '14-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (28, 10, 1, 26, 'Lengua', '30-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (29, 10, 1, 28, 'Historia', '29-10-2017', '5� hora', 3);
INSERT INTO partes VALUES (30, 11, 2, 22, 'Inform�tica', '24-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (31, 12, 3, 4, 'Ciencias Naturales', '18-01-2018', '6� hora', 1);
INSERT INTO partes VALUES (32, 12, 8, 33, 'Lengua', '2-10-2017', '1� hora', 5);
INSERT INTO partes VALUES (33, 12, 8, 21, 'Tecnolog�a', '9-10-2017', '1� hora', 3);
INSERT INTO partes VALUES (34, 12, 4, 16, 'Lengua', '9-10-2017', '1� hora', 2);

INSERT INTO expulsiones VALUES(1, '10-10-2017', '15-10-2017');
INSERT INTO expulsiones VALUES(2, '8-10-2017', '18-10-2017');
INSERT INTO expulsiones VALUES(3, '28-10-2017', '2-11-2017');
INSERT INTO expulsiones VALUES(4, '4-10-2017', '7-10-2017');
INSERT INTO expulsiones VALUES(5, '10-11-2017', '15-11-2017');
INSERT INTO expulsiones VALUES(6, '19-10-2017',  '24-10-2017');
INSERT INTO expulsiones VALUES(7, '12-10-2017', '15-10-2017');
INSERT INTO expulsiones VALUES(8, '13-10-2017', '16-10-2017');
INSERT INTO expulsiones VALUES(9, '14-10-2017', '17-10-2017');
INSERT INTO expulsiones VALUES(10, '15-10-2017', '18-10-2017');
INSERT INTO expulsiones VALUES(11, '16-10-2017', '19-10-2017');
INSERT INTO expulsiones VALUES(12, '17-11-2017', '25-11-2017');
INSERT INTO expulsiones VALUES(13, '18-10-2017', '28-10-2017');
INSERT INTO expulsiones VALUES(14, '19-10-2017', '25-10-2017');
INSERT INTO expulsiones VALUES(15, '24-11-2017', '29-11-2017');
INSERT INTO expulsiones VALUES(16, '24-10-2017', '25-10-2017');
INSERT INTO expulsiones VALUES(17, '25-11-2017', '29-11-2017');
INSERT INTO expulsiones VALUES(18, '26-11-2017', '2-12-2017');
INSERT INTO expulsiones VALUES(19, '27-10-2017', '2-11-2017');
INSERT INTO expulsiones VALUES(20, '28-11-2017', '3-12-2017');





INSERT INTO partes_expulsion values (1, 1, 2, 6, 20, 'Lengua', '14-11-2017', '2� hora', 2 );
INSERT INTO partes_expulsion values (2, 1, 1, 6, 2, 'Matem�ticas', '13-11-2017', '2� hora', 1 );
INSERT INTO partes_expulsion values (3, 1, 2, 6, 22, 'Ingl�s', '09-11-2017', '3� hora', 3 );
INSERT INTO partes_expulsion values (4, 1, 3, 6, 30, 'Ingl�s', '09-11-2017', '3� hora', 5 );
INSERT INTO partes_expulsion values (5, 2, 7, 12, 22, 'Matem�ticas', '09-11-2017', '4� hora', 3 );
INSERT INTO partes_expulsion values (6, 2, 8, 12, 36, 'Artes Pl�sticas', '17-11-2017','1� hora', 10 );
INSERT INTO partes_expulsion values (7, 3, 10, 2, 22, 'Matem�ticas', '09-11-2017', '3� hora', 3 );
INSERT INTO partes_expulsion values (8, 3, 12, 2, 37, 'Artes Pl�sticas', '17-11-2017', '1� hora', 10 );
INSERT INTO partes_expulsion values (9, 4, 12, 11, 36, 'Geograf�a e Historia', '17-11-17', '1� hora', 10 );
INSERT INTO partes_expulsion values (10, 5, 14, 10, 21, 'Inform�tica', '13-11-2017', '3� hora', 3 );
INSERT INTO partes_expulsion values (11, 5, 1, 10, 18, 'Lengua', '14-11-2017', '4� hora', 2 );
INSERT INTO partes_expulsion values (12, 5, 4, 10, 23, 'Ingl�s', '02-11-2017', '6� hora', 3 );
INSERT INTO partes_expulsion values (13, 5, 15, 10, 29, 'Lengua', '10-11-2017', '1� hora', 5 );
INSERT INTO partes_expulsion values (14, 6, 5, 4, 38, 'Inform�tica', '20-11-2017', '4� hora', 10 );
INSERT INTO partes_expulsion values (15, 7, 5, 7, 38, 'Inform�tica', '20-11-2017', '4� hora', 10 );
INSERT INTO partes_expulsion values (16, 8, 14, 11, 28, 'Franc�s', '17-11-2017', '3� hora', 3 );
INSERT INTO partes_expulsion values (17, 8, 15, 11, 40, 'Matem�ticas', '21-11-2017', '2� hora', 10 );
INSERT INTO partes_expulsion values (18, 9, 18, 5, 23, 'Ciencias Naturales', '30-10-2017', '2� hora', 3 );
INSERT INTO partes_expulsion values (19, 9, 6, 5, 22, 'Geograf�a e Historia', '20-11-2017', '5� hora', 3 );
INSERT INTO partes_expulsion values (20, 9, 7, 5, 22, 'Lengua', '23-10-2017', '1� hora', 3 );
INSERT INTO partes_expulsion values (21, 9, 15, 5, 23, 'Ingl�s', '20-11-2017', '6� hora', 3 );
INSERT INTO partes_expulsion values (22, 10, 13, 2, 33, 'Guardia', '17-11-2017', '3� hora', 5 );
INSERT INTO partes_expulsion values (23, 10, 8, 2, 2, 'Lengua', '16-11-2017', '5� hora', 1 );
INSERT INTO partes_expulsion values (24, 10, 1, 2, 42, 'Lengua', '21-11-2017', '6� hora', 10 );
INSERT INTO partes_expulsion values (25, 11, 7, 9, 29, 'Franc�s', '21-11-2017', '6� hora',  5);
INSERT INTO partes_expulsion values (26, 11, 17, 9, 32, 'Ingl�s', '21-11-2017', '3� hora', 5 );


COMMIT;

/*1*/
INSERT INTO ALUMNOS VALUES (
(SELECT MAX(COD_ALUMNO)+1 FROM ALUMNOS)
, 'Carlos', 'Perez Garcia', '2355564Q', '1�D', 
'C/ Santa Cristina N�3 -P.1 C $SAN ROMAN DE LOS MONTES $TOLEDO $45646');

/*2*/
INSERT INTO PROFESORES VALUES (
(SELECT MAX(COD_PROFESOR)+1 FROM PROFESORES)
, 'Matute','Alejandro','alejandro@gmail.com','1�BACH','2');

/*3*/
INSERT INTO INCIDENCIAS VALUES (
1+(SELECT MAX(COD_INCIDENCIA) FROM INCIDENCIAS), 
'Acumula 7 partes de inconvinencia.', '3', null
);

INSERT INTO INCIDENCIAS VALUES (
1+(SELECT MAX(COD_INCIDENCIA) FROM INCIDENCIAS), 
'Uso constante de vocabulario inapropiado.', '5', null
);

INSERT INTO INCIDENCIAS VALUES (
1+(SELECT MAX(COD_INCIDENCIA) FROM INCIDENCIAS), 
'Beber alcohol en el centro', '10', null
);

/*4*/
INSERT INTO PARTES VALUES(
1+(SELECT MAX(COD_PARTE) FROM PARTES),(SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'),
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'), '28', 'Lengua', SYSDATE, '2�hora',
(SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE COD_INCIDENCIA LIKE '28')
);

INSERT INTO PARTES VALUES(
1+(SELECT MAX(COD_PARTE) FROM PARTES),(SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'),
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'), '33', 'Lengua', SYSDATE, '2�hora',
(SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE COD_INCIDENCIA LIKE '33')
);

INSERT INTO PARTES VALUES(
1+(SELECT MAX(COD_PARTE) FROM PARTES),(SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'),
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'), '31', 'Lengua', SYSDATE, '2�hora',
(SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE COD_INCIDENCIA LIKE '31')
);

/*5*/
INSERT INTO EXPULSIONES VALUES(
1+(SELECT MAX(COD_EXPULSION) FROM EXPULSIONES), SYSDATE, '4/04/25'
);

/*6*/
INSERT INTO PARTES_EXPULSION VALUES(
1+(SELECT MAX(COD_PARTE_EXPULSION) FROM PARTES_EXPULSION), '21', (SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'), 
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'),'28', 'Lengua', '20/03/24', '2�hora', '3');
INSERT INTO PARTES_EXPULSION VALUES(
1+(SELECT MAX(COD_PARTE_EXPULSION) FROM PARTES_EXPULSION), '21', (SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'), 
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'),'33', 'Lengua', '20/03/24', '2�hora', '5');
INSERT INTO PARTES_EXPULSION VALUES(
1+(SELECT MAX(COD_PARTE_EXPULSION) FROM PARTES_EXPULSION), '21', (SELECT COD_PROFESOR FROM PROFESORES WHERE APE_PROFESOR LIKE 'Matute' AND NOM_PROFESOR LIKE 'Alejandro'), 
(SELECT COD_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Carlos' AND APE_ALUMNO LIKE 'Perez Garcia'),'31', 'Lengua', '20/03/24', '2�hora', '5');

/*7*/
DELETE FROM PARTES_EXPULSION WHERE COD_EXPULSION LIKE '21';

/*8*/
INSERT INTO INCIDENCIAS VALUES (1+(SELECT MAX(COD_INCIDENCIA) FROM INCIDENCIAS), 'Abrir una Coca Cola en clase', '10', 'Abrir');

/*9*/
UPDATE PARTES_EXPULSION SET PUNTOS_PARTE = '2' WHERE PUNTOS_PARTE LIKE '3';
UPDATE PARTES_EXPULSION SET PUNTOS_PARTE = '3' WHERE PUNTOS_PARTE LIKE '5';

/*10*/
UPDATE INCIDENCIAS SET DESCRIPCION_INCIDENCIA = 'Insultar'
WHERE NOM_INCIDENCIA LIKE 'Insultar a un compa�ero.';

/*11*/
INSERT INTO ALUMNOS VALUES (
1+(SELECT MAX(COD_ALUMNO) FROM ALUMNOS), 'Ra�l', (SELECT APE_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Pablo'), '648773',
(SELECT GRUPO_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Pablo'), (SELECT DIR_ALUMNO FROM ALUMNOS WHERE NOM_ALUMNO LIKE 'Pablo')
);

/*12*/
INSERT INTO EXPULSIONES (COD_EXPULSION, FECHA_INICIO_EXPULSION, FECHA_FIN_EXPULSION) SELECT 1+MAX(COD_EXPULSION), SYSDATE, '04/04/24' FROM EXPULSIONES;

/*13*/
INSERT INTO PARTES VALUES(
1+(SELECT MAX(COD_PARTE) FROM PARTES), (SELECT COD_PROFESOR FROM PARTES WHERE MATERIA_PARTE LIKE 'Inform�tica'),
(SELECT COD_ALUMNO FROM ALUMNOS WHERE COD_ALUMNO LIKE '10'), '14', (SELECT MATERIA_PARTE FROM PARTES WHERE COD_PROFESOR LIKE '11'), SYSDATE,
'2� hora', (SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE COD_INCIDENCIA LIKE '14')
);

/*14*/
INSERT INTO PARTES VALUES(
1+(SELECT MAX(COD_PARTE) FROM PARTES), (SELECT COD_PROFESOR FROM PROFESORES WHERE NOM_PROFESOR LIKE 'Pedro'),
(SELECT COD_ALUMNO FROM ALUMNOS WHERE APE_ALUMNO LIKE 'Mart�n Jim�nez'), (SELECT COD_INCIDENCIA FROM INCIDENCIAS WHERE NOM_INCIDENCIA LIKE 'Robo.'), 
'Matematicas', SYSDATE, '2� hora', (SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE COD_INCIDENCIA LIKE '14')
);

/*15*/
UPDATE PARTES 
SET COD_PROFESOR = 
(SELECT COD_PROFESOR FROM PROFESORES WHERE NOM_PROFESOR LIKE 'Adrian' AND APE_PROFESOR LIKE 'Escalera') 
WHERE COD_PARTE LIKE '7';

/*16*/
UPDATE ALUMNOS
SET GRUPO_ALUMNO = '2� B'
WHERE NOM_ALUMNO LIKE 'Tob�as';

/*17*/
UPDATE ALUMNOS
SET GRUPO_ALUMNO = '2� A'
WHERE COD_ALUMNO NOT IN (SELECT COD_ALUMNO FROM PARTES);

/*18*/
DELETE FROM PARTES WHERE PUNTOS_PARTE<(SELECT PUNTOS_INCIDENCIA FROM INCIDENCIAS WHERE NOM_INCIDENCIA LIKE 'Llegar tarde a clase.');

/*19*/
DELETE FROM PARTES WHERE COD_PROFESOR = (SELECT COD_PROFESOR FROM PROFESORES WHERE TIPO_PROFESOR LIKE '2');

/*20*/
DELETE FROM PARTES WHERE COD_ALUMNO = (SELECT COD_ALUMNO FROM PARTES WHERE SUM(PUNTOS_PARTE)<5);