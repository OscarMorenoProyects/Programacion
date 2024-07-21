package co;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    
    @Override
    public String toString() {
        return "Grupo{" + "nombre='" + nombre + '\'' + ", categoria=" + categoria + '}';
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
