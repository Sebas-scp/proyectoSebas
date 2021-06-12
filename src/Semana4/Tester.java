/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Tester 
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca numero de factor de riesgo: ");
        int factorRiesgo=0;
        factorRiesgo=entrada.nextInt();  
        String salida ="";
        
        
        //Clase variable = new Clase
        Citas s = new Citas();
        //invoco el metodo llamado cita con el parametro (factorRiesgo)
        String r= s.cita(factorRiesgo);
        System.out.print(r);
 
    }
}
