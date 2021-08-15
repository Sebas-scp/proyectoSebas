/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2MIO;

/**
 *
 * @author usuario
 */
public class EquipoSONIDO2 
{
    String[] arregloSonido;
    int posicion;
    Parlante2 parDer;
    Parlante2 parIzq;
    Parlante2 sub;
    Reloj2 reloj;
    Radio2 radio;

    public EquipoSONIDO2(int cantidadAudios)
    {
        arregloSonido=new String[cantidadAudios];
        posicion =0;
        parDer = new Parlante2(6,true,'D');
        parIzq = new Parlante2(6,true,'I');
        sub = new Parlante2(6,true,'S');
    }
    
    
    public void agregarAudios(String audio)
    {
        try
        {
            try
            {
                arregloSonido[posicion++]=audio;
            }catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de audios");
                posicion--;
            }
        }catch(Exception e){
                    System.out.println("error mas general");
            } 
    
    }


    public void programarEncendido(int hora, int minuto)
    {
         reloj= new Reloj2();
         reloj.setAlarm(hora,minuto);
    }
    
    public String getAudio(int i)
    {
        return arregloSonido[i];
    }

    public String[] getArregloSonido() 
    {
        return arregloSonido;
    }

    public void setArregloSonido(String[] arregloSonido) 
    {
        this.arregloSonido = arregloSonido;
    }

    public int getPosicion() 
    {
        return posicion;
    }

    public void setPosicion(int posicion)
    {
        this.posicion = posicion;
    }
    
    
    
    
    
}
