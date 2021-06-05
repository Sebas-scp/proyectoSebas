
package Semana3;

public class Metodos 
{
   
   
   //este metodo suma dos numeros tipo entero
   public static int pedro(int numero1, int numero2)
   {
      int resultado;
      resultado = numero1 + numero2;
      return resultado;
    }
   
    //este metodo suma dos numeros de tipo float
    public static float pedro(float numero1, float numero2)
   {
      float resultado;
      resultado = numero1 + numero2;
      return resultado;
    }
    
    /**
     *el metodo maria multiplica dos numeros
     * esto se saca tocando el bombillo de missing javadoc
     * @param numero1
     * @param numero2
     * @return
     */
    public static int multiplicar(int numero1, int numero2)
   {
      int resultado;
      resultado = numero1 * numero2;
      return resultado;
    }
   
   public static int multiplicar(int numero1, int numero2, int numero3)
   {
      int resultado;
      resultado = numero1 * numero2 * numero3;
      return resultado;
    }
   
   
   public static void main (String[] args) 
   {
       //creamos un espacio donde se almacena lo que me da pedro
       int resultadoParaJefe;
       //digito el nombre del metodo (valores de lo que queremos sumar)
      resultadoParaJefe =  pedro(3,4);
      System.out.print(resultadoParaJefe);
       
   }
}     

           

