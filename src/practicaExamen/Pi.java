
package practicaExamen;


public class Pi 
{
    public static void main(String[] args)
    {
       double n=3;
       double valorPi=4.00d;
       while (n<=101)
       {
           //2n-1: numeros impar
           valorPi-=4/(2*n-1);
           n++;
           valorPi+=4/(2*n-1);
           System.out.println(valorPi);
       }
    }
}
