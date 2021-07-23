
package semana9;


public class TesterTiempo 
{
    public static void main(String[] args) 
    {
       Tiempo tiempo= new Tiempo();
       mostrarTiempo("Despues de crear el objeto tiempo",tiempo);
       System.out.println();
       
       tiempo.tiempo(4, 45, 32);
       mostrarTiempo("Despues de llamar a Tiempo",tiempo);
       System.out.println();
       
       try
       {
           tiempo.tiempo(105, 89, 111);
       }
       catch (IllegalArgumentException e)
       {
          System.out.printf("Excepcion: %s%n",e.getMessage());
       }
       
       mostrarTiempo("Despues de llamar a tiempo con valores invalidos",tiempo);
       
    }
    
    private static void mostrarTiempo(String encabezado, Tiempo t)
    {
        System.out.printf("%s%n%nTiempo universal: %s%nTiempo estandar: %s%n",
             encabezado,t.horaUniversal(),t.horaStandar());
    }
}
