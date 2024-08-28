package practica.vehiculos;

import java.util.Scanner;

public class Principal {
    
    public static int indiceCocheBarato (Vehiculos coches[]) {
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 0; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
        
    public static void main (String [] args){
        Scanner entradaint = new Scanner(System.in);
        Scanner entradaFloat = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
    
        String marca, modelo;
        float precio;
        int masBarato;
        int numVehiculos;
    
        System.out.println("Introduce el número de vehículos que vas a comparar: ");
        numVehiculos = entradaint.nextInt();
        
        Vehiculos coches[] = new Vehiculos[numVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println("\nIntroduzca las caracteristicas del coche " +(i+1)+":");
            System.out.println("\nIntroduzca la marca del vehículo: ");
            marca = entradaString.nextLine();
            System.out.println("\nIntroduzca el modelo del vehículo: ");
            modelo = entradaString.nextLine();
            System.out.println("\nIntroduzca el precio del vehículo: ");
            precio = entradaFloat.nextFloat();
            
            coches[i] = new Vehiculos (marca, modelo, precio);
        }

        masBarato = indiceCocheBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[masBarato].mostrarDatos());
    }
}