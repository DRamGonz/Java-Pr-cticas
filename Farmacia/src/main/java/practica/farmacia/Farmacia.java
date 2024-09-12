package practica.farmacia;

public class Farmacia {

    public static void main(String[] args) {
        
        Medicamento m1 = new Medicamento ("Paracetamol", 12, "Medicamento para el control de dolor de Cabeza.");
        Pacientes p1 = new Pacientes ("Diego", "Ramos", "Mala respiración", "Paracetamol", "Varon", 19, m1);
        
        System.out.println("\n Edad recomendada actual: " + m1.getEdadRecomendada());
        System.out.println("\n Edad recomendada aumentada: " + m1.aumentarEdadRecomendada());
        
        System.out.println("\nEs mayor de edad: " + p1.mayorEdad());
        
        p1.imprimirGeneral();
        
        System.out.println("\nLos datos han pasado la validación: " + p1.comprobarDatos());
        
    }
}
