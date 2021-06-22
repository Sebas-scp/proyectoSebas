package semana5;

public class EjemploSwitch {

    public static void main(String[] args) {
        int edad = 40;

        switch (edad) 
        {
            case 10: {
                System.out.println("Usted tiene 10 anos");
                break;
            }
            case 20: //se ejecuta todo lo que esta hacia abajo
            {
                System.out.println("Usted tiene 20 anos");
                break;
            }
            case 50: {
                System.out.println("Usted tiene 50 anos");
                break;
            }
            default: //cuando ninguno cumple se hace esto
            {
                System.out.println("Esta edad no esta incluida");
            }
        }
        
        if (edad >= 15 && edad < 40)
        {
            switch (edad) 
            {
                case 10: 
                {
                    System.out.println("Usted tiene 10 anos");
                    break;
                }
                case 20: //se ejecuta todo lo que esta hacia abajo
                {
                    System.out.println("Usted tiene 20 anos");
                    break;
                }
                case 50: 
                {
                    System.out.println("Usted tiene 50 anos");
                    break;
                }
                default: //cuando ninguno cumple se hace esto
                {
                    System.out.println("Esta edad no esta incluida");
                }
            }
        }
    }
    

    
    


}
