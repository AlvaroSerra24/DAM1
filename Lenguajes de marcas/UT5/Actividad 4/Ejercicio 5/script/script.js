let num=parseInt(prompt("Dame un numero"))
document.write('<h2>El cuadrado del numero: '+num+'</h2>')
const cuadrado=(num)=>{
    let exp=2
    let result=num;
    for(let i=1;i<exp;i++){
        result=result*num
    }
    document.write(result);
}
cuadrado(num);
document.write('<h2>El cubo del numero: '+num+'</h2>')
const cubo=(num)=>{
    let exp=3;
    let result=num;
    for(let i=1;i<exp;i++){
        result=result*num
    }
    document.write(result);
}
cubo(num);