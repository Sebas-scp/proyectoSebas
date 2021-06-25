
package practicaExamen;

import java.util.Scanner;

public class Monedas 
{
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca el monto a desglosar: ");
        int total=entrada.nextInt();
        int mil=0;
        int quin=0;
        int cien=0;
        int diez=0;
        int cinco=0;
        int uno=0;
        int totalMonedas=0;
        
        
        while (total>=1000)
        {
            total-=1000;
            mil++;
            totalMonedas++;
        }
        
        while (total>=500)
        {
            total-=500;
            quin++;
            totalMonedas++;
        }
        
        while (total>=100)
        {
            total-=100;
            cien++;
            totalMonedas++;
        }
        
        while (total>=10)
        {
            total-=10;
            diez++;
            totalMonedas++;  
        }
        
        while (total>=5)
        {
            total-=5;
            cinco++;
            totalMonedas++;
        }
        
        while (total>=1)
        {
            total-=1;
            uno++;
            totalMonedas++;  
        }
        
        System.out.println("El total de monedas es: "+totalMonedas+" El desglose es: "+mil+" de mil, "+quin+" de quinientos, "+cien+" de cien, "+diez+" de diez, "+cinco+" de cinco, "+uno+" de uno.");
    }
}
