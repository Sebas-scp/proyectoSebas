
package Proyecto6;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Examen 
{
    Alumno alumno;
    private int nota;
    private String nombreMateria;
    private int puntosTotal;
    private int PuntosObtenidos;
    //private Date fecha;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public int getPuntosObtenidos() {
        return PuntosObtenidos;
    }

    public void setPuntosObtenidos(int PuntosObtenidos) {
        this.PuntosObtenidos = PuntosObtenidos;
    }
}
