//En este capitulo vemos instrucciones de control IF
public class Capitulo4 
{
    public static void main(String[] args)
    {
        int calificacionEstudiante;
        if (calificacionEstudiante >=60)
            System.out.println("Aprobado");
        else 
            System.out.println("Reprobado");
        
        //if ... else anidadadas:
        //dos formas de escribirlo, 1:
        if (calificacionEstudiante >=90)
            System.out.println("A");
        else 
            if (calificacionEstudiante>=80)
                System.out.println("B");
            else
                if (calificacionEstudiante>=70)
                    System.out.println("C");
                else 
                    if (calificacionEstudiante>=60)
                        System.out.println("C");
                    else 
                        System.out.println("F");
        
        
        //forma 2:
        if (calificacionEstudiante >=90)
            System.out.println("A");
        else if (calificacionEstudiante >=80)
            System.out.println("B");
        else if (calificacionEstudiante >=70)
            System.out.println("C");
        else if (calificacionEstudiante >=60)
            System.out.println("D");
        else 
            System.out.println("F");
        
        //para especificar a cual if pertenece un else:
        int x;
        int y;
        
        if (x>5)
        {
            if (y>5)
                System.out.println("x y y son >5");
        }
        else
            System.out.println("x es <=5");
        
        /* los bloques se definen con {}, el else realizara todo lo que
        se encuentre detro de las llaves pag 110*/
        int calificacion;
        if (calificacion >=60)
            System.out.println("Aprobado");
        else
        {
            System.out.println("Reprobado");
            System.out.println("Debe tomar este curso otra vez");
        }
        
        //operador condicional ?: pags 111-112
        System.out.println(calificacionEstudiante >= 60 ? "aprobado": "Reprobado");
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
