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
    public static String compugrama0()
    {
       String orden="";
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
       return orden;
    }
    
    public static String compugrama1()
    {
        String orden="";
        byte n=5;
        for (byte u=2; u <= n  ;u++)
        {
            System.out.print("-");
            if (u==n)
            {
                System.out.print(">");
            }
        }
        
        return orden;
    }
    
    public static String compugrama2()
    {
        String orden="";
        byte n=5;
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
        return orden;
    }
    
    
    public static String compugrama3()
    {
        String orden="";
        int n=5;
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
        return orden;
    }
    
    public static String compugrama4()
    {
        String orden="";
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) )
               {  
                   System.out.print("*");
               }
               else if (j==1 && i==1 || j== n-2 && i== n-2|| j== n-3 && i==n-3 )
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
        return orden;
    }
    
    public static String compugrama5()
    {
        String orden="";
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if (i==0 || i==(n-1) || j==0 || j==(n-1) )
               {  
                   System.out.print("*");
               }
               else if (j==1 && i==3 || j==2 && i==2 || j==3 && i==1 )
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
        return orden;
    }
   
    public static void main(String[] args)
    {
       System.out.println("Compugrama 0: ");
       String activarCompugrama0=compugrama0();
       System.out.println("");
       
       System.out.println("Compugrama 1: ");
       String activarCompugrama1=compugrama1();
       System.out.println("");
       
       System.out.println("Compugrama 2: ");
       String activarCompugrama2=compugrama2();
       System.out.println("");
       
       System.out.println("Compugrama 3: ");
       String activarCompugrama3=compugrama3();
       System.out.println("");
       
       System.out.println("Compugrama 4: ");
       String activarCompugrama4=compugrama4();
       System.out.println("");
       
       System.out.println("Compugrama 5: ");
       String activarCompugrama5=compugrama5();
       System.out.println("");
    }
}
