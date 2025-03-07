package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Guarderia {

    public static boolean obtenerListaEstudiantesMayores;
    // Atributos de la clase
    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listaEstudiantes;

    // Constructor
    public Guarderia(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    // Metodos propios de la clase
    public void agregarEstudiante(Estudiante estudianteAgregar) {
        listaEstudiantes.add(estudianteAgregar);
    }

    public void eliminarEstudiante(Estudiante estudianteeliminar) {
        listaEstudiantes.remove(estudianteeliminar);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar) {

        for (Estudiante indexEstudiante : listaEstudiantes) {
            if (indexEstudiante.getIdentificacion().equals(estudianteActualizar.getIdentificacion()))
                ;

            indexEstudiante.setNombre(estudianteActualizar.getNombre());
            indexEstudiante.setAlergias(estudianteActualizar.getAlergias());
            indexEstudiante.setEdad(estudianteActualizar.getEdad());
            indexEstudiante.setGenero(estudianteActualizar.getGenero());
            indexEstudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
            indexEstudiante.setNumeroContacto(estudianteActualizar.getNumeroContacto());
            break;
        }
    }

    public void listarEstudiante() {

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Estudiante " + listaEstudiantes.indexOf(estudiante) + " " + estudiante);
        }
    }

    // Metodo para filtrar los estudiantes mayores a 5 años
    public ArrayList<Estudiante> obtenerListaEstudiantesMayores(String identificacion) {

        ArrayList<Estudiante> listaEstudiantesMayores = new ArrayList<>();
        for (Estudiante estdudiante : listaEstudiantes) {
            if (estdudiante.getEdad() > 5 ) {
                listaEstudiantesMayores.add(estdudiante);
            }
        }

        return listaEstudiantesMayores;
    }


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

}
