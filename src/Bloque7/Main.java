package Bloque7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la editorial");
        System.out.println("Vamos a crear un libro");
        System.out.println("Cuál es el título del libro?");
        titulo = input.nextLine();
        System.out.println("Cuál es el precio del libro?");
        precio = input.nextDouble();
        System.out.println("Cuál es el año del libro?");
        anioPublicacion = input.nextInt();
        System.out.println("Cuál es el número de páginas del libro?");
        numeroPaginas = input.nextInt();
        input.nextLine();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);
        System.out.println("Libro registrado correctamente.");
        System.out.println("Resumen del libro:");
        System.out.println(miLibro);

        System.out.println();
        System.out.println("Ahora registraremos un disco en el catálogo.");
        System.out.println("Cuál es el título del disco?");
        String tituloDisco = input.nextLine();
        System.out.println("Cuál es el precio del disco?");
        double precioDisco = input.nextDouble();
        System.out.println("Cuántos minutos dura el disco? (puede usar decimales)");
        float duracionMinutos = input.nextFloat();
        input.nextLine();

        Disco miDisco = new Disco(tituloDisco, precioDisco, duracionMinutos);
        System.out.println("Disco registrado correctamente.");
        System.out.println("Resumen del disco:");
        System.out.println(miDisco);

        System.out.println();
        System.out.println("Ahora registraremos un video en el catálogo.");
        System.out.println("Cuál es el título del video?");
        String tituloVideo = input.nextLine();
        System.out.println("Cuál es el precio del video?");
        double precioVideo = input.nextDouble();
        input.nextLine();

        System.out.println();
        System.out.println("Idioma del video:");
        System.out.println("  1 - Español");
        System.out.println("  2 - Inglés");
        System.out.println("  3 - Portugués");
        System.out.println("  4 - Mandarín");
        System.out.println("  5 - Japonés");

        int opcionIdioma = 0;
        while (opcionIdioma < 1 || opcionIdioma > 5) {
            System.out.print("Idioma (1-5): ");
            opcionIdioma = input.nextInt();
        }
        Idioma idiomaVideo = Idioma.values()[opcionIdioma - 1];

        System.out.println("Cuántas horas dura el video? (puede usar decimales)");
        float duracionHoras = input.nextFloat();

        Video miVideo = new Video(tituloVideo, precioVideo, idiomaVideo, duracionHoras);
        System.out.println("Video registrado correctamente.");
        System.out.println("Resumen del video:");
        System.out.println(miVideo);

        System.out.println();
        System.out.println("Resumen final del catálogo ");
        System.out.println("Publicaciones ingresadas en esta sesión:");
        System.out.println("  Libro:  " + miLibro);
        System.out.println("  Disco:  " + miDisco);
        System.out.println("  Video:  " + miVideo);
        System.out.println("Fin del programa. Gracias por usar la editorial.");

        input.close();
    }
}
