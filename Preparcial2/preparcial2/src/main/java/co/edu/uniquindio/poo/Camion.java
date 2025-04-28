package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {

    private String capacidadCarga;

    public Camion(String capacidadCarga, String marca, String placa, String modelo, Envio theEnvio, Ruta ruta) {
        super(marca, placa, modelo, theEnvio, ruta);
        this.capacidadCarga = capacidadCarga;
        
    }

    public double calcularCostoEnvio(){
        double costoTotal = 0;

        double sumaPaquetes = 0;
        for(Paquete paquete: listPaquetes){
            sumaPaquetes += paquete.getPeso();
        }

        costoTotal = (ruta.getNumeroPeajes()  * 12000) + (sumaPaquetes * 7000);

        return costoTotal;
        
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    
}
