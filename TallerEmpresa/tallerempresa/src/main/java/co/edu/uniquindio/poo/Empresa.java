package co.edu.uniquindio.poo;

public class Empresa {

    private String nit;
    private String nombre;
    private Empleado[] listEmpleados;

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        listEmpleados = new Empleado[50];
    }

    public Empleado[] buscarEmpleadosSalarioAlto() {
        Empleado[] empleadosSalarioAlto = encontrarListaEmpleadosSinNulos(listEmpleados);
        if (empleadosSalarioAlto.length == 0) {
            return new Empleado[0];
        }

        for (int i = 0; i < empleadosSalarioAlto.length; i++) {
            for (int j = i; j < empleadosSalarioAlto.length; j++) {
                if (empleadosSalarioAlto[i].getSalario() < empleadosSalarioAlto[j].getSalario()) {
                    empleadosSalarioAlto[i] = empleadosSalarioAlto[j];
                }
            }
        }
        return empleadosSalarioAlto;
    }

    private Empleado[] encontrarListaEmpleadosSinNulos(Empleado[] listEmpleados) {

        int count = 0;
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null) {
                count++;
            }

        }

        Empleado[] empleadosSinNulos = new Empleado[count];
        int index = 0;
        for (int i = 0; i < empleadosSinNulos.length; i++) {
            if (listEmpleados[i] != null) {
                empleadosSinNulos[index++] = listEmpleados[i];
            }

        }
        return empleadosSinNulos;

    }

    public Empleado[] buscarEmpleadosCargo(String cargoBuscar) {
        int cantEmpleadosCargo = 0;

        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i].getCargo().equals(cargoBuscar)) {
                cantEmpleadosCargo++;
            }
        }

        Empleado[] empleadosCargo = new Empleado[cantEmpleadosCargo];
        int pepitoIndex = 0;

        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i].getCargo().equals(cargoBuscar)) {
                empleadosCargo[pepitoIndex] = listEmpleados[i];
                pepitoIndex++;
            }
        }
        return empleadosCargo;
    }

    public boolean eliminarEmpleado(String idEliminar, Empleado empleadoEliminado) {
        int indiceEmpleado = buscarEmpleadID(idEliminar);

        if (indiceEmpleado != -1) {
            listEmpleados[indiceEmpleado] = null;
            return true;
        }
        return false;
    }

    public boolean actualizarEmpleado(String idBuscar, Empleado empleadoActualizado) {
        int indiceEmpleado = buscarEmpleadID(idBuscar);

        if (indiceEmpleado != -1) {
            listEmpleados[indiceEmpleado] = empleadoActualizado;
            return true;
        }
        return false;
    }

    public int buscarEmpleadID(String idBuscar) {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i].getId().equals(idBuscar)) {
                return i;
            }
        }
        return -1;
    }

    public boolean crearEmpleado(Empleado newEmpleado) {

        int indice = encontrarPosicionValida();

        if (verificarIdEmpleado(newEmpleado.getId())
                && indice != -1) {
            listEmpleados[indice] = newEmpleado;
            return true;
        }
        return false;
    }

    public int encontrarPosicionValida() {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean verificarIdEmpleado(String idEmpleado) {
        boolean flag = true;

        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i].getId().equals(idEmpleado)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Cargos Gerente; Administrador; Auxiliar
    public double asignarSalarioEmpleado(Empleado empleado) {
        double salarioCargo = 0;
        switch (empleado.getCargo().toLowerCase()) {
            case "auxiliar":
                salarioCargo += 2000000;
                break;

            case "administrador":
                salarioCargo += 3000000;
                break;

            case "gerente":
                salarioCargo += 4000000;
                break;

            default:
                salarioCargo += 1000000;
                break;
        }
        return salarioCargo;
    }

    public Empleado[] getListEmpleados() {
        return listEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
