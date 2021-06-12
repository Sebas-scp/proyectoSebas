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
    public static String cita(int factorRiesgo)
    {
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

