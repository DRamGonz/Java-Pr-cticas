package practica;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Diego Ramos.
 */
public class Practica {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner (System.in);
        
        //Declaración de Variables
        boolean menu = true;
        int numero = 0, resultado;
        
        do{
            try{
            System.out.println("Introduce un número del 1 al 10 para mostrar la tabla: ");
            numero = datos.nextInt();
            if (numero > 0 && numero <=10){
                menu = false;
            
            } else {
                System.out.println("El número introduccido no esta dentro del rango indicado.");
            }
            }catch (InputMismatchException e) {
                System.out.println("El valor introducido no es correcto.");
                datos.next(); // Limpiar la entrada incorrecta
            }
        } while (menu);

        for (int i = 0; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(i + " x " + numero +  " = " + resultado);
        }
        
    }
}
