package co.edu.uniquindio.poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

         int cantEstudiantes = 1;

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes = crearEstudianteBase(listaEstudiantes);

        for (int i = 0; i < cantEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
            String genero = JOptionPane.showInputDialog("Ingrese su genero:");
            String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion:");
            String alargias = JOptionPane.showInputDialog("Ingrese sus alergias:");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
            String numeroContacto = JOptionPane.showInputDialog("Ingrese su numero de contacto:");

            Estudiante newEstudiante =new Estudiante(nombre, edad, genero, identificacion, alargias,nombreAcudiente, numeroContacto);

            listaEstudiantes.add(newEstudiante);
        }

        JOptionPane.showMessageDialog(null, listaEstudiantes);

    }

    @SuppressWarnings("rawtypes")

    public static ArrayList crearEstudianteBase(ArrayList<Estudiante> listaEstudiantes) {

        Estudiante estudiante1 = new Estudiante("Juan Pérez", 15, "Masculino", "123456","Ninguna", "María Pérez", "3123456789");

        Estudiante estudiante2 = new Estudiante("Ana Gómez", 16, "Femenino", "654321","Polen", "Carlos Gómez", "3156789123");

        Estudiante estudiante3 = new Estudiante("Luis Ramírez", 14, "Masculino", "987654","Mariscos", "Elena Ramírez", "3109876543");

        Estudiante estudiante4 = new Estudiante("Sofía Herrera", 17, "Femenino", "456789", "Penicilina", "Javier Herrera", "3194567890");


        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        
        return listaEstudiantes;
    }
}





