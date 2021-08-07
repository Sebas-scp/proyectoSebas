
package proyecto;

import java.util.Scanner;

public class TesterTODO 
{
    public static void main(String[] args) 
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Moneda(1), Moneda cambio(2), OvaloRectangulo(3), Union(5)");
        byte opcion=entrada.nextByte();
        switch(opcion)
        {
            case 1:
                Moneda resultado= new Moneda();
                resultado.menu();
                break;
                
            case 2:
                MonedaCambio salida = new MonedaCambio();
                float valor=salida.menu();
                System.out.println(valor);
                break;
                
            case 3:
                byte seguir = 0;
                do
                {
                    System.out.println("Seguir?");
                    seguir= entrada.nextByte();
                    MiVentana vent= new MiVentana("Dibujos");
                }while(seguir!=-1);
                break;
                
                
            case 5:
                Union salid= new Union();
                salid.intercalar();
                break;
        }
    }
}
