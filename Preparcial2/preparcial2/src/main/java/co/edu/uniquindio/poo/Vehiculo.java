package co.edu.uniquindio.poo;

import java.util.LinkedList;

public abstract class Vehiculo {

    protected String marca;
    protected String placa;
    protected String modelo;
    protected Envio theEnvio;
    protected Ruta ruta;
    protected LinkedList<Paquete> listPaquetes;

    public Vehiculo(String marca, String placa, String modelo, Envio theEnvio, Ruta ruta) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.theEnvio = theEnvio;
        listPaquetes = new LinkedList<>();
    }

    public abstract double calcularCostoEnvio();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Envio getTheEnvio() {
        return theEnvio;
    }

    public void setTheEnvio(Envio theEnvio) {
        this.theEnvio = theEnvio;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LinkedList<Paquete> getListPaquetes() {
        return listPaquetes;
    }

    public void setListPaquetes(LinkedList<Paquete> listPaquetes) {
        this.listPaquetes = listPaquetes;
    }

    

}
