package co.edu.uniquindio.poo;

public abstract class Persona {

    private String nombre;
    private String id;
    private String telefono;
    private String direccion;
    private String correo;

    public Persona(String nombre, String id, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
