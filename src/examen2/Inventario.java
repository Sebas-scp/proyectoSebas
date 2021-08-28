
package examen2;

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
    Motores motor;
    Automovil auto;
    
    public Inventario(int cantidadAutos)
    {
        vehiculoAlmacenado= new int[cantidadAutos];
        posicion = 0;
    }
    
    public void registrarVehiculo(int serieVehiculo, byte estado)
    {
        vehiculoAlmacenado[posicion++]=serieVehiculo;
        //info motor:
        int peso=motor.getPeso();
        String mod=motor.getModeloMot();
        int serie=motor.getSerie();
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
