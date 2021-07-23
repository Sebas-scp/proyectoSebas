
package semana9;


public class Cuenta 
{
    private String nombre;
    
    public void establecerNombre(String nombre)
    {
        //this.nombre es para referirse a la variable nombre no local
        this.nombre = nombre;
    }
    
    public String obtenerNombre()
    {
        //nombre se repite, en este caso, se refiere a la variable local nombre
        return nombre;
    } 
}
 