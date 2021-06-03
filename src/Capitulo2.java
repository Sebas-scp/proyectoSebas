
import java.util.Scanner;

// Bienvenido a java, este es el comando para texto


public class Capitulo2 
{
    
    public static void main(String[] args) 
    {
        System.out.print("Bienvenido a ");
        System.out.println("Programacion en Java!");
        System.out.println("Bienvenido\na\nProgramacion\nEn java!");
        // ingresar \n dentro del texto es un enter
        System.out.printf("%s%n%s%n", 
                "Bienvenido a", "la programacion en Java!");
        System.out.println();
        System.out.println();   
        
        //creacion de un scanner
        Scanner entrada= new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        
        System.out.print("Escriba el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        numero2= entrada.nextInt();
        resultado = numero1 + numero2;
        System.out.printf("El resultado es: %d%n",resultado);
        // tambien se puede hacer asi:
        System.out.printf("El resultado es: %d%n", numero1+numero2);
        
      
    }
}
