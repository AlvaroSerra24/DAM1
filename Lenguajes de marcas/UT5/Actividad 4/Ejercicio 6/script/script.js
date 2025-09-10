let num1=parseInt(prompt("Dame un numero"))
let num2=parseInt(prompt("Dame un numero"))
document.write('<h2>Suma</h2>')
const suma=(num1,num2)=>{
    let result;
    result=num1+num2;
    document.write(result);
}
suma(num1,num2)
document.write('<h2>Resta</h2>')
const resta=(num1,num2)=>{
    let result;
    result=num1-num2;
    document.write(result)
}
resta(num1,num2);
document.write('<h2>Multiplicacion</h2>')
const mult=(num1,num2)=>{
    let result;
    result=num1*num2;
    document.write(result);
}
mult(num1,num2);
document.write('<h2>Division</h2>')
const div=(num1,num2)=>{
    let result;
    if(num2==0){
        document.write('No se puede dividir entre 0')
    }else{
        result=num1/num2
        document.write(result);
    }
}
div(num1,num2);