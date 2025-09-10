const comp=()=>{
  let valores = [true, 5, false, "hola", "adios", 2];

let texto1 = valores[3];
let texto2 = valores[4];
let textoMayor = '';

if (texto1.length > texto2.length) {
  textoMayor = texto1+" es mayor que "+texto2;
} else if (texto2.length > texto1.length) {
  textoMayor = texto2+" es mayor que "+texto1;
} else {
  textoMayor = "Los textos son iguales";
}

let booleano1 = valores[0];
let booleano2 = valores[2];

let resultadoTrue = booleano1 || booleano2;
let resultadoFalse = booleano1 && booleano2;

let numero1 = valores[1];
let numero2 = valores[5];

let suma = numero1 + numero2;
let resta = numero1 - numero2;
let multiplicacion = numero1 * numero2;
let division = numero1 / numero2;
let modulo = numero1 % numero2;

document.write(textoMayor);
document.write("<br>")
document.write("Resultado True: " + resultadoTrue );
document.write("<br>")
document.write("Resultado False: " + resultadoFalse );
document.write("<br>")
document.write("Suma: " + suma );
document.write("<br>")
document.write("Resta: " + resta);
document.write("<br>")
document.write("Multiplicación: " + multiplicacion);
document.write("<br>")
document.write("División: " + division );
document.write("<br>")
document.write("Módulo: " + modulo )
}

comp();

