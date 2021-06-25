//problema 3 impuesto de la renta
package practicaExamen;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class impuestoRenta 
{
 public static double calcularImpuesto(int numDependientes, double salario)
    {
        double monto=0;
        if (salario <= 200000)
            monto = 0;
        else if ( salario <= 400000 )
            monto = 0.10;
        else if ( salario <= 600000 )
            monto = 0.15; 
        else if ( salario <= 800000 )
            monto = 0.20;    
        else if ( salario > 800000 )
            monto = 0.30;
        
        double monto2 = 0;
        if (numDependientes == 1)
            monto2 = salario*1;
        else if ( numDependientes == 2 )
            monto2 = salario*0.90;
        else if ( numDependientes == 3 )
            monto2 = salario*0.70;
        else if ( numDependientes == 4 )
            monto2 = salario*0.60;
        else if ( numDependientes >4 )
            monto2 = salario*0.40;
        
        double impuesto = monto2*monto;
        return impuesto;
    }
 
 
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Introduzca su salario: ");
    double salario= entrada.nextDouble();
    
    System.out.println("Introduzca sus dependientes: ");
    int numDependientes = entrada.nextInt();
    
    double pagar = calcularImpuesto(numDependientes,salario);
    System.out.printf("El monto a pagar es:  %f%n",pagar);
    
  }
}
