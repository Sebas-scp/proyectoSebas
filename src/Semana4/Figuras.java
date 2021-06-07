/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author usuario
 */
public class Figuras 
{
  public static void main(String[] args)
  {
      /*imprimir el cuadro:
      AAA
      AAA
      AAA
      */
      for (int i = 0; i < 3 ; i++) // filas
      {
          for (int j = 0 ; j < 3; j++)// columnas
          {
                System.out.print("A");   
          }
          System.out.println();
      }
      
      System.out.println();
      //es lo mismo que:
      int k = 0;
      while (k < 3)
      {
        for (int j = 0; j < 3; j++)
        {
            System.out.print("A");
        }
        System.out.println();
        k++;
      }
      
      
      System.out.println();
      
      for (int i = 0 ; i < 15; i++) //i < 15 lo que hace es comparar si i es menor que 15
      {
           System.out.print("A");
           System.out.print("B");
      }
      
      System.out.println();
      
      //lo mismo se puede hacer con while:
      int i=0;
      while (i < 15) //se va a ejecutar siempre que la condicion i < 15 se cumpla
      {
         System.out.print("A");
         System.out.print("B"); 
         i++; //es lo mismo que poner i = i+1, aumentar el contador
      }
      
      System.out.println();
      
      int p = 0;
      while (p < 3)
      {
        int j = 0;
        while (j < 3)
        {
            System.out.print("A");
            j++;
        }
        System.out.println();
        p++;
      }
      
      
  }  
}
