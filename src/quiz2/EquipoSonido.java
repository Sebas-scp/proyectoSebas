package quiz2;


public class EquipoSonido {

    private String[] arregloAudios;
    private int indice;
    Parlante parIzq;
    Parlante parDer;
    Parlante sub;

    public EquipoSonido(int cantidadDeAudios) {
        arregloAudios = new String[cantidadDeAudios];
        indice = 0;
        
        parIzq= new Parlante(true,5,'I');
        parDer= new Parlante(true,5,'D');
        sub = new Parlante(true,5,'S');
    }

    public void agregarAudio(String audio) {
        try {
        
            try {
                arregloAudios[indice++] = audio;
                
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de audios");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public Parlante getParIzq() {
        return parIzq;
    }

    public void setParIzq(Parlante parIzq) {
        this.parIzq = parIzq;
    }

    public Parlante getParDer() {
        return parDer;
    }

    public void setParDer(Parlante parDer) {
        this.parDer = parDer;
    }

    public Parlante getSub() {
        return sub;
    }

    public void setSub(Parlante sub) {
        this.sub = sub;
    }
    
    
    
    public String[] getArregloAudios()
    {
        return arregloAudios;
    }
    
}