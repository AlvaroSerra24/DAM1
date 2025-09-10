let arr = [1,2,3,4,5,6,7,8,9]


let pos1=parseInt(prompt("Dame la primera posicion que quieras cambiar"))
let pos2=parseInt(prompt("Dame la segunda posicion que quieras cambiar"))

const cambiar=(arr, pos1, pos2)=> {
    let num1= arr[pos1]
    let num2= arr[pos2]

    arr[pos1]=num2
    arr[pos2]=num1

    document.write(arr)
}

cambiar(arr, pos1, pos2)

