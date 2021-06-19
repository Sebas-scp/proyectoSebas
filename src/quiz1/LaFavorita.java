
package quiz1;

import java.util.Scanner;

/**
 *Sebastian Cordero Mora 
 * @author usuario
 */
public class LaFavorita 
{
    public static double menu()
    {
        Scanner entrada = new Scanner(System.in);
        byte ingrediente1=0;
        byte ingrediente2=0;
        byte ingrediente3=0;
        byte tamano=0;
        double costo=8000;
        
        
        System.out.println("Si desea agregar hongos escriba 1: ");
        ingrediente1= entrada.nextByte();
        System.out.println("Si desea agregar tocino escriba 2: ");
        ingrediente2= entrada.nextByte();
        System.out.println("Si desea agregar queso escriba 3: ");
        ingrediente3= entrada.nextByte();
        System.out.println("tamano: escriba 4 para tamano mediano o escriba 5 para tamano grande: ");
        tamano= entrada.nextByte();
        
        if (ingrediente1==1)
            costo += 500;
        if (ingrediente2==2)
            costo += 600;
        if (ingrediente3==3)
            costo += 700;
        else
            System.out.print("No se agregaron ingredientes");
        
        
        if (tamano==4){
            costo = costo + (0.10*costo); 
            return costo;}
        else if (tamano==5){
            costo = costo + (0.40*costo);
            return costo;}
        else
            System.out.println("No introdujo tamano de pizza.");
                
        System.out.println("RECIBO:");
        System.out.printf("Ingredientes: %d%n%d%n%d%n",ingrediente1,ingrediente2,ingrediente3);
        System.out.printf("El monto a pagar es: %f ",costo);
        return costo;
        
    }
    
    
    public static void main(String[] args)
    {
        double salida = menu();
        System.out.print(salida);
    }
}

