
package examen1;

import java.util.Scanner;

/**
 * @Sebastian Cordero Mora
 * carnet: 20210121156
 */
public class Economia 
{
    public static void main(String[] args)
    {
        //datos basicos
        String nombreEmpresa="";
        String provincia="";
        int cantidadTrabajadores=0;
        int cantidadCovid=0;
        int ingresoPromedio=0;
        boolean creditos=false;
        
        //poblacion de provincias
        int sanJose=1404242;
        int alajuela=848146;
        int cartago=490903;
        int heredia=433677;
        int liberia=326953;
        int puntarenas=410929;
        int limon=386862;
        
        byte opcion=0;
        Scanner entrada= new Scanner(System.in);
       
        while(true)
        {
            System.out.println("Menu digite el numero de las siguientes opciones: "
               +"\n 1.Datos basicos"
               +"\n 2.Informacion registrada"
               +"\n 3.Monto a prestar"
               +"\n 4.Borrar datos registrados"

            );
            opcion=entrada.nextByte();
            switch(opcion)
            {
                //datos basicos
                case 1:
                    System.out.println("Nombre de la empresa: ");
                    nombreEmpresa=entrada.next();
                    
                    System.out.println("Provincia donde se ubica: ");
                    provincia=entrada.next();
                    
                    System.out.println("Cantidad de trabajadores: ");
                    cantidadTrabajadores=entrada.nextInt();
                    
                    System.out.println("Cantidad de trabajadores con COVID19: ");
                    cantidadCovid=entrada.nextInt();
                    
                    System.out.println("Monto de ingreso promedio por mes: ");
                    ingresoPromedio=entrada.nextInt();
                    
                    System.out.println("Tiene creditos? escriba true para si o false para no: ");
                    creditos=entrada.nextBoolean();
                    break;
                
                case 2:
                    System.out.printf("Nombre de la empresa: %s%n"
                        +"\n Provincia: %s"
                        +"\n Cantidad trabajadores: %d"
                        +"\n Trabajadores con COVID19: %d"
                        +"\n Ingreso promedio mensual: %d"
                        +"\n Creditos: %b"
                        ,nombreEmpresa,provincia,cantidadTrabajadores,cantidadCovid,ingresoPromedio,creditos
                        );
                    break;
                    
                case 3:
                    int poblacion=0;
                    switch(provincia)
                    {
                        case "sanjose":
                            poblacion=sanJose;
                            break;
                        case "alajuela":
                            poblacion=alajuela;
                            break;
                        case "cartago":
                            poblacion=cartago;
                            break;
                        case "heredia":
                            poblacion=heredia;
                            break;
                        case "liberia":
                            poblacion=liberia;
                            break;
                        case "puntarenas":
                            poblacion=puntarenas;
                            break;
                        case "limon":
                            poblacion=limon;
                            break;
                    }
                    int monto=(cantidadCovid/cantidadTrabajadores)*poblacion;
                    
                    
                    double interes=0;
                    if (creditos==true)
                        if(cantidadTrabajadores<10)
                            interes=0.5+ajuste;
                        else if (cantidadTrabajadores<30)
                            interes=0.4+ajuste;
                        else if (cantidadTrabajadores>=30)
                            interes=0.3+ajuste;
                    
                    
                                    
            }
        }
    } 
    
    public static double ajuste()
    {
        
        int contador=0;
        int total=0;
        while ()
                
    }
}
