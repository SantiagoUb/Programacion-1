package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private LinkedList<Ruta> listRutas;
    private LinkedList<Paquete> listPaquetes;
    private LinkedList<Envio> listEnvios;
    private LinkedList<Vehiculo> listVehiculos;

    public Empresa(String nombre){
        this.nombre = nombre;
        listRutas = new LinkedList<>();
        listPaquetes = new LinkedList<>();
        listEnvios = new LinkedList<>();
        listVehiculos = new LinkedList<>();
    }

    // metodo para obtener envios con un peso de mas de 50

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Ruta> getListRutas() {
        return listRutas;
    }
    public void setListRutas(LinkedList<Ruta> listRutas) {
        this.listRutas = listRutas;
    }
    public LinkedList<Paquete> getListPaquetes() {
        return listPaquetes;
    }
    public void setListPaquetes(LinkedList<Paquete> listPaquetes) {
        this.listPaquetes = listPaquetes;
    }
    public LinkedList<Envio> getListEnvios() {
        return listEnvios;
    }
    public void setListEnvios(LinkedList<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }
    public LinkedList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }
    public void setListVehiculos(LinkedList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    
    
}
