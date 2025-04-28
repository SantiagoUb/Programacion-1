/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Clase para probar las funcionalidades de el proyecto batallon
 * 
 * @author Willy Santiago Urbano Osorio
 * @since 8/04/2025
 */

public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Prueba funcionalidades test")

    public void testUno() {
        LOG.info("Iniciado test uno");
        // compara que dos elementos sean iguales (esperado - resultado)
        assertEquals(4, 4);

        // compara que dos elmentos no sean iguales ()
        assertNotEquals(1, "1");

        // comprueba que una condicion sea verdadera
        assertTrue(1 > 0);

        // comprueba que una condicion sea falsa
        assertFalse(1 == 0);

        // comprueba que un elemento sea nulo
        assertNull(null);

        // comprueba que un elemento no sea nulo
        assertNotNull(new Batallon("193848", "cacique calarca"));

        LOG.info("Finalizando test uno");

    }

    @SuppressWarnings("unchecked")
    @Test
    @DisplayName("Registro de misiones batallon")
    public void registrarMisionTest() {
        Batallon batallon1 = new Batallon("007", "Cacique Calarca");
        LinkedList<String> listpersonal = new LinkedList<>();
        listpersonal.add("Carlos");
        listpersonal.add("Tomas");
        listpersonal.add("Juan");

        VehiculoBlindado newVehiculoBlindado = new VehiculoBlindado("1", "2000", 1999, 10000.0, 45,
                EstadoOperativo.DISPONIBLE, 2);

        LinkedList listTempo = batallon1.getListMisiones();
        listTempo.add(newVehiculoBlindado);
        batallon1.setListVehiculos(listTempo);
        boolean result = batallon1.registrarMision(LocalDate.of(2025, 04, 15), "Genova", listpersonal, "1");

        assertTrue(result);

    }

    @Test
    @DisplayName("Test para probar metodo de asignar un soldado a una mision")

    public void asignarSoldadoMisionTest() {
        LOG.info("iniciando test de asignar soldado");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision misionTest = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");
        Soldado soldadoTest = new Soldado("6573", "Sergio Ramos", Rango.SOLDADO, Especializacion.COMUNICACION, 28,
                EstadoSoldado.DISPONIBLE, misionTest);

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.SOLDADO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, misionTest);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.CABO, Especializacion.COMUNICACION, 30,
                EstadoSoldado.NO_DISPONIBLE, misionTest);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.SARGENTO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, misionTest);

        LinkedList<Soldado> listPersonal = new LinkedList<>();

        listPersonal.add(soldado1);
        listPersonal.add(soldado2);
        listPersonal.add(soldado3);

        batallonTest.getListMisiones().add(misionTest);
        batallonTest.getListSoldados().add(soldadoTest);

        // boolean result = batallonTest.asignarSoldadoMision("6573", "3452");
        // assertTrue(result);
        batallonTest.asignarSoldadoMision("6573", "3452");

        assertTrue(soldadoTest.getEstadoSoldado() == EstadoSoldado.NO_DISPONIBLE);

        LOG.info("finalizando test de asignar mision");

    }

    @Test
    @DisplayName("Test para probar metodo de liberar soldados")

    public void liberarSoldadosTest() {
        LOG.info("iniciando test de liberar soldados");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision misionTest = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.SOLDADO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, misionTest);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.CABO, Especializacion.COMUNICACION, 30,
                EstadoSoldado.NO_DISPONIBLE, misionTest);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.SARGENTO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, misionTest);

        LinkedList<Soldado> listPersonal = new LinkedList<>();

        listPersonal.add(soldado1);
        listPersonal.add(soldado2);
        listPersonal.add(soldado3);

        batallonTest.getListMisiones().add(misionTest);
        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);

        batallonTest.liberSoldado(listPersonal, LocalDate.of(2025, 03, 10));

        assertEquals(soldado1.getEstadoSoldado(), EstadoSoldado.DISPONIBLE);
        assertEquals(soldado2.getEstadoSoldado(), EstadoSoldado.DISPONIBLE);
        assertEquals(soldado3.getEstadoSoldado(), EstadoSoldado.DISPONIBLE);

        LOG.info("finalizando test de liberar soldados");

    }

    @Test
    @DisplayName("Test para probar metodo de buscar soldado por especializacion")

    public void buscarSoldadoEspecialidadTest() {
        LOG.info("iniciando test buscar soldados especialidad");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision m1 = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.SOLDADO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.CABO, Especializacion.LOGISTICA, 30,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.SARGENTO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, m1);

        batallonTest.getListMisiones().add(m1);
        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);

        LinkedList<Soldado> resultado = batallonTest.buscarSoldadoEspecialidad(Especializacion.LOGISTICA);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains(soldado1));
        assertTrue(resultado.contains(soldado2));

        LOG.info("finalizando test de buscar soldados especialidad");

    }

    @Test
    @DisplayName("Test para probar metodo de obtener soldados por rango")

    public void soldadosDisponoblesRangoTest() {
        LOG.info("iniciando test de obtener soldados por rango");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision m1 = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.CABO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.SARGENTO, Especializacion.LOGISTICA, 30,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.CABO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, m1);

        batallonTest.getListMisiones().add(m1);
        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);

        LinkedList<Soldado> resultado = batallonTest.soldadosDisponoblesRango(Rango.CABO);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains(soldado1));
        assertTrue(resultado.contains(soldado3));

        LOG.info("finalizando test de obtener soldados por rango");

    }

    @Test
    @DisplayName("Test para probar metodo de calcular la edad promedio")

    public void calcularPromedioEdadSoldadosTest() {
        LOG.info("iniciando test de calcular edad promedio");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision m1 = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.CABO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.SARGENTO, Especializacion.LOGISTICA, 30,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.CABO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, m1);

        batallonTest.getListMisiones().add(m1);
        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);

        double resultado = batallonTest.calcularPromedioEdadSoldados();
        double promedio = (25 + 30 + 28) / 3;

        assertEquals(promedio, (int) resultado);

        LOG.info("finalizando test de calcular edad promedio");

    }

    @Test
    @DisplayName("Test para probar metodo de buscar soldado por id")

    public void buscarIdSoldadoTest() {
        LOG.info("iniciando test de buscar soldado por id");

        Batallon batallonTest = new Batallon("0345", "Infanteria Custordio Garcia");
        Mision m1 = new Mision("3452", LocalDate.of(2025, 04, 12), "Genova");

        Soldado soldado1 = new Soldado("ID001", "Carlos Ramírez", Rango.CABO, Especializacion.LOGISTICA, 25,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado2 = new Soldado("ID002", "Luis Fernández", Rango.SARGENTO, Especializacion.LOGISTICA, 30,
                EstadoSoldado.NO_DISPONIBLE, m1);
        Soldado soldado3 = new Soldado("ID003", "Ana Torres", Rango.CABO, Especializacion.MEDICO, 28,
                EstadoSoldado.NO_DISPONIBLE, m1);

        batallonTest.getListMisiones().add(m1);
        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);

        Soldado resultado = batallonTest.buscarIdSoldado("ID002");

        assertEquals(soldado2, resultado);

        LOG.info("finalizando test de buscar soldado por id");

    }

}
