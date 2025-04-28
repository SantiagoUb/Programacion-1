package co.edu.uniquindio.poo;

public class Furgoneta extends Vehiculo {

    private Transmision transmision;

    public Furgoneta(Transmision transmision, String marca, String placa, String modelo, Envio theEnvio, Ruta ruta) {
        super(marca, placa, modelo, theEnvio, ruta);
        this.transmision = transmision;
    }

    public double calcularCostoEnvio() {
        double costoTotal = 0;

        costoTotal = (3000 * ruta.getDistanciaRuta()) + 10000;

        return costoTotal;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

}
