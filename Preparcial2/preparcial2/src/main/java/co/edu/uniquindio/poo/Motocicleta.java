package co.edu.uniquindio.poo;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(int cilindrada, String marca, String placa, String modelo, Envio theEnvio, Ruta ruta) {
        super(marca, placa, modelo, theEnvio, ruta);
        this.cilindrada = cilindrada;

    }

    
    public double calcularCostoEnvio(){
        double costoTotal = 0;

        if(ZonaEntrega.RURAL != theEnvio.getZonaEntrega()){
            costoTotal = 8000 * listPaquetes.size();
        }else{
            costoTotal = 15000 * listPaquetes.size();
        }

        return costoTotal;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
