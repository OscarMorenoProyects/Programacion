package co;

public class Contacto {
    private String nombre;
    private String alias;
    private String email;
    private  String telefono;
    private Grupo grupo;
    private  int edad;
    


    public Contacto(){}

    public Contacto(String nombre, String alias, String email, String telefono, Grupo grupo, int edad) {
        this.nombre = nombre;
        this.alias = alias;
        this.email = email;
        this.telefono = telefono;
        this.grupo = grupo;
        this.edad = edad;
        assert edad>0;
        
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


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return " nombre: "+ nombre+" alias: "+ alias+" email: "+ email+" telefono: "+ telefono + "grupo: "+grupo+" edad: "+ edad;
    }
}
