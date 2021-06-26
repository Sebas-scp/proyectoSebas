/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExamen;

/**
 *
 * @author usuario
 */
public class Compugramas 
{
    public static void compugrama0()
    {
       int n=25;
       for(int i=0; i<n; i++)
       {
        System.out.print("*");
       }
       
       System.out.println();
       
       for(int i=0; i < n-1; i++)
       {
            if(i<n-2)
                System.out.println("*");
            else
                System.out.print("*");
       }
       
       for(int i=0; i<n-1; i++)
       {
           System.out.print("*");
       }
    }
    
    public static void compugrama1()
    {
        byte n=12;
        for (byte u=2; u <= n  ;u++)
        {
            System.out.print("-");
            if (u==n)
            {
                System.out.print(">");
            }
        }
        
    }
    
    public static void compugrama2()
    {
        byte n=12;
        for (byte u=0; u < n-2  ;u++)
        {
            for (byte i=0; i < n  ;i++)
            {
               if (i==n-1)
               {
                  System.out.print(">");
               }
               else
                   System.out.print("-");
            }
            System.out.println();     
        }
    }
    
    
    public static void compugrama3()
    {
        int n=12;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) )
               {
                System.out.print("*");
               }
               else
               {
                System.out.print(" ");
               } 
            }
            System.out.println();
        }
    }
    
    public static void compugrama4()
    {
        int n=12;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) || j==i )
               {  
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               } 
            }
            System.out.println();
        }
    }
    
    public static void compugrama5()
    {
        int n=12;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) || i==(n-j-1) )
               {  
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               } 
            }
            System.out.println();
        }
    }
    
    public static void compugrama6()
    {
        int n=12;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) || i==j || i==(n-j-1))
               {  
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               } 
            }
            System.out.println();
        }
    }
    
     public static void compugrama7()
    {
        int n=12;
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) || i==j || i==(n-j-1))
               {  
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               } 
            }
            System.out.println();
        }
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
        }
    }
   
    public static void main(String[] args)
    {
       System.out.println("Compugrama 0: ");
       compugrama0();
       System.out.println("");
       
       System.out.println("Compugrama 1: ");
       compugrama1();
       System.out.println("");
       
       System.out.println("Compugrama 2: ");
       compugrama2();
       System.out.println("");
       
       System.out.println("Compugrama 3: ");
       compugrama3();
       System.out.println("");
       
       System.out.println("Compugrama 4: ");
       compugrama4();
       System.out.println("");
       
       System.out.println("Compugrama 5: ");
       compugrama5();
       System.out.println("");
       
       System.out.println("Compugrama 6: ");
       compugrama6();
       System.out.println("");
       
       System.out.println("Compugrama 7: ");
       compugrama7();
       System.out.println("");
    }
}
