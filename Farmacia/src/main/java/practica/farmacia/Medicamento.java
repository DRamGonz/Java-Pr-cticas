package practica.farmacia;


public class Medicamento {
    
    private String nombre;
    private int edadRecomendada;
    private String descripcion;

    public Medicamento(String nombre, int edadRecomendada, String descripcion) {
        this.nombre = nombre;
        this.edadRecomendada = edadRecomendada;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    public int aumentarEdadRecomendada () {
    
        switch (this.edadRecomendada) {
            case 3:
                this.edadRecomendada = 7;
                break;
            case 7:
                this.edadRecomendada = 12;
                break;
            case 12:
                this.edadRecomendada = 16;
                break;
            case 16:
                this.edadRecomendada = 18;
                break;
            case 18:
                System.out.println("Error. La edad recomendada es de 18 años.");
                break;
            default:
                System.out.println("Error. la edad recomendada no es correcta.");
                break;
        }
        return this.edadRecomendada;
    }
}