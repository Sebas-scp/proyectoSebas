
package MVC;

/*
 * @author Sebastian Cordero Mora
 */
public class Nota 
{
    double [] arregloNotas;
    int posicion;
    
    public Nota(int cantidadEstudiantes)
    {
        arregloNotas= new double[cantidadEstudiantes];
        posicion=0;
    }
    
    
    public void registrarNotas(double notaEstudiante)
    {
        try
        {
             arregloNotas[posicion++]= notaEstudiante;   
        } catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Error, demasiados datos ingresados.");
            posicion--;       
        }  
    }
    
    public int getPosicion()
    {
        return posicion;
    }
    
    public double getNotas(int i)
    {
        return arregloNotas[i];
    }
}
