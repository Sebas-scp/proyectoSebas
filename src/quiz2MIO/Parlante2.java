
package quiz2MIO;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Parlante2 
{
    int volumen;
    boolean habilitar;
    char tipo;

    public Parlante2(int volumen, boolean habilitar, char tipo) 
    {
        this.volumen = volumen;
        this.habilitar = habilitar;
        this.tipo = tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
