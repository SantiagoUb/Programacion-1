package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Discoteca {

    private String nombre;
    private LinkedList<Entrada> listEntradas;
    private LinkedList<Evento> listEventos;
    private LinkedList<Asistente> listAsistentes;
    private LinkedList<Cliente> listClientes;
    private LinkedList<Empleado> listEmpleados;
    private LinkedList<Turno> listTurnos;

    public Discoteca(String nombre, LinkedList<Entrada> listEntradas, LinkedList<Evento> listEventos,
            LinkedList<Asistente> listAsistentes, LinkedList<Cliente> listClientes, LinkedList<Empleado> listEmpleados,
            LinkedList<Turno> listTurnos) {
        this.nombre = nombre;
        this.listEntradas = listEntradas;
        this.listEventos = listEventos;
        this.listAsistentes = listAsistentes;
        this.listClientes = listClientes;
        this.listEmpleados = listEmpleados;
        this.listTurnos = listTurnos;
    }

    // Asignar empleado a un turno
    public boolean asignarEmpleadoTurno(String idEmpleado, String horarioTurno) {
        boolean asignar = false;
        Turno newturno = null;
        Empleado empleado1 = null;

        for (Turno newturno1 : listTurnos) {
            if (newturno1.getHorario().equals(horarioTurno)) {
                newturno = newturno1;
                break;
            }
        }

        for (Empleado newEmpleado : listEmpleados) {
            if (newEmpleado.getId().equals(idEmpleado)) {
                empleado1 = newEmpleado;
                break;
            }
        }

        if (newturno != null && empleado1 != null) {
            newturno.getListEmpleados().add(empleado1);
            empleado1.getListTurnos().add(newturno);
            asignar = true;
        }
        return asignar;
    }

    // Asignar un asistente a un evento
    public boolean asignarAsistenteEvento(String idAsistente, String nombreEvento) {
        boolean asignar = false;
        Evento newEvento = null;
        Asistente newAsistente = null;

        for (Evento evento1 : listEventos) {
            if (evento1.getNombre().equals(nombreEvento)) {
                newEvento = evento1;
                break;
            }
        }

        for (Asistente asistente1 : listAsistentes) {
            if (asistente1.getId().equals(idAsistente)) {
                newAsistente = asistente1;
                break;
            }
        }

        if (newEvento != null && newAsistente != null) {
            newEvento.getListAsistentes().add(newAsistente);
            newAsistente.getListEventos().add(newEvento);
            asignar = true;
        }
        return asignar;
    }

    //CRUD para asistente
    public boolean crearAsistente(Asistente newAsistente){
        for (Asistente asistente : listAsistentes) {
            if(verificarAsistente(asistente.getId())){
                listAsistentes.add(newAsistente);
                return true;
            }
        }
        return false;
    }

    public boolean verificarAsistente(String idVerificar){
        for (Asistente asistente : listAsistentes) {
            if(asistente.getId().equals(idVerificar)){
                return false;
            }
        }
        return true;
    }

    //CRUD para cliente
    public boolean crearCliente(Cliente newCliente){
        for (Cliente cliente: listClientes) {
            if(verificarCliente(cliente.getId())){
                listClientes.add(newCliente);
                return true;
            }
        }
        return false;
    }

    public boolean verificarCliente(String idVerificar){
        for (Cliente cliente: listClientes) {
            if(cliente.getId().equals(idVerificar)){
                return false;
            }
        }
        return true;
    }

    //CRUD para empleado
    public boolean crearEmpleado(Cliente newCliente){
        for (Empleado empleado: listEmpleados) {
            if(verificarEmpleado(empleado.getId())){
                listClientes.add(newCliente);
                return true;
            }
        }
        return false;
    }

    public boolean verificarEmpleado(String idVerificar){
        for (Empleado empleado: listEmpleados) {
            if(empleado.getId().equals(idVerificar)){
                return false;
            }
        }
        return true;
    }

    //CRUD evento
    public boolean crearEvento(Evento newEvento){
        for (Evento evento: listEventos) {
            if(verificarEvento(evento.getNombre())){
                listEventos.add(newEvento);
                return true;
            }
        }
        return false;
    }

    public boolean verificarEvento(String nombreVerificar){
        for (Evento evento: listEventos) {
            if(evento.getNombre().equals(nombreVerificar)){
                return false;
            }
        }
        return true;
    }

    //CRUD turno
    public void crearTurno(Turno newTurno){
        listTurnos.add(newTurno);
    }

    //CRUD entrada
    public void crearEntrada(Entrada newEntrada){
        listEntradas.add(newEntrada);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Entrada> getListEntradas() {
        return listEntradas;
    }

    public void setListEntradas(LinkedList<Entrada> listEntradas) {
        this.listEntradas = listEntradas;
    }

    public LinkedList<Evento> getListEventos() {
        return listEventos;
    }

    public void setListEventos(LinkedList<Evento> listEventos) {
        this.listEventos = listEventos;
    }

    public LinkedList<Asistente> getListAsistentes() {
        return listAsistentes;
    }

    public void setListAsistentes(LinkedList<Asistente> listAsistentes) {
        this.listAsistentes = listAsistentes;
    }

    public LinkedList<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(LinkedList<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public LinkedList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(LinkedList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public LinkedList<Turno> getListTurnos() {
        return listTurnos;
    }

    public void setListTurnos(LinkedList<Turno> listTurnos) {
        this.listTurnos = listTurnos;
    }

}
