/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author usuario
 */
public class Casting 
{
    //psvm + tab saca el metodo main:
    public static void main(String[] args) 
    {
        //widening casting (automatico): no hay problema porque tengo mas espacio
        //narrowning casting (manual):hay problema porque tengo menos espacio
        int a = 50000;
        short b = 32767;
        
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        
        //al revez, se genera un error, hay que hacer un casteo manual
        b=(short)a;
       
       
        System.out.println("B: "+b);
               
    }
}
