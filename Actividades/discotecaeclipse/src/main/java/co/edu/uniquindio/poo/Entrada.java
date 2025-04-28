package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Entrada {

    private LocalDate fecha;
    private TipoEntrada tipoEntrada;

    public Entrada(LocalDate fecha, TipoEntrada tipoEntrada) {
        this.fecha = fecha;
        this.tipoEntrada = tipoEntrada;

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

}
