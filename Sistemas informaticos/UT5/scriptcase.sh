#!/bin/bash

echo "introduce un numero del 0 al 5"
read n

case $n in
4)
	echo "Ha ganado el primer premio"
;;
2)
	echo "Ha ganado el segundo premio"
;;
*)
	echo "buena suerte la proxima vez"
;;
esac

echo "fin"
