let num=0;
do{
    num++;
    document.write(num);
    if(num%9 == 0){
        document.write(" (es Multiplo de 9) ")
    }

    if(num%4 == 0){
        document.write(" (es Multiplo de 4) ")
    }   

    if(num%5 == 0){
        document.write("<br>")
        document.write("-------------------------------------------")
    }
    document.write("<br>")
}while(num != 500)