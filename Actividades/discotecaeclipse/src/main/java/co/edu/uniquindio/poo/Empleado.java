package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empleado extends Persona {

    private Rol rol;
    private LinkedList<Turno> listTurnos;

    public Empleado(Rol rol, String nombre, String id, String telefono, String direccion, String correo, LinkedList<Turno> listTurnos) {
        super(nombre, id, telefono, direccion, correo);
        this.rol = rol;
        this.listTurnos = listTurnos;

    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LinkedList<Turno> getListTurnos() {
        return listTurnos;
    }

    public void setListTurnos(LinkedList<Turno> listTurnos) {
        this.listTurnos = listTurnos;
    }
    

}
