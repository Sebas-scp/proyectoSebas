
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Sebastian Cordero
 */
public class MonedaCambio 
{
    static float unidad=0f;
    static float cambio=0f;
    String origenT;
    String salidaT;
    Scanner entrada= new Scanner(System.in);
    
    public float menu()
    {
       System.out.println("Introduzca el monto: ");
       unidad=entrada.nextFloat();
       
       origenT = JOptionPane.showInputDialog(null,"Moneda origen, escriba (1) dolares, (2) colones o (3) euros: ");
       salidaT = JOptionPane.showInputDialog(null,"Moneda salida, escriba (1) dolares, (2) colones o (3) euros: ");
       System.out.println("Introduzca el tipo de cambio: ");
       cambio=entrada.nextFloat();
       
       int origen =Integer.parseInt(origenT);
       int salida =Integer.parseInt(salidaT);
       if (origen==salida)
       {
           System.out.println("Error, moneda origen y salida iguales");
           return 0;
       }
       else
       {
            return unidad*=cambio;
       }
    }
}

    

