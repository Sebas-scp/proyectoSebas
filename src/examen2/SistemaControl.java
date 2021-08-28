/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class SistemaControl 
{
    public void iniciar()
    {
        Inventario inv= new Inventario(10);
        SistemaVista vista= new SistemaVista();
    
        byte opcion = 0;
        do
        {
            opcion=vista.opcion();
            switch(opcion)
            {
                case 1:
                    vista.mostrarListaBodega();
                case 2:
                    vista.mostrarListaDevueltos();
                case 3:
                    vista.mostrarListaVendidos();
                case 4:
                    vista.agregarVehiculoFabricado();
            }
        }while(opcion != 5); 
    }
    
}
