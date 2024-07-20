package co;

public class Contacto {
    String nombre;
    String alias;
    String email;
    String telefono;

    
   

    public Contacto(String nombre, String alias, String email, String telefono) {
        this.nombre = nombre;
        this.alias = alias;
        this.email = email;
        this.telefono = telefono;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }


    public String getAlias() {
        return alias;
    }


    public String getEmail() {
        return email;
    }


    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "nombre: "+ nombre+"alias: "+ alias+"email: "+ email+"telefono: "+ telefono;
    }
}
