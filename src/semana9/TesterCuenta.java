
package semana9;

import java.util.Scanner;


public class TesterCuenta 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Cuenta abrirCuenta = new Cuenta();
        System.out.printf("El nombre inicial es: %s%n%n",abrirCuenta.obtenerNombre());
        System.out.println("Introduzca el nombre: ");
        String elNombre=entrada.nextLine();
        abrirCuenta.establecerNombre(elNombre);
        System.out.println();
        
        System.out.printf("El nombre en el objeto abrirCuenta es: %s%n%n",
                abrirCuenta.obtenerNombre());
        
    }
    
}
