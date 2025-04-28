package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Cliente {

    private String nombre;
    private String cedula;
    private String correo;
    private String direccion;
    private LinkedList<Envio> listEnvios;

    public Cliente(String nombre, String cedula, String correo, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        listEnvios = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Envio> getListEnvios() {
        return listEnvios;
    }

    public void setListEnvios(LinkedList<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }

}
