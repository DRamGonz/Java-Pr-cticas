package practica.vehiculos;

import java.util.Scanner;

public class Principal {
    
    public static int precioBarato(Vehiculos coches[]) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();

        for (int i = 0; i < coches.length; i++) {

            if (precio > coches[i].getPrecio()) {
                precio = coches[i].getPrecio();
                indice = i;
            }

        }
        return indice;
    }
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String marca, modelo;
        float precio;
        int numVehiculos, menorPrecio;
    
    
        System.out.println("Introduzca el número de vehículos que va a introducir");
        numVehiculos = entrada.nextInt();
        entrada.nextLine();

        
        Vehiculos[] coches = new Vehiculos[numVehiculos];
    

        for (int i = 0; i < coches.length; i++) {
            
            do {
                System.out.println("Introduzca la marca del vehículo: " + (i + 1) + ":");
                marca = entrada.nextLine();
                if (marca.isEmpty()) {
                    System.out.println("La marca del vehículo no puede estar vacío.");
                }
            } while (marca.isEmpty());

            do {
                System.out.println("Introduzca la modelo del vehículo: " + (i + 1) + ":");
                modelo = entrada.nextLine();
                if (modelo.isEmpty()) {
                    System.out.println("El modelo no puede estar vacío.");
                }
            } while (modelo.isEmpty());
            

            boolean precioValido = false;
            precio = 0.0f; // Inicializar la variable precio
        
            do {
                System.out.println("Introduzca el precio del vehículo " + (i + 1) + ":");

                if (entrada.hasNextFloat()) { // Verifica si la entrada es un número flotante
                    float dato = entrada.nextFloat();

                    if (dato > 0) {
                        precio = dato;
                        precioValido = true;
                    } else {
                        System.out.println("El precio debe ser un número positivo. Por favor, inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Por favor, introduzca un valor numérico válido para el precio.");
                    entrada.next(); // Descartar la entrada incorrecta
                }
            } while (!precioValido);

            entrada.nextLine();
            
            coches[i] = new Vehiculos(marca, modelo, precio);
       }
            
                
        System.out.println("El vehículo con el precio más barato es: ");
        System.out.println(coches[precioBarato(coches)]);
    }
}