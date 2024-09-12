package libros;

/**
 *
 * @author rasta
 */
public class Libros {
   
        String titulo, autor;
        int numpaginas, isbn;

    public Libros(String titulo, String autor, int numpaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "El libros " + titulo + ", con  ISBN " + isbn + " creado por el autor " +autor+ " tiene " + numpaginas + " páginas.";
    }
        
}
