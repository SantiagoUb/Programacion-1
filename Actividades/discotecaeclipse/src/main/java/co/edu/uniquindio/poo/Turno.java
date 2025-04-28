package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Turno {

    private String horario;
    private LinkedList<Empleado> listEmpleados;

    public Turno(String horario, LinkedList<Empleado> listEmpleados) {
        this.horario = horario;
        this.listEmpleados = listEmpleados;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LinkedList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(LinkedList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }
    

}
