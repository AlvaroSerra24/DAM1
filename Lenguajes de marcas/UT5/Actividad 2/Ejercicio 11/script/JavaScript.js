
const dni=()=>{
  var letras = new Array('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T');

  var numeroDNI = parseInt(prompt("Introduce su número de DNI:"));
  var lUsuario = prompt("Introduce la letra de su DNI (en mayúsculas):");
  
  if (numeroDNI < 0 || numeroDNI > 99999999) {
    document.write("El DNI no es válido.");
    console.log("El DNI no es válido.");
  } else {
    var resto = numeroDNI % 23;
    var lCalculada = letras[resto];
  
    if (lCalculada !== lUsuario) {
      document.write("La letra no es correcta.");
      console.log("La letra no es correcta.");
    } else {
      document.write("El DNI es correctos.");
      console.log("El DNI es correctos.");
    }
  }
}
dni();