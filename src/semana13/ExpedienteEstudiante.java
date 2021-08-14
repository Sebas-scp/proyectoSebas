
package semana13;

import MVC.*;

/*
 * @author Sebastian Cordero Mora
 */
public class ExpedienteEstudiante 
{
    private CursoEstudiante [] arregloCursos;
    int posicion;
    
    public ExpedienteEstudiante(int cantidadEstudiantes)
    {
        arregloCursos= new CursoEstudiante[cantidadEstudiantes];
        posicion=0;
    }
    
    
    public void agregarRegistro(CursoEstudiante registro)
    {
        try
        {
             arregloCursos[posicion++]= registro;   
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
    
    public CursoEstudiante getNotas(int i)
    {
        return arregloCursos[i];
    }
    
    public void setArregloNotas(CursoEstudiante[] arregloNotas)
    {
        this.arregloCursos= arregloNotas;
    }
}
