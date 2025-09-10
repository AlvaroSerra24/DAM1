
const exponente=()=>{
    let base = parseInt(prompt("Escribe una base"));
    let exponente = parseInt(prompt("Escribe un exponenete"));
    let resultado = 1;
    
    if (base >= 0 && exponente >= 0) {
        for (let i = 0; i < exponente; i++) {
            resultado *= base;
        }
        alert(base+" elevado a la "+exponente+" es: "+resultado);
    } else {
        alert("El numero es negativo");
    }
}
exponente();