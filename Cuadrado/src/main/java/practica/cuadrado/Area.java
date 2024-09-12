package practica.cuadrado;

/**
 * @author Diego Ramos
 */
public class Area {
    
    //Atributos
    
    private float lado1, lado2;
    
    //Metodos

    //Construcctor
    public Area(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Construcctor - Para cuadrados.
    public Area(float lado1) {
        //para darle el mismo valor a más de un atributo
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro () {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
    public float getArea () {
        float area = (lado1 * lado2);
        return area;
    }
    
}
