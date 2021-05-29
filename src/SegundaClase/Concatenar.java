/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaClase;

import java.util.Scanner;
// se ocupa para poder utilizar el scanner, tocando el bombillito de la izquierda
/**
 *
 * @author usuario
 */
public class Concatenar {
    public static void main(String [] args){
        //concatenar es unir texto con numeros
        Scanner escaner = new Scanner (System.in);
        
          
        
        System.out.println("Universidad Latina");
        System.out.println("Facultad TICS");
        System.out.println("Programacion para TI");
        System.out.println();
        System.out.println("Por favor digite un numero: ");
        
        int num2 = escaner.nextInt();
        System.out.println("Por favor digite otro numero: ");
        int box1 = escaner.nextInt();
        int resultado = num2 + box1;
        System.out.print("Resultado: ");
        String nombre= "Sebastian Cordero Mora";
        
         
        System.out.println(nombre +" "+ "el resultado de la suma es:"+ " " + resultado);
        // ln me permite el cambio de linea
        
        
                                            
    }
}
