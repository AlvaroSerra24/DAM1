/*1. Crea un usuario llamado "NuevoUsuario" con la contraseña "contraseña123" y asigna un espacio de 100 MB en el tablespace "USUARIOS".*/
CREATE USER NUEVOUSUARIO
IDENTIFIED BY CONTRASEÑA123
DEFAULT TABLESPACE USUARIO
QUOTA 100M ON USUARIO;

/*2. Modifica el usuario "UsuarioLimitado" para cambiar la contraseña a "nuevaclave" y asignar el tablespace temporal "TEMP".*/
ALTER USER USUARIOLIMITADO
IDENTIFIED BY NUEVACLAVE
TEMPORARY TABLESPACE TEMP;

/*3. Elimina el usuario "UsuarioEliminado" sin borrar sus objetos.*/
DROP USER USUARIOELIMINADO;

/*4. Elimina el usuario "UsuarioEliminado2" y todos sus objetos.*/
DROP USER USUARIOELIMINADO2 CASCADE;

/*5. Cambia la contraseña del usuario "Usuario5" a "nuevoacceso".*/
ALTER USER USUARIO5
IDENTIFIED BY NUEVOACCESO;

/*6. Modifica el usuario "Usuario6" para que su tablespace por defecto sea "Usuarios".*/
ALTER USER USUARIO6
DEFAULT TABLESPACE USUARIOS;

/*7. Altera el usuario "Usuario7" para que su tablespace temporal sea "Temporal".*/
ALTER USER USUARIO7
TEMPORARY TABLESPACE TEMPORAL;

/*8. Asigna un límite de 50 MB al usuario "Usuario8" en el tablespace "DATOS".*/
ALTER USER USUARIO8
QUOTA 50M ON DATOS;

/*9. Asigna el perfil "Perfil1" al usuario "Usuario9".*/
ALTER USER USUARIO9
PROFILE PERFIL1;

/*10. Conceder el privilegio de seleccionar en la tabla "clientes" al usuario "usuario10".*/
GRANT SELECT ON CLIENTES TO USUARIO10;

/*11. Otorga a un usuario llamado "Usuario11" todos los privilegios sobre la tabla "ventas".*/
GRANT ALL ON VENTAS TO USUARIO11;

/*12. Concede el privilegio de insertar y eliminar en la tabla "productos" al usuario "usuario12" con la opción de conceder estos privilegios a otros usuarios.*/
GRANT INSERT, DELETE ON PRODUCTOS TO USUARIO12 WITH GRANT OPTION;

/*13. Quita todos los privilegios sobre la tabla "empleados" al usuario "usuario3".*/
REVOKE ALL ON EMPLEADOS FROM USUARIO13;

/*14. Concede todos los privilegios disponibles sobre la base de datos llamada Base al usuario llamado LUCAS.*/
GRANT ALL ON BASE TO LUCAS;

/*15. Asigna el privilegio de modificar en la tabla "pedidos" al rol "ventas" con la opción de permitir a este rol otorgar el privilegio a otros usuarios.*/
GRANT ALTER ON PEDIDOS TO VENTAS WITH GRANT OPTION;

/*16. Elimina el privilegio de eliminar datos de la tabla productos al usuario16.*/
REVOKE DELETE ON PRODUCTOS FROM USUARIO16;

/*17. Asigna el privilegio de insertar en la tabla "fabricantes" a todos los usuarios.*/
GRANT INSERT ON FABRICANTES TO PUBLIC;