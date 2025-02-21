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

        JOptionPane.showMessageDialog(null, listaEstudiantes);

    }

    @SuppressWarnings("rawtypes")
    public static ArrayList crearEstudianteBase(ArrayList<Estudiante> listaEstudiantes) {

        Estudiante estudiante1 = new Estudiante("Juan Pérez", 4, "Masculino", "123456789", "Ninguna", "María Pérez",
                "555-1234");
        Estudiante estudiante2 = new Estudiante("Ana Gómez", 20, "Femenino", "987654321", "Alergia al polen",
                "Carlos Gómez", "555-5678");
        Estudiante estudiante3 = new Estudiante("Luis Rodríguez", 2, "Masculino", "234567890", "Ninguna",
                "Luisa Rodríguez", "555-9876");
        Estudiante estudiante4 = new Estudiante("Clara Martín", 19, "Femenino", "345678901", "Alergia a mariscos",
                "José Martín", "555-6543");

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);

        return listaEstudiantes;

    }

}
