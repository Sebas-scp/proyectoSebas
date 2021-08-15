
package quiz2MIO;

/**
 *
 * @author Sebastian
 */
public class Reloj2 
{
    int horas;
    int minutos;
    
    public void setAlarm(int horas, int minutos)
    {
        getHoras();
        getMinutos();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
}
