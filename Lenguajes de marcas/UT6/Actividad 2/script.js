function sumar() {
    contador += 1;
    actualizarContador();
}
function restar() {
    contador -= 1;
    actualizarContador();
}
function reset() {
    contador = 0;
    actualizarContador();
}
function actualizarContador() {
    var contadorElemento = document.getElementById("contador");
    contadorElemento.textContent = contador;
    if (contador > 0) {
        contadorElemento.classList.remove("red");
        contadorElemento.classList.remove("black");
        contadorElemento.classList.add("green");
    } else if (contador < 0) {
        contadorElemento.classList.remove("green");
        contadorElemento.classList.remove("black");
        contadorElemento.classList.add("red");
    } else {
        contadorElemento.classList.remove("green");
        contadorElemento.classList.remove("red");
        contadorElemento.classList.add("black");
    }
}
var contador = 0;
actualizarContador();