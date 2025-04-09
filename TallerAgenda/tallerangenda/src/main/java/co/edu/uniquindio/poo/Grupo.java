package co.edu.uniquindio.poo;

public class Grupo {

    private String nombre;
    private Contacto[] listaContactos;
    private Categoria categoria;

    public Grupo(String nombre) {
        this.nombre = nombre;
        listaContactos = new Contacto[5];

    }

    public boolean agregarContacto(Contacto newContacto) {
        int indice = encontrarPosicionValida();
        if (indice != -1) {
            listaContactos[indice] = newContacto;
            return true;

        }
        return false;

    }

    public int encontrarPosicionValida() {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == null) {
                return i;
            }

        }
        return -1;
    }

    public boolean removerContacto(String nombreRemover){
        int indiceContacto = buscarContactoNombre(nombreRemover);
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[indiceContacto] != null && listaContactos[indiceContacto].getNombre().equals(nombreRemover)){
                return true;
            }
            
        }
        return false;

    }

    public int buscarContactoNombre(String nombreBuscar){
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] != null && listaContactos[i].getNombre().equals(nombreBuscar)){
                return 1;
            }
        }
        return -1;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
