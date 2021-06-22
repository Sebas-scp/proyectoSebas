
package practicaExamen;

import practicaExamen.Calculadora;

public class TesterCalc 
{
    public static void main(String[] args)
    {
        Calculadora usar= new Calculadora();
        int metodo= usar.activarCalculadora();
        System.out.print(metodo);
    }
}
