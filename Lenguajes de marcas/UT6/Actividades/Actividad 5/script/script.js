document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("Bloque");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.backgroundColor = "red";
    });

    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.backgroundColor = "white";
    });
});
