package quiz2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EquipoSonidoVista {

    private EquipoSonido equipoSonido;

    public EquipoSonidoVista(EquipoSonido notaInstanciada) {
        this.equipoSonido = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void agregarAudio() {
        String audio;
        
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Audio?"));

        equipoSonido.agregarAudio(audio);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < equipoSonido.getIndice(); i++) {
            jt.append(equipoSonido.getAudio(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar audio\n2. Reproducir audios orden\n3.reproducir audios aleatorios \n4 4."));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
