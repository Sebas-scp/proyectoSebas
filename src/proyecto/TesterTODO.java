
package proyecto;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

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
                JPanelDibujo dibujar = new JPanelDibujo();
                byte terminar=0;
                terminar=entrada.nextByte();
                while(terminar!=-1)
                {
                    System.out.println("Terminar?");
                    terminar=entrada.nextByte();
                    MiVentana ventana = new MiVentana("Ventana grafica");
                }
                
                
            case 5:
                Union salid= new Union();
                salid.intercalar();
                break;
        }
        
    }
}
