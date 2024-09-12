package libros;

/**
 *
 * @author Diego Ramos
 */
public class Principal {
    
    public static void main(String[] args) {
        
    Libros libro [] = new Libros[2];
    
    libro[0]= new Libros ("100 años de soledad", "Julio Vernes", 123, 1234);
    libro[1] = new Libros("Veinte mil leguas de viaje submarino", "Julio Verne", 456, 5678);
    
        for (int i = 0; i < libro.length; i++) {
            System.out.println(libro[i]);
        }
    
        // Llamar al método para obtener el libro con más páginas
        Libros libroConMasPaginas = masPaginas(libro);

        // Imprimir el libro con más páginas
        System.out.println("El libro con más páginas es: " + libroConMasPaginas.getTitulo() 
                           + " con " + libroConMasPaginas.getNumpaginas() + " páginas.");

    }
    
    public static Libros masPaginas(Libros[] libros) {
        
        Libros libroMasPaginas = libros[0];
        
        for (int i = 1; i < libros.length; i++) {
            
            if (libros[0].getNumpaginas() < libros[i].getNumpaginas()) {
            libroMasPaginas = libros[i];
            }
           
        }
       return libroMasPaginas;
    }
}
