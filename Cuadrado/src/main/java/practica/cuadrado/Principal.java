package practica.cuadrado;

import javax.swing.JOptionPane;

/**
  * @author Diego Ramos
 */
public class Principal {

    public static void main(String[] args) {
        
        Area c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el número 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el número 2: "));
        
        
        if (lado1 == lado2) {
            c1 = new Area(lado1);
        } else {
            c1 = new Area(lado1, lado2);
        }
        
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("");
        System.out.println("El Area es: " + c1.getArea());
        
    }

}