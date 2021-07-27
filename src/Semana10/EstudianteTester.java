/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author usuario
 */
public class EstudianteTester 
{
    public static void main(String[] args) 
    {
        Estudiante beta= new Estudiante("Miguel", 5);
        Estudiante alpha= new Estudiante("Sebastian",7);
        
        System.out.println(alpha.getNombre()+" "+alpha.getLegajo());
        
        /*
        beta.setLegajo(5);
        beta.setNombre("Miguel");
        
        alpha.setLegajo(48);
        alpha.setNombre("Zapo");
        */
        
    }
}
