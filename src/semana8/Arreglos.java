/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

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
        
        //le asigno el tamano de 100 al arreglo
        int [] numeritos;
        numeritos = new int [100];
        for (int j=0; j<numeritos.length;j++)
        {
            System.out.println(numeritos[j]);
        }
        
        
        int[] num;
        int contador=0;
        num=new int[100];
        int n = num.length;
        for (int i=0; i<=n-1 ;i++)
        {
            num[i] = i;
        }
        n = num.length;
        for(int i=0; i<=n-1 ; i++)
        {
            System.out.println(num[i]);
        }
    }
}
