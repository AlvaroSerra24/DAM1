DROP TABLE CLIENTE;
DROP TABLE PRODUCTO;
DROP TABLE PROVEDOR;

CREATE TABLE CLIENTE(
    RFC VARCHAR2(20),
    NOMBRE VARCHAR2(20) NOT NULL,
    APELLIDOS VARCHAR2(40) NOT NULL,
    DIRECCION VARCHAR2(30) NOT NULL,
    FECHA_DE_NACIMIENTO VARCHAR2(40) NOT NULL,
    CONSTRAINT CLI_RFC_PK PRIMARY KEY(RFC)
);

CREATE TABLE PRODUCTO(
    NOMBRE VARCHAR2(20) NOT NULL,
    PRECIO NUMBER(5) NOT NULL,
    CODIGO NUMBER(4),
    CONSTRAINT PRO_COD_PK PRIMARY KEY(CODIGO)
);

CREATE TABLE PROVEDOR(
RFC VARCHAR2(20),
CODIGO_PRODUCTO NUMBER(4),
NOMBRE VARCHAR2(20) NOT NULL,
DIRECCION VARCHAR(30) NOT NULL,
CONSTRAINT PRO_RFC_PK PRIMARY KEY(RFC),
CONSTRAINT PRO_COD_FK FOREIGN KEY(CODIGO_PRODUCTO) REFERENCES PRODUCTO ON DELETE CASCADE
);

/*A�ade dos campos a la tabla clientes para almacenar la profesi�n y el tel�fono del cliente. 
Ambos campos son requeridos. Elige los tipos de datos que consideres m�s adecuados.*/

ALTER TABLE CLIENTE ADD(PROFESION VARCHAR2(20) NOT NULL);
ALTER TABLE CLIENTE ADD(TELEFONO NUMBER(9) NOT NULL);

/*Modifica el campo apellidos para que tenga una longitud de 
70 caracteres y no permita almacenar la informaci�n si no es en may�sculas.*/

ALTER TABLE CLIENTE MODIFY (APELLIDOS VARCHAR2(70)); 

/*Elimina el campo tel�fono que acabas de crear.*/

ALTER TABLE CLIENTE DROP(TELEFONO);

/*A�ade a la tabla de Producto los campos: unidades_actuales y unidades_m�nimas. 
Utiliza los tipos que consideres m�s adecuados y las restricciones que consideres necesarias, para cada campo.*/

ALTER TABLE PRODUCTOS ADD(UNIDADES_ACTUALES NUMBER(2));
ALTER TABLE PRODUCTOS ADD(UNIDADES_MINIMAS NUMBER(2));

/**/