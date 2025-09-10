alert("ADIVINA EL NÚMERO.- La aplicación te pedirá dos valores, se generará un número aleatorio entre estos y un número de intentos para adivinar dicho número secreto. ¡SUERTE!");
let min = parseInt(prompt("Introduce el valor mínimo del rango de núemros"));
let max = parseInt(prompt("Introduce el valor máximo del rango de núemros"));
let intentos = parseInt(prompt("Introduce el número de intentos"));
alert("Adivina el número entre "+min+" y "+max+" en "+intentos+" intentos");
let intentos2 = intentos;
var adivina = Math.floor(Math.random()*(max-min +1))+min;
let num;
let num2 = 0;
alert(adivina);
let confirm = false; 
do {
    intentos--;
    num2++ ;
    num = parseInt(prompt("Intento #"+num2+": ¿Cuál es tu número?"))  
    if(num != adivina){
        if(num>adivina){
        alert("El númeor es menor. Te quedan "+intentos+(" intentos."));
        }else{
        alert("El númeor es mayor. Te quedan "+intentos+(" intentos.")); 
        }
    }else{
            alert("¡Felicidades! Adivinaste el número en "+intentos+" intentos.");
            confirm = true
    }
    if(intentos == 0){
            alert("Agotaste tus "+intentos2+" intentos. El número era "+adivina);
    }
}while(!confirm);
