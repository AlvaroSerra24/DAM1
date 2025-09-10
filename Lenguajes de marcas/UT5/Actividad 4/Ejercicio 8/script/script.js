let arr=[1,1,2,3,4,4,5,4,6]
const quitar=(arr)=>{
    arr.sort();
    let arr2= new Array
    let anterior=0
    let cont=0;
    while(cont<arr.length){
        if(anterior!=arr[cont]){
            arr2.push(arr[cont]);
        }
        anterior=arr[cont];
        cont++;
    }
    document.write(arr2)
}
quitar(arr)