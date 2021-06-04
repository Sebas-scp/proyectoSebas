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
public class PromedioClase 
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int contadorCalificaciones= 1;
        while (contadorCalificaciones <= 10)
        {
            System.out.print("Introduzca calificacion: ");
            int calificacion = entrada.nextInt();
            total = total + calificacion;
            contadorCalificaciones = contadorCalificaciones + 1 ;
        }
        int promedio = total/10;
        System.out.printf("%nEl total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de las 10 calificaciones es %d%n", promedio);
    }
}
