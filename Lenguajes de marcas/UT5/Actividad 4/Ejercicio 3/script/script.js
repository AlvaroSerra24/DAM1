let arr = [2,3,9,4,5,6,1,7,8]
document.write('<h2>La suma de los numeros del arrays</h2>');
const suma=(arr)=>{
    let suma=0;
    for(let i=0;i<arr.length;i++){
        suma=suma+arr[i];
    }
    document.write(suma);
}
suma(arr);
document.write('<h2>La media de los numeros del arrays</h2>');
const media=(arr)=>{
    let suma=0;
    let media=arr.length;
    for(let i=0;i<arr.length;i++){
        suma=suma+arr[i];
    }
    suma=suma/media;
    document.write(suma);
}
media(arr);
document.write('<h2>El numero mayor del arrays</h2>')
const mayor=(arr)=>{
    let mayor=0;
    for(let i=0;i<arr.length;i++){
        if (arr[i]>mayor){
            mayor=arr[i];
        }
    }
    document.write(mayor)
}
mayor(arr);
document.write('<h2>El numero menor del arrays</h2>')
const menor=(arr)=>{
    let menor=999999999;
    for(let i=0;i<arr.length;i++){
        if (arr[i]<menor){
            menor=arr[i]
        }
    }
    document.write(menor);
}
menor(arr);
