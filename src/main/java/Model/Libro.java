package Model;

public class Libro {

    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponibilidad;

    public Libro(String inTitulo, String inAutor, String inCategoria, boolean inDisponibilidad) {
        titulo = inTitulo;
        autor = inAutor;
        categoria = inCategoria;
        disponibilidad = inDisponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
