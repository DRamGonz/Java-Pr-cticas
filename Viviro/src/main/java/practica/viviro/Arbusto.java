
package practica.viviro;

/**
 * @author Diego Ramos
 */
public class Arbusto extends Planta{
    
    private double ancho;
    private boolean esDomesticos, sePodaONo;
    private String variedad, colorHojas;

    public Arbusto() {
    }

    public Arbusto(double ancho, boolean esDomesticos, boolean sePodaONo, String variedad, String colorHojas, String nombre, String climaIdeal, boolean tieneHojas, double altoTallo) {
        super(nombre, climaIdeal, tieneHojas, altoTallo);
        this.ancho = ancho;
        this.esDomesticos = esDomesticos;
        this.sePodaONo = sePodaONo;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomesticos() {
        return esDomesticos;
    }

    public void setEsDomesticos(boolean esDomesticos) {
        this.esDomesticos = esDomesticos;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }
    
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un arbusto");
    }
}
