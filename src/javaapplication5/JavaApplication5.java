/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author JAZIEL
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Sca2ner scanner = new Scanner(System.in);

        // Declaración de los arreglos
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arregloDiferencia = new int[7];
        int suma = 0;

        // Llenar arreglo1
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el número para arreglo1 en la posición " + i + ":");
            arreglo1[i] = scanner.nextInt();
        }

        // Llenar arreglo2
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el número para arreglo2 en la posición " + i + ":");
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
