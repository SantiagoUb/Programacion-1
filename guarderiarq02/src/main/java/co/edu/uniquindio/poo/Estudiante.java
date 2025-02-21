package co.edu.uniquindio.poo;

public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private int edad;
    private String genero;
    private String identificacion;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    // Consstructor
    public Estudiante(String nombre, int edad, String genero, String identificacion, String alergias,
            String nombreAcudiente, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;

    }

    // metodo toString
    @Override
    public String toString() {
        return "Nombre del estudiante: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero
                + "\nNumero de identificacion: "
                + identificacion + "\nAlergias: " + alergias + "\nNombre del Acudiente: " + nombreAcudiente
                + "\nNumero de Contacto: " + numeroContacto;
    }

    // Getters y Stters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

}
