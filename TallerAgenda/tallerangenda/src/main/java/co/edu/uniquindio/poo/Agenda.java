package co.edu.uniquindio.poo;

public class Agenda {
    private String nombre;
    private Contacto[] listaContactos;
    private Grupo[] listaGrupos;
    private Reunion[] listaReuniones;

    public Agenda(String nombre) {
        this.nombre = nombre;
        int countContacto = 0;
        int countGrupo = 0;
        int countReunion = 0;
        listaContactos = new Contacto[countContacto];
        listaGrupos = new Grupo[countGrupo];
        listaReuniones = new Reunion[countReunion];

    }

    // Metodos para el Contacto
    public boolean crearContacto(Contacto newContacto) {
        int indice = encontrarPosicionValida();
        if (verificarContacto(newContacto.getTelefono()) && indice != -1) {
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

    public boolean verificarContacto(String telefonoVerificar) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null && listaContactos[i].getTelefono().equals(telefonoVerificar)) {
                return false;
            }

        }
        return true;
    }

    public int buscarContactoTelefono(String telefonoBuscar) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null && listaContactos[i].getTelefono().equals(telefonoBuscar)) {
                return i;
            }

        }
        return -1;

    }

    public boolean eliminarContacto(String telefonoEliminar) {
        int indiceContacto = buscarContactoTelefono(telefonoEliminar);
        if (indiceContacto != -1) {
            listaContactos[indiceContacto] = null;
            return true;

        }
        return false;

    }

    public boolean actualizarContacto(String telefonoBuscar, Contacto contactoActualizado) {
        int indiceContacto = buscarContactoTelefono(telefonoBuscar);
        if (indiceContacto != -1) {
            listaContactos[indiceContacto] = contactoActualizado;
            return true;

        }
        return false;

    }

    // Metodos para el Grupo
    public boolean crearGrupo(Grupo newGrupo) {
        int indice = encontrarPosicionValida();
        listaGrupos[indice] = newGrupo;
        return true;
    }

    public int busacarGrpoNombre(String nombrebuscar) {
        for (int i = 0; i < listaGrupos.length; i++) {
            if (listaGrupos[i] != null && listaGrupos[i].getNombre().equals(nombrebuscar)) {
                return i;
            }

        }
        return -1;
    }

    public boolean eliminarGrupo(String nombreEliminar) {
        int indice = busacarGrpoNombre(nombreEliminar);
        for (int i = 0; i < listaGrupos.length; i++) {
            if (indice != -1) {
                listaGrupos[i] = null;
                return true;
            }
        }
        return false;
    }

    // metodo que me devuelve el grupo con mas contactos
    public Grupo[] grupoConMasConatctos() {
        for (int i = 0; i < listaGrupos.length; i++) {
            for (int j = i; j < listaGrupos.length; j++) {
                if (listaGrupos[i].getListaContactos().length > listaGrupos[j].getListaContactos().length) {
                    listaGrupos[i] = listaGrupos[j];
                    listaGrupos[j] = listaGrupos[i];
                }

            }

        }
        return listaGrupos;
    }

    // Metodos para la Reunion
    public boolean cerarReunion(Reunion newReunion) {
        int indice = encontrarPosicionValida();
        listaReuniones[indice] = newReunion;
        return true;
    }

    // Getters y Setters
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

    public Grupo[] getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(Grupo[] listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public Reunion[] getListaReuniones() {
        return listaReuniones;
    }

    public void setListaReuniones(Reunion[] listaReuniones) {
        this.listaReuniones = listaReuniones;
    }

}
