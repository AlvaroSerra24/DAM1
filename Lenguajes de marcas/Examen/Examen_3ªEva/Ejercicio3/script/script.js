document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("boton");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.backgroundColor = "red";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.backgroundColor = "var(--red)";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("boton2");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.backgroundColor = "red";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.backgroundColor = "var(--red)";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("boton3");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.backgroundColor = "red";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.backgroundColor = "var(--red)";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("boton4");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.backgroundColor = "red";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.backgroundColor = "var(--red)";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const randomColor = Math.floor(Math.random()*16777215).toString(16);
    link.style.color = "#" + randomColor;
    const Bloque = document.getElementById("menu");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.Color = "red";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.Color = "white";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const randomColor = Math.floor(Math.random()*16777215).toString(16);
    const Bloque = document.getElementById("menu1");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.Color = link.style.color = "#" + randomColor;;
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.Color = "";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("num1");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.fontSize = "150px";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.fontSize = "";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("num2");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.fontSize = "150px";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.fontSize = "";
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const Bloque = document.getElementById("num3");
    Bloque.addEventListener("mouseenter", function() {
        Bloque.style.fontSize = "150px";
    });
    Bloque.addEventListener("mouseleave", function() {
        Bloque.style.fontSize = "";
    });
});