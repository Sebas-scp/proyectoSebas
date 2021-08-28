
package examen2;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Inventario 
{
    int [] vehiculoAlmacenado;
    int posicion;

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
