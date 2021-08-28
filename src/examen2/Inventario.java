
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Inventario 
{
    int [] vehiculoAlmacenado;
    int posicion;
    byte estado; //1. bodega 2. vendidos 3. devueltos
    SistemaVista vista;
    Automovil auto;
    
    public Inventario(int cantidadAutos)
    {
        vehiculoAlmacenado= new int[cantidadAutos];
        posicion = 0;
    }
    
    public void registrarVehiculo(int serieVehiculo, byte estado, int peso, String modeloMot, int serie)
    {
        switch(estado)
        {
            case 1: //almacen
            {
                vehiculoAlmacenado[posicion++]=serieVehiculo;
                Motores motor= new Motores(peso,"modeloMot",serie);
                
                break;
            }

            case 2: //vendido
            {
                vehiculoAlmacenado[posicion++]=serieVehiculo;
                Motores motor= new Motores(peso,"modeloMot",serie);
                break;
            }

            case 3: //devuelto
            {
                vehiculoAlmacenado[posicion++]=serieVehiculo;
                Motores motor= new Motores(peso,"modeloMot",serie);
                break;
            }
        }
    }
    
    private void establecerComoVendido(Automovil auto){
    }
    
    private void establecerComoDevuelto(Automovil auto){
    }
    
    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    public int[] getVehiculoAlmacenado() {
        return vehiculoAlmacenado;
    }

    public void setVehiculoAlmacenado(int[] vehiculoAlmacenado) {
        this.vehiculoAlmacenado = vehiculoAlmacenado;
    }

    public int getPosicion() {
        return posicion;
    }

   public int getVehiculo(int i){
       return vehiculoAlmacenado[i];
   }
    
    
}
