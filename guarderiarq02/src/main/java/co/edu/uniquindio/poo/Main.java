package co.edu.uniquindio.poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        int cantidadEstudiantes = 1;

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes = crearEstudianteBase(listaEstudiantes);

        ArrayList<Estudiante> listaEstudiantesMayores = listaEstudiantes;
        listaEstudiantesMayores= estudiantesMayoresA5(listaEstudiantesMayores);

        for (int i = 0; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
            String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante ");
            String identificacion = JOptionPane.showInputDialog("Ingrese la identificacion del estudiante");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias del estudiante");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente del estudiante");
            String numeroContacto = JOptionPane.showInputDialog("Ingrese el numero de contacto del estudiante");

            Estudiante NuevoEstudiante = new Estudiante(nombre, edad, genero, identificacion, alergias, nombreAcudiente,
                    numeroContacto);

            JOptionPane.showMessageDialog(null, NuevoEstudiante);
            listaEstudiantes.add(NuevoEstudiante);

        }

        JOptionPane.showMessageDialog(null, listaEstudiantesMayores);
        

    }

    

    @SuppressWarnings("rawtypes")
    public static ArrayList crearEstudianteBase(ArrayList<Estudiante> listaEstudiantes) {

        Estudiante estudiante1 = new Estudiante("JUAN PEREZ", 4, "Masculino", "123456789", "Ninguna", "María Pérez",
                "555-1234");
        Estudiante estudiante2 = new Estudiante("ANA GOMEZ", 8, "Femenino", "987654321", "Alergia al polen",
                "Carlos Gómez", "555-5678");
        Estudiante estudiante3 = new Estudiante("LUIS RODRIGUEZ", 3, "Masculino", "234567890", "Ninguna",
                "Luisa Rodríguez", "555-9876");
        Estudiante estudiante4 = new Estudiante("CLARA MURILLO", 9, "Femenino", "345678901", "Alergia a mariscos",
                "José Murillo", "555-6543");

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);

        return listaEstudiantes;

    }

    public static ArrayList<Estudiante> estudiantesMayoresA5(ArrayList<Estudiante> listaEstudiantesMayores){

        for (Estudiante estudiante : listaEstudiantesMayores) {
            if(Guarderia.obtenerListaEstudiantesMayores){
                listaEstudiantesMayores.add(estudiante);
            }
            
        }

        Estudiante estudiante2 = new Estudiante("Ana Gómez", 10, "Femenino", "987654321", "Alergia al polen",
        "Carlos Gómez", "555-5678");

        Estudiante estudiante4 = new Estudiante("Clara Martín", 9, "Femenino", "345678901", "Alergia a mariscos",
        "José Martín", "555-6543");

        listaEstudiantesMayores.add(estudiante4);
        listaEstudiantesMayores.add(estudiante2);

        return listaEstudiantesMayores;
    }
}
