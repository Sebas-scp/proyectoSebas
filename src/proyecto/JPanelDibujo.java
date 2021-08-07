package proyecto;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para dibujar
 */
public class JPanelDibujo extends JPanel{
  
  
  /* 
   * Constructor del panel para dibujar
   */
  public JPanelDibujo(){
    this.setBackground(Color.GREEN);
  }
  

  
  // Reimplementa paint
  public void paint (Graphics g) { 
        super.paint(g);
        
        int min=1;
        int max=400;
        int randAlto=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randAncho=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randX=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randY=(int)Math.floor(Math.random()*(max-min+1)+min);
        Ovalo ov = new Ovalo(randX,randY,randAncho,randAlto);
        
        
        
        
        int randAltoC=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randAnchoC=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randXC=(int)Math.floor(Math.random()*(max-min+1)+min);
        int randYC=(int)Math.floor(Math.random()*(max-min+1)+min);
        Rectangulo ra = new Rectangulo(randAltoC,randAnchoC,randXC,randYC);
        
        //LINEAS
        g.drawLine(25,90,60,50); //dibuja una línea

        //OVALOS
        g.drawOval(ov.getPosX(), ov.getPosY(),ov.getAncho(), ov.getAlto()); //dibuja un ovalo sin fondo
        g.setColor(Color.blue);     
        g.fillOval(340,50,80,120);  //dibuja un ovalo con fondo azul
        g.setColor(Color.yellow);
        g.fillOval(200,160,160,80); //dibuja un ovalo con fondo amarillo
        
        //RECTANGULOS
        g.drawRect(ra.getPosX(), ra.getPosY(),ra.getAncho(), ra.getAlto());
        g.setColor(Color.blue);
        g.fillRect(randAltoC,randAnchoC,randXC,randYC);
        g.setColor(Color.black);
        g.drawRect(randAltoC,randAnchoC,randXC,randYC);
        g.clearRect(555,100,50,50);//note lo que pasa si comenta esta línea
        
        // STRINGS
        Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.blue);
        g.setFont(fuente);
        g.drawString("Hola mundo!", 5, 360);
        
        // ARCOS
        g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        // POLIGONOS
        Polygon estrella = new Polygon();
        // Este no es estrella
        int cX[] = {420,440,460,480,500,420,420}; // Coordenada x de los puntos del polígono
        int cY[] = {470,430,450,430,490,490,470}; // Coordenada y de los puntos del polígono
        

        estrella.addPoint(510,355);
        estrella.addPoint(590,355);
        estrella.addPoint(525,415);
        estrella.addPoint(550,330);
        estrella.addPoint(580,415);

        g.setColor(Color.red);
        g.drawPolygon(estrella);
        g.setColor(Color.blue);
        g.fillPolygon(cX,cY,cX.length);

     }

}