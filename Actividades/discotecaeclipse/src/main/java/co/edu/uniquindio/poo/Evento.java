package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private Persona djsInvitados;
    private TipoEvento tipoEvento;
    private LinkedList<Asistente> listAsistentes;

    public Evento(String nombre, LocalDate fecha, Persona djsInvitados, TipoEvento tipoEvento, LinkedList<Asistente> listAsistentes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.djsInvitados = djsInvitados;
        this.tipoEvento = tipoEvento;
        this.listAsistentes = listAsistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getDjsInvitados() {
        return djsInvitados;
    }

    public void setDjsInvitados(Persona djsInvitados) {
        this.djsInvitados = djsInvitados;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public LinkedList<Asistente> getListAsistentes() {
        return listAsistentes;
    }

    public void setListAsistentes(LinkedList<Asistente> listAsistentes) {
        this.listAsistentes = listAsistentes;
    }


}
