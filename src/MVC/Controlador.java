
package MVC;

/*
 * @author Sebastian Cordero Mora
 */
public class Controlador 
{
    Nota notas= new Nota(10);
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
                    vista.ingresoDatos();
                    break;
                    
                case 2:
                    vista.mostrarDatos();
                    break;       
            }
        }while(op!=3);
    }
}
