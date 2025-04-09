package co.edu.uniquindio.poo;

public class Reunion {
    
    private String descripcion;
    private String fecha;
    private String hora;
    private Contacto[] listaContactosAux;


    public Reunion(String descripcion, String fecha, String hora){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        int countAux = 0;
        listaContactosAux = new Contacto [countAux];

    }

    public boolean asgignarContactoAux(Contacto newContactoAux){
        int indice = encontrarPosicionValida();
        if(indice != -1){
            listaContactosAux[indice] = newContactoAux;
            return true;
        }
        return false;
        
    }

    public int encontrarPosicionValida() {
        for (int i = 0; i < listaContactosAux.length; i++) {
            if (listaContactosAux[i] == null) {
                return i;
            }

        }
        return -1;
    }


    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public Contacto[] getListaContactosAux() {
        return listaContactosAux;
    }

    public void setListaContactosAux(Contacto[] listaContactosAux) {
        this.listaContactosAux = listaContactosAux;
    }

    
}
