#!/bin/bash
contador=5;
if [ ! -d $frutero ]; then mkdir frutero
elif [ -d $frutero ]; then
until [ $contador == 0 ]
do
mkdir frutero/manzana$contador
((contador--))
done
fi
