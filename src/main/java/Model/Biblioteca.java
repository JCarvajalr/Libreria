package Model;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> bibliotecaLibros;

    public Biblioteca(){
        bibliotecaLibros = new ArrayList<>();
        bibliotecaLibros.add(new Libro("La Metamorfosis", "Fran kafka", "Novela", true));
        bibliotecaLibros.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Ficción", true));
        bibliotecaLibros.add(new Libro("1984", "George Orwell", "Ciencia ficción", false));
        bibliotecaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", true));
        bibliotecaLibros.add(new Libro("El principito", "Antoine de Saint-Exupéry", "Infantil", false));
        bibliotecaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Clásico", true));
        bibliotecaLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "Romance", false));
        bibliotecaLibros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "Ficción", true));
        bibliotecaLibros.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía", false));
        bibliotecaLibros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", "Misterio", true));
        bibliotecaLibros.add(new Libro("El alquimista", "Paulo Coelho", "Autoayuda", false));
    }

    public Libro buscarLibro(String titulo){
        for (Libro libro: bibliotecaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    //falso en caso de no realizar la reserva
    public boolean reservarLibro(String titulo){
        for (Libro libro: bibliotecaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.setDisponibilidad(false);
                return true;
            }
        }
        return false;
    }
    public Libro comprarLibro(String titulo){
        for (Libro libro: bibliotecaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                bibliotecaLibros.remove(libro);
                return libro;
            }
        }
        return null;
    }
    public boolean devolverLibro(Libro libroADevolver){
        for (Libro libro: bibliotecaLibros) {
            if (libro.equals(libroADevolver)) {
                return false;
            }
        }
        bibliotecaLibros.add(libroADevolver);
        return true;
    }
}
