package co.edu.uniquindio.poo;

public class Medico {
    private String nombre;
    private String id;
    private int numeroLicencia;
    private Especialidad especialidad;

    public Medico(String nombre, String id, int numeroLicencia) {
        this.nombre = nombre;
        this.id = id;
        this.numeroLicencia = numeroLicencia;
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

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
