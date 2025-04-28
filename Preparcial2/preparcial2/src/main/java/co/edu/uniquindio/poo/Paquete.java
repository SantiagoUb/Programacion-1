package co.edu.uniquindio.poo;

public class Paquete {

    private String codigo;
    private int peso;
    private Envio theEnvio;

    public Paquete(String codigo, int peso, Envio theEnvio) {
        this.codigo = codigo;
        this.peso = peso;
        this.theEnvio = theEnvio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Envio getTheEnvio() {
        return theEnvio;
    }

    public void setTheEnvio(Envio theEnvio) {
        this.theEnvio = theEnvio;
    }

}
