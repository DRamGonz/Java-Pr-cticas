package practica.coches;

/**
 *
 * @author rasta
 */
public class Coches {

    private String marca, modelo;
    private int velocidad;
    private int ano;

    public Coches() {
    }

    public Coches(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Coches{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", ano=" + ano + '}';
    }
    
    public void acelerar (int aumento) {
        this.velocidad += aumento;
    }

    
   public void detener() {
       this.velocidad=0;
   }
   
   public void frenar(int frenada) {
       if (velocidad < frenada) {
           System.out.println("La frenada es superior a la velocidad del vehículo.");
       } else {
       
       velocidad -= frenada;
       }
   }
}
