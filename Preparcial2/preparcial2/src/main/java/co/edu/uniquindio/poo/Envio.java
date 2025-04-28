package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Envio {

    private String codigo;
    private double costoEnvio;
    private ZonaEntrega zonaEntrega;
    private LocalDate fechaEnvio;
    private LinkedList<Paquete> listPaquetes;
    private Cliente theCliente;

    public Envio(String codigo, double costoEnvio, ZonaEntrega zonaEntrega, LocalDate fechaEnvio, Cliente theCliente) {
        this.codigo = codigo;
        this.costoEnvio = costoEnvio;
        this.zonaEntrega = zonaEntrega;
        this.fechaEnvio = fechaEnvio;
        listPaquetes = new LinkedList<>();
        this.theCliente = theCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public ZonaEntrega getZonaEntrega() {
        return zonaEntrega;
    }

    public void setZonaEntrega(ZonaEntrega zonaEntrega) {
        this.zonaEntrega = zonaEntrega;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LinkedList<Paquete> getListPaquetes() {
        return listPaquetes;
    }

    public void setListPaquetes(LinkedList<Paquete> listPaquetes) {
        this.listPaquetes = listPaquetes;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

}
