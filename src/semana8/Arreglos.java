/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Arreglos 
{
    public static void main(String[] args) 
    {
        /* la variable cars almacena multiples valores, siempre empieza 
        con la POSICION 0, no se puede guardar en la ultima posicion*/
        
        /*para declarar el arreglo se ponen [] al lado del tipo de dato
        luego se asignan valores con {"objeto 1","objeto 2"}
        */
        
        //                 0       1     2      3
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        
        
        /*imprimo lo que esta en el arreglo "cars" en la posicion [0]
        solo puedo imprimir uno al mismo tiempo, si quiero imprimirlos todos
        tengo que usar un while
        */
        System.out.println(cars[0]);
        
        /*le asigno al arreglo "cars", el valor de "Opel" en la posicion 0
        se borra el valor anterior "Volvo"
        */
        cars[0]="Opel";
        
        /*me imprime la longitud del arreglo 
        (para la longitud del arreglo uso arreglo.length)
        */
        System.out.println(cars.length);
        
        for (int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        
        
        byte[] numeros={45,64,78,85,90};
        for (int j=0; j<numeros.length;j++)
        {
            System.out.println(numeros[j]);
        }
        
        System.out.println("numeritos[j] = j es usado para asignar los valores de j"
                + ", si no esta, devuelve 0, 20 veces");
        //le asigno el tamano de 20 al arreglo
        int [] numeritos;
        numeritos = new int [20];
        for (int j=0; j<numeritos.length;j++)
        {
            numeritos[j] = j;
            System.out.println(j+"."+numeritos[j]);
        }
        
        System.out.println();
        
        System.out.println("Imprimir contador asignando valor de i");
        int[] num;
        int contador=0;
        num=new int[50];
        int n = num.length;
        for (int i=0; i<num.length-1 ;i++)
        {
            //se asigna el valor creciente de +1 a cada posicion num
            //como hago para quitar los impares?
            if(num[i]==0)
                num[i] = i;
            else
                num[(2*i-1)]=0;
        }
        n = num.length;
        
        
        for(int i=0; i<=n-1 ; i++)
        {
            System.out.println(i+"."+num[i]);
        }
        
        System.out.println();
        System.out.println();
        
        //Libro: pag 248
        
        int [] arreglo= new int [10];
        System.out.printf("%s%8s%16s%n","indice","valor","valor + 14");
        
        for(int i=0; i<arreglo.length; i++)
        {
            arreglo[i]=i;
            System.out.printf("%5d%8d%n",i,arreglo[i]);    
        }
        
        for(int i=0; i<arreglo.length; i++)
        {
            arreglo[i]=i+14;
            System.out.printf("%5d%9d%n",i+10,arreglo[i]);    
        }
        
        //que significa cuando tengo "arreglo2= "?
        
        
        System.out.println();
        System.out.println("Sumar elementos de arreglo");
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Cuantos numeros sumar?  ");
        int tamano = entrada.nextInt();
        int [] arreglo2=new int[tamano];
        int total=0;
        
        for(int i=0; i<arreglo2.length; i++)
        {
            System.out.println("introduzca los "+arreglo2.length+" numeros: ");
            int nume= entrada.nextInt();
            arreglo2[i]=nume;
            total += nume;
        }
        
        System.out.printf("%s%8s%n","Posicion","Numero");
        for(int i=0; i<arreglo2.length; i++)
        {
            arreglo2[i]=i;
            System.out.printf("%5d%8d%n",i,arreglo2[i]);
        }
        System.out.printf("Suma total: %d%n",total);
    }    
}
