
package Proyecto6;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class SistemaNotasReporte 
{
    Examen examen;
    Alumno alumno;
    
    Examen[] baseDatos;
    public SistemaNotasReporte(Examen[] examenes)
    {
        this.baseDatos=examenes;
    }
    
    public void generarReporteTodosExamenes()
    {
        examen.getNombreMateria();
        examen.getNota();
        examen.getPuntosTotal();
        examen.getPuntosObtenidos();
    }
    
    public void generarReporteTodosAlumnos()
    {
        examen.getNombreMateria();
        examen.getAlumno();
    }
    
    public void generarReporteAlumnosConNotaInferiorA(int nota)
    {
        alumno.getNombre();
        alumno.getApellidos();
        alumno.getCarnet();
    }
    
    public void generarReporteTodosExamenesOrdenadosPor(String propiedad)
    {
        alumno.getNombre();
        alumno.getApellidos();
        alumno.getCarnet();
        
        examen.getNota();
        examen.getPuntosObtenidos();
        examen.getPuntosTotal();
    }
}
