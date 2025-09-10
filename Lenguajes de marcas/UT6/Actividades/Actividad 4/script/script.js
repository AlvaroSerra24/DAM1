const precio = document.getElementById("precio");
const cantidad = document.getElementById("cantidad");
const total = document.getElementById("total");
const enviar = document.getElementById("enviar");

enviar.addEventListener("click", calcularTotal);

function calcularTotal() {
    total.value = precio.value * cantidad.value;
}