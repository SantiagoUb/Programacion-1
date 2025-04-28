package co.edu.uniquindio.poo;

public class Ruta {

    private int numeroPeajes;
    private int distanciaRuta;

    public Ruta(int numeroPeajes, int distanciaRuta) {
        this.numeroPeajes = numeroPeajes;
        this.distanciaRuta = distanciaRuta;
    }

    public int getNumeroPeajes() {
        return numeroPeajes;
    }

    public void setNumeroPeajes(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    public int getDistanciaRuta() {
        return distanciaRuta;
    }

    public void setDistanciaRuta(int distanciaRuta) {
        this.distanciaRuta = distanciaRuta;
    }
    
}
