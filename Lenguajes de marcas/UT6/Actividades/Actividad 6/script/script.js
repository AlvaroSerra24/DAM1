document.addEventListener("DOMContentLoaded", function() {
    const letras = document.getElementById("letras");
    letras.addEventListener("keydown", function(num) {
        const letras = num.key;
        if (!isNaN(parseInt(letras))) {
            alert("Has escito un numero");
            num.preventDefault();
        }
    })
});