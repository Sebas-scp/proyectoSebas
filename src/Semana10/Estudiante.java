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
public class Estudiante 
{
    private String nombre;
    private int legajo;
    
    //metodo constructor: public (nombre clase, empieza en mayus) y ()
    public Estudiante(String nombreEstudiante, int valorLegajo)
    {
        legajo= valorLegajo;
        nombre= nombreEstudiante;
    }
    
    
    
    
    public int getLegajo()
    {
        return legajo;
    }
        
    public void setLegajo(int valorLegajo)
    {
        legajo = valorLegajo;
    }
        
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String valorNombre)
    {
        nombre= valorNombre;
    }
    
}
