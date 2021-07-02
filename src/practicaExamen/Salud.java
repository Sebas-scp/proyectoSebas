
package practicaExamen;

import java.util.Scanner;


public class Salud 
{
    
    public static void main(String[] args)
    {
        int citasAsignadas=0;
        byte pacientesCovid=0;
        Scanner entrada = new Scanner(System.in);
        byte opcion=0;
        String nombre="";
        byte edad=0;
        String sexo="";
        boolean covid=false;
        boolean antecedentes=false;
        byte nivelSalud=0;
        
        while(true)
        {
            System.out.println("Menu opciones digite el numero correspondiente: "
            +"\n 1.Datos basicos"
            +"\n 2.Evaluar salud"
            +"\n 3.Resumen paciente"
            +"\n 4.Agendar vacunacion"
            +"\n 5.Registrar otro usuario"
            +"\n 6.Mostrar icono"
            );
            opcion=entrada.nextByte();
            switch(opcion)
            {
                //datos basicos
                case 1:
                    
                    System.out.println("Digite su nombre y apellidos: ");
                    nombre= entrada.next();
                    nombre+=" ";
                    nombre+=entrada.next();
                    nombre+=" ";
                    nombre+=entrada.next();
                    
                    System.out.println("Digite su edad: ");
                    edad = entrada.nextByte();
                    
                    System.out.println("Digite su sexo, M masculino o F femenino: ");
                    sexo = entrada.next();
                    
                    System.out.println("Tuvo covid? Escriba true para si y false para no: ");
                    covid = entrada.nextBoolean();
                    if (covid==true)
                      pacientesCovid++; 
                    break;
                
                //Evaluacion salud
                case 2:
                    
                    System.out.println("nivel salud: describa su salud en escala del 1 al 10, siendo 1 bajo y 10 alto: ");
                    nivelSalud = entrada.nextByte();
                    
                    
                    System.out.println("Tiene antecedentes de alguna enfermedad? Escriba true para si o false para no: ");
                    antecedentes = entrada.nextBoolean();
                    break;
                
                //Imprimir info
                case 3:
                    System.out.println("Nombre y apellidos: "+nombre
                       +"\nEdad: "+ edad +"\nSexo: "+ sexo + "\nTiene covid: "
                       +covid);
                    if (edad>=60 || antecedentes==true || covid==true )
                    {
                        System.out.println("CONDICION DE ALERTA");
                    }
                    break;
                
                
                //Citas vacuna
                case 4:
                    String mes="";
                    if (edad>=90)
                        mes="Mayo";
                    else if (edad>=70)
                        mes="Junio";
                    else if (edad>=50)
                        mes="Julio";
                    else if (edad<50)
                        mes="Agosto";
                    
                    int calculoDia=0;
                    if (covid==true)
                        calculoDia=nivelSalud+1;
                    else
                        calculoDia=nivelSalud+citasAsignadas;
                    
                    citasAsignadas=citasAsignadas+2;
                    
                    System.out.println("Fecha de primer vacuna: "+ calculoDia +" de "+ mes);
                    System.out.println("Fecha de segunda vacuna: "+ (calculoDia+10) +" de "+ mes);
                    break;
                    
                //reiniciar usuario    
                case 5:
                    opcion=0;
                    nombre="";
                    edad=0;
                    sexo="";
                    covid=false;
                    antecedentes=false;
                    nivelSalud=0;
                    break;
                
                //imprimir compugrama
                case 6:
                    byte n=8;
                    System.out.println("Tamano?: ");
                    n=entrada.nextByte();
                    for (byte i=1;i<n;i++)
                        System.out.print("*");
                    System.out.println("");
                    for (byte i=1;i<n;i++)
                        System.out.print("*");
                    
                    
                    
                    for(byte i=1;i<n;i++)
                    {
                        for(byte j=1;j<n;j++)
                        {
                            if (i==j)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.println("");  
                    } 
            }   
        }
    }
}
