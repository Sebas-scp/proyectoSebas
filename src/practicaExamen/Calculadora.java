//problema 2
package practicaExamen;

import java.util.Scanner;

public class Calculadora 
{
    //1 metodo para sumar:    
    public static int suma()
    {
        Scanner entrada2= new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = entrada2.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        int num2 = entrada2.nextInt();
        int resultado = num1 + num2;
        return resultado; 
    }
    
    //2 metodo para multiplicar:
    public static int multi(int num1, int num2)
    {
        int resultado = num1 * num2;
        return resultado;
    }
    
    
    
    //2.1 metodo para promedio:
    public static double prom()
    {
        Scanner entrada = new Scanner(System.in);
        double num=0;
        int total=0;
        int contador=0;
        while (num!=-1)
        {
            total += num; 
            contador++;
            System.out.print("Escriba los numeros o -1 para terminar: ");
            num = entrada.nextDouble();
        }
        if (total != 0)
        {
            double promedio = (double) total / contador;
            return promedio;
        }
        else 
            System.out.println("No se introdujeron numeros");  
            return 0;
    }
    
    //2.2 metodo para factorial
    public static int factorial()
    {
        int num=1;
        int contador=1;
        
        //se pide al usuario el numero que desee calcular el factorial
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero a calcular el factorial (!): ");
        num= entrada.nextInt();
        
        if (num==0)
            return 0;
        
        while (num>0)
        {  
           contador *= num;
           num--;
        }
        return contador;
    }
    
    //2.3 metodo para maximo
    public static int maxNum()
    {
        Scanner entrada2 = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        System.out.println("Introduzca los 4 numeros a calcular el maximo: ");
        while (entrada2.hasNext())
        {
            numero1=entrada2.nextInt();
            numero2=entrada2.nextInt();
            numero3=entrada2.nextInt();
            numero4=entrada2.nextInt();
            
            if (numero1>numero2 && numero1>numero3 && numero1>numero4)
                return numero1;
            
            else if (numero2>numero1 && numero2>numero3 && numero2>numero4)
                return numero2;
            
            else if (numero3>numero1 && numero3>numero2 && numero3>numero4)
                return numero3;
            
            else if (numero4>numero1 && numero4>numero2 && numero4>numero3)
                return numero4;
            
            
            
        }
        return 0;
            
    }
    
    //2.4 metodo para invertir el orden de numeros
    public static String inversorNum()
    {
        Scanner entrada2 = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        String orden="";
        System.out.println("Introduzca los 4 numeros a invertir: ");
        while (entrada2.hasNext())
        {
            numero1=entrada2.nextInt();
            numero2=entrada2.nextInt();
            numero3=entrada2.nextInt();
            numero4=entrada2.nextInt();
            break;
            
        }
        System.out.println("numeros invertidos: ");
        System.out.printf("%d%n%d%n%d%n%d%n",numero4,numero3,numero2,numero1);
        return orden;
    }
    
    //problema 7 calcular exponentes
    public static float exponentes()
    {
        Scanner entrada2= new Scanner(System.in);
        int contador=0;
        // base es x
        System.out.println("Introduzca el numero base: ");
        float base=entrada2.nextFloat();
        
        //exponente es y
        System.out.println("Introduzca el exponente: ");
        float exponente=entrada2.nextFloat();
        
        float resultado=1;
        
        while (contador != exponente)
        {
            resultado*=base;
            contador++;
        }
        return resultado;
    }
    
    
    public static int activarCalculadora()
    {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int opcion = 0;
        
        
        
        while (true)
        {
            System.out.print("Opciones escriba: 1 para suma,2 para multiplicar, 3 para promedio, 4 para factorial"
            + ", 5 para maximo, 6 para inversor, 7 para exponentes o -2 para terminar: ");
            opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    int resultadoSuma =  suma();
                    System.out.printf("El resultado es: %d%n",resultadoSuma);
                    
                    break;
                    
                    
                case 2:
                    System.out.println("Introduzca el primer numero: ");
                    int numero1 = entrada2.nextInt();
                    
                    System.out.println("Introduzca el segundo numero: ");
                    int numero2 = entrada2.nextInt();
                   
                    int resultadoMulti;
       
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    resultadoMulti =  multi(numero1,numero2);
                    System.out.printf("El resultado es: %d%n",resultadoMulti); 
                   
                    break;
                    
              
                case 3:
                    double resultadoProm;
       
                    //digito el nombre del metodo (valores de lo que queremos sumar)
                    resultadoProm = prom();
                    System.out.printf("El promedio es: %f%n",resultadoProm); 
                    
                    break;
                    
                case 4:
                    int resultadoFactorial = factorial();
                    System.out.printf("El factorial del numero introducido es: %d%n",resultadoFactorial);
                    
                    break;
                    
                case 5:
                    int resultadoMax = maxNum();
                    System.out.printf("El maximo entre los numeros es: %d%n",resultadoMax);
                    
                    break;
                    
                case 6:
                    String resultadoInversor; 
                    resultadoInversor= inversorNum();
                    System.out.println(resultadoInversor);
                    
                    break;
                    
                case 7:
                    float resultadoExpo = exponentes();
                    System.out.printf("El resultado es:  %f%n",resultadoExpo);
                    
                    break;
                
                    
                case -2:
                    System.out.println("Terminado");
                    break;
            }  
        }
    }   
}
