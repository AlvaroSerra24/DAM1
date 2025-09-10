#!/bin/bash

for elemento in $HOME/*; do

	if [ -d "$elemento" ]; then
		echo "$elemento es un directorio."
	elif [ -f "$elemento" ]; then
		echo "$elemento es un fichero"
	else
		echo "$elemento no es ni directorio ni un fichero"
	fi
done
