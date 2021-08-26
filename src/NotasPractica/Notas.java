/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasPractica;

/**
 *
 * @author usuario
 */
public class Notas 
{
    double [] arregloNotas;
    int posicion;
    
    /**
     *
     * @param cantidadEstudiantes introduzca la cantidad de estudiantes
     */
    public Notas(int cantidadEstudiantes)
   {
       arregloNotas=new double [cantidadEstudiantes];
       posicion=0;
   }
   
   public void agregarNotas(double notaInt)
   {
       try
       {
           try
           {
               arregloNotas[posicion++]=notaInt;
           }
           catch(ArrayIndexOutOfBoundsException ae)
           {
               System.out.println("Muchas notas introducidas");
               posicion--;
           }   
       }
       catch(Exception e)
       {
           System.out.println("Problema general");
       }
   }
    
    
    
    
    public double[] getArregloNotas() {
        return arregloNotas;
    }

    public double getNota(int i){
        return arregloNotas[i];
    }

    public int getPosicion() {
        return posicion;
    }

   public void setArregloNotas(double[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }
    
    
}
