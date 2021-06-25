//problema 6 areas
package practicaExamen;

import java.util.Scanner;


public class areas 
{
    public static int cuadrado()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca el lado del cuadrado: ");
        int lado= entrada.nextInt();
        int area = lado*2;
        return area;
    }
    
    public static int rectangulo()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo: ");
        int base= entrada.nextInt();
        System.out.println("Introduzca la altura del rectangulo: ");
        int altura= entrada.nextInt();
        int area = base*altura;
        return area;
    }
    
    public static int triangulo()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo: ");
        int base= entrada.nextInt();
        System.out.println("Introduzca la altura del triangulo: ");
        int altura= entrada.nextInt();
        int area = (base*altura)/2;
        return area;
    }
    
    public static float circulo()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca el radio del circulo: ");
        float radio= entrada.nextFloat();
        float area = 3.14159f*radio*radio;
        return area; 
    }
    
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        byte opcion=0;
        System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo, 4 area circulo o -1 para terminar: ");
        while (entrada.hasNext())
        {
            opcion= entrada.nextByte();
            switch (opcion)
            {
                case 1:
                    int resultadoArea=cuadrado();
                    System.out.printf("El area del cuadrado es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo, 4 area circulo o -1 para terminar: ");
                    break;
                    
                case 2:
                    resultadoArea=rectangulo();
                    System.out.printf("El area del rectangulo es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo, 4 area circulo o -1 para terminar: ");
                    break;
                    
                case 3:
                    resultadoArea=triangulo();
                    System.out.printf("El area del triangulo es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo, 4 area circulo o -1 para terminar: ");
                    break;
                    
                case 4:
                    float resultadoAreaCirca=circulo();
                    System.out.printf("El area del circulo es: %f%n",resultadoAreaCirca);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo, 4 area circulo o -1 para terminar: ");
                    break;
                    
                case -1:
                    System.out.println("Terminado.");
                    break;     
            }
        }
    }
}
