package co.edu.uniquindio.poo;

public class Consultorio {
    private String nombre;
    private Medico[] listaMedicos;
    private Paciente[] listaPacientes;

    public Consultorio(String nombre) {
        this.nombre = nombre;
        int countMedicos = 0;
        int countPacientes = 0;
        listaMedicos = new Medico[countMedicos];
        listaPacientes = new Paciente[countPacientes];
    }

    public boolean crearRegistroPaciente(Paciente newPaciente){
        int indice =  posicionValida();
        for (int i = 0; i < listaPacientes.length; i++) {
            if (verificarNumeroClinico(newPaciente.numeroHistoriaClinica()) && indice != -1){
                listaPacientes[i] = newPaciente;
                return true;
            }
        }
        return false;
    }

    public boolean actualizarRegistroPaciente(Paciente newRegistroPaciente, int numeroHistoriaClinicaActualizar){
        for (int i = 0; i < listaPacientes.length; i++) {
            if(listaPacientes[i].numeroHistoriaClinica() == numeroHistoriaClinicaActualizar){
                listaPacientes[i] = newRegistroPaciente;
                return true;
            }
        }
        return false;
    }
    
    public Paciente[] listaPacientesMas5Registros(){
        Paciente [] listaPacientes2 = listaPacientes;
        for (int i = 0; i < listaPacientes2.length; i++) {
            if(actualizarRegistroPaciente(null, i)){
                
            }
        }
    }

    public boolean verificarNumeroClinico(int numeroHistoriaClinica){
        for (int i = 0; i < listaPacientes.length; i++) {
            if (listaPacientes[i].numeroHistoriaClinica() != numeroHistoriaClinica){
                return true;   
            }
        }
        return true;
    }

    public boolean crearMedico(Medico newMedico) {
        int indice = posicionValida();
        if (verificarMedico(newMedico.getId()) && indice != -1) {
            listaMedicos[indice] = newMedico;
            return true;
        }
        return false;

    }



    public boolean eliminarMedico(String idEliminar){
        int indice = buscarMedicoId(idEliminar);
        for(int i = 0; i < listaMedicos.length; i++){
            if(listaMedicos[i].getId().equals(idEliminar) && indice != -1){
                listaMedicos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean verificarMedico(String idMedico) {
        for (int i = 0; i < listaMedicos.length; i++) {
            if (listaMedicos[i].getId().equals(idMedico)) {
                return false;
            }

        }
        return true;

    }

    
    public int posicionValida() {
        for (int i = 0; i < listaMedicos.length; i++) {
            if (listaMedicos[i] == null) {
                return i;
            }

        }
        return -1;
    }

    public int buscarMedicoId(String idBuscar){
        for (int i = 0; i < listaMedicos.length; i++) {
            if(listaMedicos[i].getId().equals(idBuscar)){
                return i;
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

    public Medico[] getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(Medico[] listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public Paciente[] getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(Paciente[] listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

}
