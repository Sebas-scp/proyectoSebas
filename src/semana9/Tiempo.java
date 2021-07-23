
package semana9;

public class Tiempo 
{
    private int horas;
    private int minutos;
    private int segundos;
    
    public void tiempo(int horas,int minutos, int segundos)
    {
        if(horas>=24 || horas<0 || minutos>=60 || minutos<0 || segundos<0 || segundos>=60)
        {
            throw new IllegalArgumentException ("Error, horas, minutos o segundos invalidos.");
        }
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
        
    public String horaUniversal()
    {
        return String.format("%02d :%02d :%02d",horas,minutos,segundos);
    }
    
    public String horaStandar()
    {
        return String.format("%d:%02d:%02d %s",
            ((horas==0 || horas==12) ?12: horas%12),
            minutos,segundos,(horas<12 ?"AM": "PM"));
    }   
}
