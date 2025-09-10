/*Metodo 1 en este es posible añadir varios eventos en el addEventListener*/
/*
document.getElementById("Div").addEventListener("click", function() {
    alert("Pulsaste sobre el botón");
});
/*Metodo 2 es mas simple ya que tiene un evento claro asignado*/

document.getElementById("Div").onclick = function() {
    alert("Pulsaste sobre el botón");
};
/***************/