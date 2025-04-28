package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Asistente extends Persona{

    private LinkedList<Evento> listEventos;

    public Asistente(String nombre, String id, String telefono, String direccion, String correo, LinkedList<Evento> listEventos) {
        super(nombre, id, telefono, direccion, correo);
        this.listEventos = listEventos;
        
    }

    public LinkedList<Evento> getListEventos() {
        return listEventos;
    }

    public void setListEventos(LinkedList<Evento> listEventos) {
        this.listEventos = listEventos;
    }
    


}
