package View;

import Controller.Controller;
import Model.Libro;

import javax.naming.ldap.Control;
import java.util.Scanner;

public class Inicio {
    public static void main(String [] args){
        Controller.iniciarLibreria();
        String titulo, autor, categoria;
        Libro libro;
        boolean seguir = true;
        int opcionMenu;
        Scanner scan = new Scanner(System.in);

        System.out.println("----Bienvenido a 'Libros Para Todos'----\n");

        System.out.printf("%-20s %-20s %n","1. Buscar libro", "2. Reservar");
        System.out.printf("%-20s %-20s %n", "3. Comprar", "4. Devolver.");
        System.out.println("5. Salir.");

        System.out.println("Que desea hacer: ");
        opcionMenu = scan.nextInt();

        while (seguir){
            libro = null;
            switch (opcionMenu){
                case 1:
                    System.out.print("Ingrese el nombre del libro que desea buscar: ");
                    titulo = scan.nextLine();
                    libro = Controller.buscarLibro(titulo);
                    if (libro != null){
                        imprimirLibro(Controller.buscarLibro(titulo));
                    }
                    else {
                        System.out.println("Libro no encontrado.");
                    }

                    break;

                case 2:
                    System.out.println("Ingrese el nombre del libro que desea reservar: ");
                    titulo = scan.nextLine();
                    if (Controller.reservarLibro(titulo)){
                        System.out.println("Reserva realizada con exito");
                    }
                    else {
                        System.out.println("Error al intentar reservar.");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el nombre del libro que desea comprar: ");
                    titulo = scan.nextLine();
                    libro = Controller.comprarLibro(titulo);
                    if (libro != null){
                        imprimirLibro(Controller.comprarLibro(titulo));
                    }
                    else {
                        System.out.println("Libro no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese los datos del libro a devolver:");
                    System.out.print("Titulo: ");
                    titulo = scan.nextLine();
                    System.out.print("Autor: ");
                    autor = scan.nextLine();
                    System.out.print("Categoria: ");
                    categoria = scan.nextLine();
                    Libro libroADevolver = new Libro(titulo, autor, categoria, true);
                    if (Controller.devolverLibro(libroADevolver)){
                        System.out.println("Devolucion realizada con exito.");
                    }
                    else {
                        System.out.println("Error en la devolucion.");
                    }
                    break;

                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    //Funcion para imprimir
    public static void imprimirLibro(Libro libro){
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Categoria: " + libro.getCategoria());
        System.out.println("Disponible: " + libro.isDisponibilidad());
    }

}
