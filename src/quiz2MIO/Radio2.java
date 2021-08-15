
package quiz2MIO;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Radio2 
{
    String audio;
    boolean encender;

    public Radio2(boolean encender) 
    {
        this.encender = encender;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public boolean isEncender() {
        return encender;
    }

    public void setEncender(boolean encender) {
        this.encender = encender;
    }  
}
