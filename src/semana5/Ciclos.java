/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author usuario
 */
public class Ciclos 
{
    public static void main(String[] args)
    {
        int contador=0;
        while (contador <= 1000)
        {
            System.out.println(contador);
            ++contador;
        }
        
        
        for(int contador2=0; contador2<1000; ++contador2)
        {
            System.out.print(contador2);
        }
        
    } 
}
