package practica.vehiculos;

public class Vehiculos {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " / Modelo: " + modelo + " / Precio: " + String.format("%.2f", precio) + '.';
    }


}
