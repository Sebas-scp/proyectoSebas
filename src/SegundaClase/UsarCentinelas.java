/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaClase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class UsarCentinelas 
{
    public static void main(String[] args)
 {

    Scanner entrada = new Scanner(System.in);

    int total = 0; 
    int contadorCalificaciones = 0; 

    System.out.print("Escriba la calificacion o -1 para terminar: ");
    int calificacion = entrada.nextInt();

    while (calificacion != -1)
    {
        total = total + calificacion; 
        contadorCalificaciones = contadorCalificaciones + 1; 
        System.out.print("Escriba la calificacion o -1 para terminar: ");
        calificacion = entrada.nextInt();
    }

        if (contadorCalificaciones != 0)
        {
            double promedio = (double) total / contadorCalificaciones;
            System.out.printf("%nEl total de las %d calificaciones introducidas es: %d%n",
            contadorCalificaciones, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
        }
        else 
            System.out.println("No se introdujeron calificaciones");
    
 } 
}
