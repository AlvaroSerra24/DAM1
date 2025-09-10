
const buscar=()=>{
    let findIndex= [1, 2, 3, 4, 5];
    let objetivo= 3;
    let cont=0;
    let posicion=0
    for(let i=0;i<findIndex.length;i++){
        if(findIndex[i]==objetivo){
            cont++;
            posicion=i+1;  
        }
           
    }
    if(cont>0)
        document.write('El numero '+objetivo+' se encuentra en la posicion '+ posicion)
    else
        document.write('El numero '+objetivo+' no se encuentra en el arrays')
}
buscar();