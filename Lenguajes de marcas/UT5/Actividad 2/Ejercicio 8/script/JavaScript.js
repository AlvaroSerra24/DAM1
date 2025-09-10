

const factorial=()=>{
  let numero = parseInt(prompt("Escribe un numero"));
  let factorial = 1;
  
  for (let i = numero; i >= 1; i--) {
    factorial *= i;
  }
  
  alert("El factorial de "+numero+" es: "+factorial);
}
factorial();