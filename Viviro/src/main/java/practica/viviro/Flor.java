package practica.viviro;

/**
 * @author Diego Ramos
 */
public class Flor extends Planta {
    
    private String colorPetalos, colorPistilo, variedad, estancion;
    private int cantPetalos;

    public Flor() {
    }

    public Flor(String colorPetalos, String colorPistilo, String variedad, String estancion, int cantPetalos, String nombre, String climaIdeal, boolean tieneHojas, double altoTallo) {
        super(nombre, climaIdeal, tieneHojas, altoTallo);
        this.colorPetalos = colorPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estancion = estancion;
        this.cantPetalos = cantPetalos;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstancion() {
        return estancion;
    }

    public void setEstancion(String estancion) {
        this.estancion = estancion;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }
    
    

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una Flor");
    }
    
    

}
