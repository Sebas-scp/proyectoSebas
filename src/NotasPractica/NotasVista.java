/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasPractica;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class NotasVista 
{
    boolean modoGrafico;
    Scanner scan= new Scanner(System.in);
    Notas nota;
    
    public NotasVista(boolean modoGrafico,Notas notasInstanciadas)
    {
        this.modoGrafico=modoGrafico;
        this.nota=notasInstanciadas;
    }
    
    public int tamanoArreglo()
    {
        if (modoGrafico)
        {
            return Integer.parseInt(JOptionPane.showInputDialog("Cantidad estudiantes?"));
        }
        else
        {
            System.out.println("Cantidad estudiantes: ");
            int cantEstudiantes=scan.nextInt();
            return cantEstudiantes;
        }
        
    }
    
    public void registrarNotas()
    {
        double notaIntro;
        if(modoGrafico)
        {
            notaIntro=Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
            nota.agregarNotas(notaIntro);
        }
        else
        {
            System.out.println("Nota: ");
            notaIntro=scan.nextDouble();
            nota.agregarNotas(notaIntro);
        }
    }
    public void mostrarNotas()
    {
        if(modoGrafico)
        {
            JTextArea area= new JTextArea();
            for(int i=0; i<nota.getPosicion();i++)
            {
                area.append(nota.getNota(i)+"\n");
            }
            JOptionPane.showMessageDialog(null, area);
        }
        else
        {
            for(int i=0; i<nota.getPosicion();i++)
            {
                System.out.println(nota.getNota(i)+"\n");
            }
        }
        
    }
    
    public byte opcion()
    {
        byte opcion=0;
        if(modoGrafico)
        {
           opcion = Byte.parseByte(JOptionPane.showInputDialog("Opciones: \n 1. Agregar nota \n 2. Ver notas \n 3. Salir"));
           if(opcion<1 || opcion>3)
           {
               JOptionPane.showMessageDialog(null, "Opcion invalida");
               return 3;
           }
           else
               return opcion;
        }
        else
        {
            System.out.println("Opciones: \n 1. Agregar nota \n 2. Ver notas \n 3. Salir");
            opcion=scan.nextByte();
            if(opcion<1 || opcion>3)
            {
                System.out.println("Opcion invalida");
                return 3;
            }
            return opcion;
        }
    }
}

