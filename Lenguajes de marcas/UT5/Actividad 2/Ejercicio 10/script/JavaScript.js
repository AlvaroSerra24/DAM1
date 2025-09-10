
const fecha=()=>{
    let dia = parseInt(prompt("Dame un dia"));
let mes = parseInt(prompt("Dame un mes"));
let año = parseInt(prompt("Dame un año"));

let meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"];

if (dia >= 1 && dia <= new Date(año, mes, 0).getDate() && mes >= 1 && mes <= 12 && año > 0) {
    alert(dia+" de "+meses[mes - 1]+" de "+año);
} else {
    alert("La fecha introducida no es válida.");
}
}
fecha();