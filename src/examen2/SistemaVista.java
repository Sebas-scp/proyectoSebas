/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class SistemaVista 
{
    Motores motor;
    Automovil auto;
    Inventario inventario;
    
    public void mostrarListaBodega()
    {
        JTextArea at= new JTextArea();
        for(int i=0; i<inventario.getPosicion();i++)
        {
            at.append(inventario.getVehiculo(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, at);
    }
    
    public void mostrarListaVendidos()
    {
        JTextArea at= new JTextArea();
        for(int i=0; i<inventario.getPosicion();i++)
        {
            at.append(inventario.getVehiculo(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, at);
    }
    
    public void mostrarListaDevueltos()
    {
        JTextArea at= new JTextArea();
        for(int i=0; i<inventario.getPosicion();i++)
        {
            at.append(inventario.getVehiculo(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, at);
    }
    
    public void agregarVehiculoFabricado()
    {
        byte estado= Byte.parseByte(JOptionPane.showInputDialog("Introduzca el estado 1 para bodega, 2 para vendido o 3 para devuelto. "));
        int serie=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la serie del nuevo vehiculo. "));
        int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el peso del nuevo motor. "));
        String modMot=JOptionPane.showInputDialog("Introduzca el modelo del nuevo motor. ");
        int serieMot=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la serie del nuevo motor. "));
        inventario.registrarVehiculo(serie, estado,peso,"modMot",serieMot);  
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
