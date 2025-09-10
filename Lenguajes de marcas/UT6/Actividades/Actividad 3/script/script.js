const efectoBloque = document.getElementById("efecto");

function color() {
    efectoBloque.style.backgroundColor = "green";
    efectoBloque.style.color = "white";
}

document.getElementById("pasa").addEventListener("mouseover", color);
