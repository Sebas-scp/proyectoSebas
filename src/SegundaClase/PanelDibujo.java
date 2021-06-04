package SegundaClase;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);

        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total

        // dibuja una línea de la esquina superior izquierda a la esquina inferior derecha

        g.drawLine(0, 0, anchura, altura);

        // dibuja una línea de la esquina inferior izquierda a la esquina superior derecha

        g.drawLine(0, altura, anchura, 0);
    }
} // fin de la clase PanelDibujo


 
    
    
    
    
    
    
    
    

