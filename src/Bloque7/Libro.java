package Bloque7;

public class Libro extends Publicacion {
    private int anioPublicacion;
    private int numeroPaginas;

    public Libro(int anioPublicacion, int numeroPaginas) {
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }
    public Libro() {
        this.anioPublicacion = 0;
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, double precio, int anioPublicacion, int numeroPaginas) {
        super(titulo, precio);
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro tiene los siguientes datos: " +
                "titulo = '" + getTitulo() + '\'' +
                ", precio = " + getPrecio() +
                ", anioPublicacion = " + anioPublicacion +
                ", numeroPaginas = " + numeroPaginas +
                '}';
    }
}
