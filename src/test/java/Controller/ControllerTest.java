package Controller;

import Model.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Controller controller;
    Libro libro = new Libro("1984", "George Orwell", "Ciencia ficción", false);

    @Test
    void iniciarLibreriaTest(){
        Assertions.assertEquals(true, Controller.iniciarLibreria());
    }

    @BeforeEach
    void setUp(){
        controller = new Controller();
    }

    @Test
    void buscarLibroTest(){
        Assertions.assertEquals(libro.getAutor(), Controller.buscarLibro("1984").getAutor());
    }

    @Test
    void reservarLibroTest(){

        Assertions.assertEquals(true, Controller.reservarLibro("La Metamorfosis"));
    }

    @Test
    void comprarLibroTest(){
        Assertions.assertEquals(libro.getTitulo(), Controller.comprarLibro("1984").getTitulo());
    }

    @Test
    void devolverLibroTest(){
        Assertions.assertEquals(true, Controller.devolverLibro(libro));
    }

}