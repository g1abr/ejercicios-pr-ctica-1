/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;



/**
 *
 * @author Gabriela 
 * 
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio el Scanner. 
      Scanner scanner = new Scanner(System.in);

        // Declaro los arreglos
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        
        //Arreglo 3, con la diferencia de los primeros arreglos. 
        
        // Esta vacío, solo tiene el tipo de dato que almacena 
        //Nota, en Java SIEMPRE debo especificar el tipo de dato 
        int[] arregloDiferencia = new int[7];
        int suma = 0;

        // Llenar arreglo1
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el numero para arreglo1 en la posicion " + i + ":");
            //llamo a escaner, (lo que en py es input o pseint es leer)
            arreglo1[i] = scanner.nextInt();
        }

        // Llenar arreglo2
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el numero para arreglo2 en la posicion " + i + ":");
            arreglo2[i] = scanner.nextInt();
        }

        // Llenar el tercer arreglo con la diferencia y calcular la suma
        for (int i = 0; i < 7; i++) {
            arregloDiferencia[i] = arreglo1[i] - arreglo2[i];
            suma += arregloDiferencia[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / 7;

        // Mostrar todos los valores del tercer arreglo
        System.out.println("Valores del tercer arreglo (diferencia):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arregloDiferencia[i]);
        }

        // Mostrar el promedio
        System.out.println("El promedio de los valores del tercer arreglo es: " + promedio);
    
    }
    
}
