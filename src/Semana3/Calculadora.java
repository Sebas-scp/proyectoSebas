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
public class Calculadora 
{
    //1 metodo para sumar:    
    public static int suma(int num1,int num2)
    {
        int resultado = num1 + num2;
        return resultado; 
    }
    
    //2 metodo para multiplicar:
    public static int multi(int num1, int num2)
    {
        int resultado = num1 * num2;
        return resultado;
    }
    
    
    Scanner entrada = new Scanner(System.in);
    //3 metodo para promedio:
    public static double prom(double num)
    {
        num = entrada.nextDouble();
        int total=0;
        int contador=0;
        while (num!=-1)
        {
            total += num; 
            contador++;
            System.out.print("Escriba los numeros o -1 para terminar: ");
            num = entrada.nextDouble();
        }
        if (total != 0)
        {
            double promedio = (double) total / contador;
            return promedio;
        }
        else 
            System.out.println("No se introdujeron numeros");  
            return 0;
    }
    
    
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        double numero3 = 0;
        int opcion = 0;
        
        
        System.out.print("Opciones escriba: 1 para suma,2 para multiplicar, 3 para promedio o para terminar: "
        + "en Windows escriba <Ctrl> z y oprima Intro ");
        while (entrada.hasNext())
        {
            opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Introduzca el primer numero: ");
                    numero1 = entrada.nextInt();
                    
                    System.out.println("Introduzca el segundo numero: ");
                    numero2 = entrada.nextInt();
                   
                    int resultadoSuma;
       
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    resultadoSuma =  suma(numero1,numero2);
                    System.out.println("resultadoSuma"); 
                    break;
                    
                case 2:
                    System.out.println("Introduzca el primer numero: ");
                    numero1 = entrada.nextInt();
                    
                    System.out.println("Introduzca el segundo numero: ");
                    numero2 = entrada.nextInt();
                   
                    int resultadoMulti;
       
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    resultadoMulti =  multi(numero1,numero2);
                    System.out.println("resultadoMulti"); 
                    break;
              
                case 3:
                    System.out.println("Introduzca el primer numero: ");
                    numero3 = entrada.nextDouble();
                    
                    double resultadoProm;
       
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    resultadoProm = prom(numero3);
                    System.out.println("resultadoProm"); 
                    break;
            }
            
            
            
            
        }
    }   
}
