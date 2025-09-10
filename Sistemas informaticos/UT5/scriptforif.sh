#!/bin/bash

i=0

function normal {
echo "Day $i: $days"
}

function festivo {
echo "Day $i: $days - festivo"
}

for days in lunes martes miercoles jueves viernes sabaso domingo
do
	if [ $i -le 4 ]; then
		normal
	else
		festivo
	fi
	((i++))
done
