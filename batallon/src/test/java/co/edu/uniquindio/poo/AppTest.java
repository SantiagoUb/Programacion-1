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
        //compara que dos elementos sean iguales (esperado - resultado)
        assertEquals(4, 4);

        //compara que dos elmentos no sean iguales ()
        assertNotEquals(1, "1");
        LOG.info("Finalizando test uno");

        //comprueba que una condicion sea verdadera
        assertTrue(1 > 0);

        //comprueba que una condicion sea falsa
        assertFalse(1 == 0);

        //comprueba que un elemento sea nulo
        assertNull(null);

        //comprueba que un elemento no sea nulo
        assertNotNull(new Batallon("193848", "cacique calarca"));

    }

    @SuppressWarnings("unchecked")
    @Test
    @DisplayName("Registro de misiones batallon")
    public void registrarMisionTest(){
        Batallon batallon1 = new Batallon("007", "Cacique Calarca");
        LinkedList<String> listrsonal = new LinkedList<>();
        listrsonal.add("Carlos");
        listrsonal.add("Tomas");
        listrsonal.add("Juan");

        
        VehiculoBlindado newVehiculoBlindado = new VehiculoBlindado("1", "2000", 1999, 10000.0, 45, EstadoOperativo.DISPONIBLE, 2);

        LinkedList listTempo = batallon1.getListMisiones();
        listTempo.add(newVehiculoBlindado);
        batallon1.setListVehiculos(listTempo);
        boolean result = batallon1.registrarMision(LocalDate.of(2025, 04, 15), "Genova", listrsonal, "1");

        assertTrue(result);

    }

}
