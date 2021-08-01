
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @author Sebastian Cordero Mora
 */
public class Moneda 
{
    static float unidad=0;
    String origenT;
    String salidaT;
    Scanner entrada= new Scanner(System.in);
    
    public void menu()
    {
       System.out.println("Introduzca el monto: ");
       unidad=entrada.nextFloat();
       
       origenT = JOptionPane.showInputDialog(null,"Moneda origen, escriba (1) dolares, (2) colones o (3) euros: ");
       salidaT = JOptionPane.showInputDialog(null,"Moneda salida, escriba (1) dolares, (2) colones o (3) euros: ");
       
       int origen =Integer.parseInt(origenT);
       int salida =Integer.parseInt(salidaT);
       if (origen==salida)
       {
           System.out.println("Error, moneda origen y salida iguales");
       }
       else
       {
            
            if (origen==1 && salida==2)
            {
                unidad=dolarAcolon();
            }
           
            else if(origen==1 && salida==3)
            {
                dolarAeuro();
            }
            
            else if(origen==3 && salida==2)
            {
                euroAcolon();
            }
            
            else if(origen==3 && salida==1)
            {
                euroAdolar();
            }
            
            else if(origen==2 && salida==1)
            {
                colonAdolar();
            }
            
            else if(origen==2 && salida==3)
            {
                colonAeuro();
            }
            
            else
            {
                System.out.println("Error");
            }
            
            System.out.println(unidad);
            
       }
    }
    
    public static float dolarAcolon()
    {
        return unidad*=500f;
    }
    
    public float dolarAeuro()
    {
        return unidad/=1.53f;
    }
    
    
    public float euroAcolon()
    {
       unidad*=500f;
       return unidad*= 1.53f;
    }
    
    public float euroAdolar()
    {
        return unidad*=1.53f;
    }
    
    public float colonAdolar()
    {
        return unidad /=500f;
    }
    
    public float colonAeuro()
    {
        unidad/=500;
        return unidad/=1.53; 
    }
}
