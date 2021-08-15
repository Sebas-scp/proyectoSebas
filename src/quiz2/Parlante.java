/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Parlante 
{
    private double[] arregloAudios;
    private byte volumen=0;
    private int indice;
    private boolean habilitarParlante=true;
    char tipo; //I izq, D derecho y S subwoofer

    public Parlante(boolean habilitarParlante,int indice, char tipo) 
    {
        this.indice = indice;
        this.tipo = tipo;
    }
    
    
            
}