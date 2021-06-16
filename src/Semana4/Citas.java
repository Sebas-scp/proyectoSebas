/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Citas 
{
    // este es el javadoc usado para explicar lo que hace mi clase, los metodos y los parametros. se obtiene seleccionando la clase y tocando el bombillo
    /**
     *este metodo retorna la fecha de vacunacion usando la cantidad de factores de riesgo
     * @param factorRiesgo es la cantidad de factores de riesgos de la persona a sacar cita
     * @return un mensaje con el calendario
     */
    public static String cita()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca numero de factor de riesgo: ");
        byte factorRiesgo=0;
        factorRiesgo=entrada.nextByte();  
        
        String salida ="";
        
        if (factorRiesgo==1)
            salida= "cita dentro de una semanas";
        else if (factorRiesgo==2)
            salida= "cita dentro de tres dias";
        else
            salida= "cita para manana";
        
        return salida;
    } 
}

