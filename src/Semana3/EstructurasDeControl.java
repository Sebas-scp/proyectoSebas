/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EstructurasDeControl 
{
    public static void main (String[] args)
    {   
        Scanner s = new Scanner (System.in); 
        int edad = s.nextInt() ;
        if (edad >= 60)
        {
            System.out.print("Es urgente la inyeccion");
        }
        else
        {
            System.out.print("No es tan urgente la inyeccion");
        }
    } 
}
