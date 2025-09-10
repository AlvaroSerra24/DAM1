#!/bin/bash

echo "introduce un numero del 0 al 5"
read n

if [ $n -eq 4 ]; then
	echo "Ha ganado el primer premio"
elif [ $n -eq 2 ]; then
	echo "Ha ganado el segundo premio"
else
	echo "buena suerte la proxima vez"
fi

echo "fin"
