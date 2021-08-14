
package semana13;


import MVC.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * @author Sebastian Cordero Mora
 */
public class Vista 
{
    ExpedienteEstudiante nota;
    
   public Vista(ExpedienteEstudiante notaInstanciada)
   {
       this.nota=notaInstanciada;
   }
   public void leaNota()
   {
       String codigoCurso;
       codigoCurso = JOptionPane.showInputDialog("Codigo curso?");
       
       String nombreCurso;
       nombreCurso = JOptionPane.showInputDialog("Nombre curso?");
       
       String carnet;
       carnet=JOptionPane.showInputDialog("Carnet?");
       
       String nombreEstudiante;
       nombreEstudiante=JOptionPane.showInputDialog("nombre estudiante?");
       
       double notaDigitada;
       notaDigitada= Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
       
       Curso c= new Curso(codigoCurso,nombreCurso);
       Estudiante e = new Estudiante(carnet,nombreEstudiante);
       CursoEstudiante ce= new CursoEstudiante(c,e,notaDigitada);
       
       
       nota.agregarRegistro(ce);
   }
   
   
   public void mostrarDatos()
   {
       //introduce el area de texto para mostrar las notas registradas
       JTextArea at = new JTextArea();
       for(byte i=0;i<nota.getPosicion();i++)
       {
           //accesa al arreglo con getNotas en la posicion i
            at.append(
                        nota.getNotas(i).getCurso().getCodigo()
                    +" "+nota.getNotas(i).getCurso().getNombre()
                    +" "+nota.getNotas(i).getEstudiante().getCarnet()
                    +" "+nota.getNotas(i).getEstudiante().getNombre()
                    + "\n");      
       }
       JOptionPane.showMessageDialog(null, at);
   }
   
   public int menuOP()
   {
       byte opcion=0;
       try
       {
           opcion= Byte.parseByte(JOptionPane.showInputDialog("1.Agregar Registro\n 2.Mostrar Registro\n 3.Terminar\n"));
           if (opcion<1 || opcion>3)
                throw new Exception("# de opcion  es inválido");
                
       }catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
       
       return opcion;
   }
}
