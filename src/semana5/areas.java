
package semana5;

import java.util.Scanner;


public class areas 
{
    public static int cuadrado()
    {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca el lado del cuadrado: ");
        int lado= entrada.nextInt();
        int area = lado*4;
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
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        byte opcion=0;
        System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo o -1 para terminar: ");
        opcion= entrada.nextByte();
        while (entrada.hasNext())
        {
            switch (opcion)
            {
                case 1:
                    int resultadoArea=cuadrado();
                    System.out.printf("El area del cuadrado es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo o -1 para terminar: ");
                    break;
                case 2:
                    resultadoArea=rectangulo();
                    System.out.printf("El area del rectangulo es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo o -1 para terminar: ");
                    break;
                case 3:
                    resultadoArea=triangulo();
                    System.out.printf("El area del triangulo es: %d%n",resultadoArea);
                    opcion=0;
                    System.out.println("Introduzca 1 para area cuadrado, 2 para area rectangulo, 3 area triangulo o -1 para terminar: ");
                    break;
                case -1:
                    System.out.println("Terminado.");
                    break;     
            }
        }
    }
}
