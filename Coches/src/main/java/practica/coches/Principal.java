package practica.coches;


public class Principal {
    
    public static void main(String[] args) {
        
        Coches nuevo = new Coches("Opel", "Corsa", 1978);
        
        System.out.println(nuevo.toString());
        
        nuevo.acelerar(5);

        System.out.println(nuevo.toString());

        nuevo.frenar(3);
         
        System.out.println(nuevo.toString());

        nuevo.detener();

        System.out.println(nuevo.toString());
        
    }

}
