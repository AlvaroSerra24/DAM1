let array = [1,2,3,4,5,6];
let gen = new Array();
let gen2 = new Array();
let colores = ["azul", "amarillo", "rojo", "verde", "café", "rosa"];
document.write("<h2>Dado el array=[1,2,3,4,5,6]</h2>")
document.write("<h3>Iterar los elementos del array con while</h3>")
const leerW=(array)=> {
    let i=0;
    while(i<array.length){
        document.write(array[i]+"  ")
        i++
    }
}
leerW(array);
document.write("<br>")
document.write("<h3>Iterar los elementos del array con For</h3>")
const leerF=(array)=> {
    for (let i=0; i<array.length;i++) {
        document.write(array[i]+"  ")
    }
}
leerF(array);
document.write("<h3>Iterar los elementos del array con ForEach</h3>")
const leerFE=(array)=> {
    array.forEach(num=>document.write(num+"  "))
}
leerFE(array);
document.write("<h3>Iterar los elementos del array Incrementados</h3>")
const incrementar=(array)=> {
    array.forEach(num=>document.write(((num)+1)+"  "))
}
incrementar(array);
document.write("<h3>Nuevo array Incrementados</h3>")
const nuevoarray=(array)=> {
    let array2= new Array();
    for (let i=0; i<array.length;i++) {
        array2[i]=(array[i])+1
    }

    for (let i=0; i<array2.length;i++) {
        document.write(array2[i]+"  ")
    }    
}
nuevoarray(array);
document.write("<h2>Nuevo array con nuemero random</h2>")
const generar=(gen)=>{
    for(let i=0; i<20; i++){
        let num= Math.floor(Math.random() * 20);
        gen[i]=num;
    }

    for (let i=0; i<gen.length;i++) {
        document.write(gen[i]+"     ")
    }  
}
generar(gen);
document.write("<h2>Nuevo array con nuemero random hasta donde nosotros decidamos</h2>")
const generar2=(gen2)=>{
    let n=parseInt(prompt("Escribe el numero hasta donde quieres que llegeue el arrays"))
    for(let i=0; i<n; i++){
        let num= Math.floor(Math.random() * 20);
        gen2[i]=num;
    }

    for (let i=0; i<gen2.length;i++) {
        document.write(gen2[i]+"     ")
    } 
}
generar2(gen2);
document.write("<h2>Coincide los colores</h2>")
let cont=0;
const coincide=(colores)=>{
    let c=prompt("Escribe un color")
    for(let i=0; i<colores.length;i++){
        if(colores[i] == c)
        cont=1
    }
    if(cont==1)
    document.write("El color "+c+" esta en el arrays")
    else
    document.write("El color "+c+" no esta en el arrays")
}
coincide(colores);