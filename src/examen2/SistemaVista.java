/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class SistemaVista 
{
    Motores motor;
    Automovil auto;
    Inventario inventario;
    
    public mostrarListaBodega()
    {
        
    }
    
    public mostrarListaVendidos()
    {
        
    }
    
    public mostrarListaDevueltos()
    {
        
    }
    
    public agregarVehiculoFabricado()
    {
        String modelo=JOptionPane.showInputDialog("Introduzca el modelo del vehiculo: ");
        String estilo=JOptionPane.showInputDialog("Introduzca el estilo del vehiculo: ");
        String color=JOptionPane.showInputDialog("Introduzca el color del vehiculo: ");
        byte puertas=Byte.parseByte(JOptionPane.showInputDialog("Introduzca las puertas del vehiculo: "));
        short anio=Short.parseShort(JOptionPane.showInputDialog("Introduzca el anio del vehiculo: "));
        
        Automovil nuevoAuto=new Automovil(modelo,estilo,color,puertas,anio,motor);
        
    }
    
    
    
    public byte opcion()
    {
        byte opcion=0;
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Menu digite la opcion que desea: \n"
                + "1. Mostrar lista de vehiculos con info motor. \n"
                + "2. Mostrar lista de vehiculos vendidos con info motor \n"
                + "3. Mostrar lista de vehiculos devueltos con info motor \n"
                + "4. Agregar un vehiculo al sistema \n"
                + "5. Salir \n"
                ));
        
        if (opcion<1 || opcion>6)
        {
            JOptionPane.showMessageDialog(null, "Opcion invalida.");
            return 0;
        }
        else
        {
            return opcion;
        }
    }
    
}
