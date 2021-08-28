
package examen2;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Automovil 
{
    String modelo;
    String estilo;
    String color;
    byte puertas;
    short anio;
    Motores motor;

    public Automovil(String modelo, String estilo, String color, byte puertas, short anio, Motores motor) {
        this.modelo = modelo;
        this.estilo = estilo;
        this.color = color;
        this.puertas = puertas;
        this.anio = anio;
        this.motor = motor;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getPuertas() {
        return puertas;
    }

    public void setPuertas(byte puertas) {
        this.puertas = puertas;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public Motores getMotor() {
        return motor;
    }

    public void setMotor(Motores motor) {
        this.motor = motor;
    }
    
    
    
    
    
    
    
    
}
