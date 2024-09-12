package practica.viviro;

/**
 * @author Diego Ramos
 */
public abstract class Planta {
    
    private String nombre, climaIdeal;
    private boolean tieneHojas;
    private double altoTallo;

    public Planta() {
    }

    public Planta(String nombre, String climaIdeal, boolean tieneHojas, double altoTallo) {
        this.nombre = nombre;
        this.climaIdeal = climaIdeal;
        this.tieneHojas = tieneHojas;
        this.altoTallo = altoTallo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    protected abstract void decirLoQueSoy ();
    
}
