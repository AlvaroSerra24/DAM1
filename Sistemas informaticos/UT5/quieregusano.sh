#!/bin/bash

echo "Quiere gusanos? si/no"
read  OP
if [ "$OP" -eq "si" ];
then
while [ "$OP" -ne "no" ]
do
 echo "Donde?"
 read n
 if [ "$n" < 5 ]; then
 touch frutero/manzana$n/gusano.txt
 fi
echo "Quieres seguir?"
read OP
done
else
echo "Adios"
fi
