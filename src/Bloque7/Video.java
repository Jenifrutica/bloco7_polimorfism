package Bloque7;

public class Video extends Publicacion {
    private Idioma idioma;
    private float duracionHoras;

    public Video(String titulo, double precio, Idioma idioma, float duracionHoras) {
        super(titulo, precio);
        this.idioma = idioma;
        this.duracionHoras = duracionHoras;
    }

    public Video() {
        this.idioma = Idioma.ESPANOL;
        this.duracionHoras = 0;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "El video tiene los siguientes datos: " +
                "titulo = " + getTitulo() + '\'' +
                ", precio = " + getPrecio() +
                ", idioma = " + idioma +
                ", duracionHoras = " + duracionHoras +
                '}';
    }
}
