
package semana13;

import MVC.*;

/*
 * @author Sebastian Cordero Mora
 */
public class Controlador 
{
    ExpedienteEstudiante notas= new ExpedienteEstudiante(10);
    Vista vista= new Vista(notas);
    
    public void iniciar()
    {
        int op;
        do
        {
            op=vista.menuOP();
            switch(op)
            {
                case 1:
                    if(notas.getArregloNotas().length==0)
                    {
                        int cant= vista.leaTamanoArreglo();
                        CursoEstudiante[] elNuevoArreglo = new CursoEstudiante[cant];
                        notas.setArregloNotas(elNuevoArreglo);
                    }
                    vista.leaNota();
                    break;
                    
                case 2:
                    vista.mostrarDatos();
                    break;       
            }
        }while(op!=3);
    }
}
