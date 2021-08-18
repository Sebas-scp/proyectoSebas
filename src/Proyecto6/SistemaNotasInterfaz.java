package Proyecto6;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SistemaNotasInterfaz {
    Scanner scan= new Scanner(System.in);
    private Nota nota;
    boolean modoGrafico;

    public SistemaNotasInterfaz(Nota notaInstanciada, boolean modoGrafico) {
        this.nota = notaInstanciada;
        this.modoGrafico= modoGrafico;
    }
    
    public int leaTamanoArreglo() 
    {
        if (modoGrafico)
            return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
        else
        {
            int cantEstudiantes;
            System.out.println("Digite la cantidad de estudiantes: ");
            cantEstudiantes= scan.nextInt();
            return cantEstudiantes;
        }
    }

    public void leaNota()
    {
        if (modoGrafico)
        {
            double notaDigitada;
        
            notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));

            nota.agregarNota(notaDigitada);
        }
        else
        {
            System.out.println("Nota?");
            double notaDigitada=scan.nextDouble();
            nota.agregarNota(notaDigitada);
        }
        
    }

    public void muestreNotas() 
    {
        if(modoGrafico)
        {
            JTextArea jt = new JTextArea();
            for (int i = 0; i < nota.getIndice(); i++) 
            {
                jt.append(nota.getNota(i) + "\n");
            }
            JOptionPane.showMessageDialog(null, jt);
        }
        
        else
        {
            for(int i=0;i<nota.getIndice(); i++)
            {
                System.out.println(nota.getNota(i)+"\n");
            }
        }
        
    }

    public int getOpcion() 
    {
        if(modoGrafico)
        {
         int r = 0;
         try 
         {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) 
            {
                throw new Exception("# de opcion  es inválido");
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         return r; 
        }
        
        else
        {
            int opcion=0;
            try 
            {
               System.out.println("1. Agregar nota\n2. Mostrar Notas\n3.Salir");
               opcion=scan.nextInt();
               if ((opcion < 1) || (opcion > 3)) 
               {
                   throw new Exception("# de opcion  es inválido");
               }
            } catch (Exception e)
            {
                System.out.println("# de opcion  es inválido");
            }
            return opcion;   
        }
    }
}
