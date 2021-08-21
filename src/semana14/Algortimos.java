/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana14;

/**
 *
 * @author usuario
 */
public class Algortimos 
{
    //acomodar arreglos
    public static void main(String[] args) 
    {
        int posicion;
        
        /*
        System.out.println("mi arreglo: \n");
        for(int i=0; i<arreglo.length-1; i++)
        {
            if(arreglo[i] > arreglo[i+1])
            {
                int j=0;
                j=arreglo[i];
                arreglo[i+1]=arreglo[i];
            }
        }
        
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
        */
        System.out.println("original: ");
        int [] arreglo={2,8,5,3,9,4,1};
        for(int j=0;j<arreglo.length-1;j++)
        {
            for(int i=0; i<arreglo.length-j-1; i++)
            {
                if(arreglo[i] > arreglo[i+1])
                {
                    int p=arreglo[i+1];
                    arreglo[i+1]=arreglo[i];
                    arreglo[i]=p;
                }
            }

            for(int i=0; i<arreglo.length; i++)
            {
                System.out.println(arreglo[i]);
            }
            System.out.println("acomodo: "+j);
        }
        
        
        
        //ordenamiento insercion
        int [] arreglo2={2,8,5,3,9,4,1};
        System.out.println("original: ");
        for(int j=1;j<arreglo2.length;j++)
        {
            for(int i=j; i>0; i--)
            {
                if(arreglo2[i-1] > arreglo2[i])
                {
                    int p=arreglo2[i-1];
                    arreglo2[i-1]=arreglo2[i];
                    arreglo2[i]=p;
                }
            }

            for(int i=0; i<arreglo2.length; i++)
            {
                System.out.println(arreglo2[i]);
            }
            System.out.println("acomodo: "+j);
        }
    }
}
