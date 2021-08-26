/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasPractica;

/**
 *
 * @author usuario
 */
public class NotasCont 
{
    private Notas nota;
    private NotasVista vista;
    
    public NotasCont()
    {
        nota= new Notas(0);
        vista= new NotasVista(true,nota);
    }
    
    public void iniciar()
    {
        byte opcion=0;
        do
        {
            opcion = vista.opcion();
            switch(opcion)
            {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = vista.tamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                    }
                    
                    vista.registrarNotas();
                    break;

                case 2:
                    vista.mostrarNotas();
                    break;
            }
        } while(opcion != 3); 
    }
}
