Algoritmo arreglos 
	//Declarar Los arreglos
	// En PSeInt para declarar arreglos se coloca "Dimension"
		dimension arreglo1[7]
		dimension arreglo2[7]
		dimension arregloDiferencia[7]
		
		
		// Defino mis variables y su tipo de Dato
		
		Definir suma Como Entero
		Definir promedio Como Real
		
		//Inicializo la variable suma en 0 
		suma = 0
		
		// Recorrer  el primer arreglo y lo lleno
		Para i <- 1 Hasta 7 Con Paso 1 Hacer
			Escribir "Ingrese el n�mero para arreglo1 en la posici�n ", i, ":"
			Leer arreglo1[i]
		FinPara
		
		//Recorrer  el segundo arreglo y lo lleno
		Para i <- 1 Hasta 7 Con Paso 1 Hacer
			Escribir "Ingrese el n�mero para arreglo2 en la posici�n ", i, ":"
			Leer arreglo2[i]
		FinPara
		
		// Llenar el tercer arreglo con la diferencia
		Para i <- 1 Hasta 7 Con Paso 1 Hacer
			arregloDiferencia[i] = arreglo1[i] - arreglo2[i]
			
		//Asigno a la varible suma la expresi�n, suma + arregloDiferencia
			suma = suma + arregloDiferencia[i]
		FinPara
		
		// Calcular el promedio
		promedio = suma / 7
		
		// Mostrar los valores del tercer arreglo
		Escribir "Valores del tercer arreglo (diferencia):"
		Para i <- 1 Hasta 7 Con Paso 1 Hacer
			Escribir "Posici�n ", i, ": ", arregloDiferencia[i]
		FinPara
		
		// Mostrar el promedio
		Escribir "El promedio de los valores del tercer arreglo es: ",  promedio

FinAlgoritmo
