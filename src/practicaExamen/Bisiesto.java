
package practicaExamen;

import java.util.Scanner;


public class Bisiesto 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el ano: ");
        int ano=entrada.nextInt();
        if(ano%4 == 0 && (!(ano%100==0)||ano%400==0))
        {
            System.out.println("El ano introducido es biciesto. ");
        }
        else
            System.out.println("El ano introducido NO es biciesto. ");    
    }
}
