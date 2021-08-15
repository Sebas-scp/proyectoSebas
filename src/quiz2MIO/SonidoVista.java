
package quiz2MIO;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author Sebastian Cordero Mora
 */
public class SonidoVista 
{
    private EquipoSONIDO2 equipoSonido;

    public SonidoVista(EquipoSONIDO2 sonidoInst) {
        this.equipoSonido = sonidoInst;
    }
    
    public int cantidadAudio()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Cantidad de audios?"));
    }
    
    public void agregarAudio()
    {
        String audio=JOptionPane.showInputDialog("Introduzca el audio");
        equipoSonido.agregarAudios(audio);
    }
    
    public void reproducirOrden()
    {
        JTextArea jt= new JTextArea();
        for(int i=0;i<equipoSonido.getPosicion(); i++)
        {
            jt.append(equipoSonido.getAudio(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }
    
    public void reproducirAleatorio()
    {
        int min=1;
        int max=equipoSonido.getPosicion();
        int audioRand=(int)Math.floor(Math.random()*(max-min+1)+min);
        JTextArea jt= new JTextArea();
        for(int i=0;i<equipoSonido.getPosicion(); i++)
        {
            jt.append(equipoSonido.getAudio(audioRand) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }
}
