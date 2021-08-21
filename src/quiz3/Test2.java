/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Test2 
{
    public static void main(String[] args) 
    {
        Short i=1222, j=1222;
        if( i==j)
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
    
    /*
    Se esta declarando las variables como Short con mayuscula,
    por lo que son un tipo de variable compleja, lo que significa
    que se tiene que usar el comando "equals" para comparar si
    efectivamente son el mismo valor o no, en lugar del "==". 
    
    */
}
