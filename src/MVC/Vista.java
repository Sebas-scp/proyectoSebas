
package MVC;


import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * @author Sebastian Cordero Mora
 */
public class Vista 
{
    Nota nota;
    
   public Vista(Nota notaInstanciada)
   {
       this.nota=notaInstanciada;
   }
   
   public void ingresoDatos()
   {
       double notaIngresada=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota: "));
       nota.registrarNotas(notaIngresada);
   }
   
   public void mostrarDatos()
   {
       for(byte i=0;i<nota.getPosicion();i++)
       {
           //introduce el area de texto para mostrar las notas registradas
           JTextArea at = new JTextArea();
           
           //accesa al arreglo con getNotas en la posicion i
           for(i=0;i<nota.getPosicion();i++)
           {
                at.append(nota.getNotas(i)+ "\n");
           }
           JOptionPane.showMessageDialog(null, at);       
       }
   }
   
   public int menuOP()
   {
       byte opcion=0;
       try
       {
           opcion= Byte.parseByte(JOptionPane.showInputDialog("1.Registrar notas\n 2.Mostrar notas\n 3.Terminar\n"));
           if (opcion<1 || opcion>3)
                throw new Exception("# de opcion  es inválido");
                
       }catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
       
       return opcion;
   }
}
