package deposito;

import java.util.Scanner;

/**
 *
 * @author rasta
 */
public class Almacen {

    public static void main(String[] args) {
        
        double ventas[] = new double [10];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa las 30 ventas del mes: ");
        for (int i = 0; i < ventas.length; i++) {
                System.out.println("Venta " + (i+1) + " :");
                ventas[i]=sc.nextDouble();
        }
        
        System.out.println("Las ventas que superar los 2000 euros son las siguientes: ");
        System.out.println("");
        for (int i = 0; i < ventas.length; i++) {
            
            if (ventas[i] > 2000) {
                System.out.println("Venta " + (i+1)+ " = " + ventas[i]);
            }
            
        }
        
    }
    
}

    

