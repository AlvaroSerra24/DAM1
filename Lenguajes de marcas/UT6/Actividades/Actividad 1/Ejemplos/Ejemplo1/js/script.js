/*
PARTE A
Prueba el ejercicio primero utilizando este trozo de código
Luego coméntalo, descomenta el trozo de código de abajo 
y pruébalo de nuevo
*/

/*const button = document.querySelector("button");

button.onclick = function () {
    alert("Hello!");
}

/******************************************/

/*
PARTE B
¿Qué diferencia encuentras entre este código (PARTE B)
y el de la PARTE de arriba (PARTE A)?
*/

document.addEventListener("DOMContentLoaded", function() {
    
const button = document.querySelector("button");
button.onclick = function () {
    alert("Hello!");
}

});

/******************************************/
/*      1) ¿Qué diferencia hay entre uno y otro?
       
       El primero el código JavaScript se ejecuta desde un archivo externo, y el segundo se ejecuta desde el propio html,
       ademas en el primero la alerta no sale y en el segundo si.
       
        2) En el archivo de Javascript del “Ejemplo1” hay dos partes: PARTE A y PARTE B (una de ellas comentada). Pruébalas y responde de manera razonada qué ocurre con cada trozo de código.
       
       Las dos partes tienen como finalidad mostrar una alerta saludando, en la primera, no espera a que todo el Dom se cargue, en cambio en el segundo si. */








