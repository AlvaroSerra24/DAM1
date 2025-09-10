#!/bin/bash

i=6

until [ $i -le 4 ]
do
      echo "Day $i"
	(( i-- ))
done
