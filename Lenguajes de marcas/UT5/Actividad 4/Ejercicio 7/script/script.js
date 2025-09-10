let num=parseInt(prompt("Dame un numero"))
const array=(num)=>{
    let arr= new Array();
    let num2=num;
    for(let i=0;i<num;i++){
        arr[i]=num2;
        num2--
    }
    document.write(arr);
}
array(num);
