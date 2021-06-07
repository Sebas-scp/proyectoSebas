
package Semana3;

public class Metodos 
{
   
   static int iva = 100;
   //este metodo suma dos numeros tipo entero
   public static int sumar(int numero1, int numero2)
   {
      int resultado;
      resultado = numero1 + numero2;
      return resultado;
    }
   
    //este metodo suma dos numeros de tipo float
    public static long sumar(long numero1, long numero2)
   {
      long resultado;
      resultado = numero1 + numero2 + iva;
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
      int mult = numero1*numero2;
      resultado = sumar(mult,iva);
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
       int salarioBase = 1214123;
       int bonoVentas = 2341411;
       
       float resultadoParaJefe;
       
       //digito el nombre del metodo (valores de lo que queremos sumar)
      resultadoParaJefe =  sumar(salarioBase,bonoVentas);
      System.out.print(resultadoParaJefe);
       
   }
}     

