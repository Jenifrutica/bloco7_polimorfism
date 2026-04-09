# Diagrama de clases — modelo con Libro y Video

Diagrama UML (Mermaid): jerarquía bajo `Publicacion`, enumeración `Idioma` para videos.

```mermaid
classDiagram
    direction TB

    class Publicacion {
        -String titulo
        -double precio
        +getTitulo() String
        +setTitulo(String) void
        +getPrecio() double
        +setPrecio(double) void
    }

    class Libro {
        -int anioPublicacion
        -int numeroPaginas
        +toString() String
    }

    class Video {
        -Idioma idioma
        -float duracionHoras
        +getIdioma() Idioma
        +setIdioma(Idioma) void
        +getDuracionHoras() float
        +setDuracionHoras(float) void
        +toString() String
    }

    class Idioma {
        <<enumeration>>
        ESPANOL
        INGLES
        PORTUGUES
        MANDARIN
        JAPONES
    }

    Publicacion <|-- Libro
    Publicacion <|-- Video
    Video ..> Idioma : idioma
```

## Relaciones

- **Libro** y **Video** heredan de **Publicacion** (título y precio).
- **Video** usa **Idioma** (español, inglés, portugués, mandarín, japonés) y **duracionHoras** (`float`).
