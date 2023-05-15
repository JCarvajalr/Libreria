package Controller;

import Model.Biblioteca;
import Model.Libro;

public class Controller {
    static Biblioteca biblioteca;

    public static boolean iniciarLibreria(){
        biblioteca = new Biblioteca();
        return true;
    }

    public static Libro buscarLibro(String titulo){
        return biblioteca.buscarLibro(titulo);
    }

    public static boolean reservarLibro(String titulo){
        return biblioteca.reservarLibro(titulo);
    }

    public static Libro comprarLibro(String titulo){
        return biblioteca.comprarLibro(titulo);
    }

    public static boolean devolverLibro(Libro libroADevolver){
        return biblioteca.devolverLibro(libroADevolver);
    }
}
