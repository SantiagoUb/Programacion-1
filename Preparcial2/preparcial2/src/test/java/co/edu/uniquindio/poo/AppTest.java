/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    // Empresa
    Empresa empresa1 = new Empresa("envios rapidos");

    // Clientes
    Cliente cliente1 = new Cliente("Laura García", "1234567890", "laura@gmail.com", "Calle 10 #23-45");
    Cliente cliente2 = new Cliente("Carlos Méndez", "9876543210", "carlos@hotmail.com", "Carrera 8 #12-34");
    Cliente cliente3 = new Cliente("Ana Torres", "1122334455", "ana@yahoo.com", "Avenida 7 #45-67");

    // Envios
    Envio envio1 = new Envio("ENV001", 25000.0, ZonaEntrega.URBANA, LocalDate.of(2025, 4, 21), cliente1);
    Envio envio2 = new Envio("ENV002", 40000.0, ZonaEntrega.RURAL, LocalDate.of(2025, 4, 22), cliente2);
    Envio envio3 = new Envio("ENV003", 100000.0, ZonaEntrega.URBANA, LocalDate.of(2025, 4, 23), cliente3);

    // Rutas
    Ruta ruta1 = new Ruta(3, 150);
    Ruta ruta2 = new Ruta(5, 230);
    Ruta ruta3 = new Ruta(2, 90);

    // Vehiculos
    Camion camion1 = new Camion("4 toneladas", "Volvo", "XYZ-123", "2020", envio1, ruta2);
    Furgoneta furgoneta1 = new Furgoneta(Transmision.MANUAL, "Renault", "GUW-567", "2019", envio3, ruta1);
    Motocicleta motocicleta1 = new Motocicleta(250, "Yamaha", "RTY-890", "2018", envio2, ruta3);

    // Paquetes
    Paquete paquete1 = new Paquete("PAQ001", 10, envio1);
    Paquete paquete2 = new Paquete("PAQ002", 17, envio1);

    Paquete paquete3 = new Paquete("PAQ003", 12, envio2);
    Paquete paquete4 = new Paquete("PAQ004", 20, envio2);

    Paquete paquete5 = new Paquete("PAQ005", 25, envio3);
    Paquete paquete6 = new Paquete("PAQ006", 40, envio3);

    /**
     * Test para probar el metodo de calcular el costo de envio
     */

    @Test
    public void calcularCostoEnvioTest() {
        LOG.info("Iniciado test de calcular costo de envio");

        camion1.getListPaquetes().add(paquete5);
        camion1.getListPaquetes().add(paquete6);

        double costo = camion1.calcularCostoEnvio();
        assertEquals(305000, costo);

        LOG.info("Finalizando test de calcular costo de envio");
    }

    @Test
    public void obtenerEnviosPesoMayor50Test() {

        envio1.getListPaquetes().add(paquete1);
        envio1.getListPaquetes().add(paquete2);

        envio2.getListPaquetes().add(paquete3);
        envio2.getListPaquetes().add(paquete4);

        envio3.getListPaquetes().add(paquete5);
        envio3.getListPaquetes().add(paquete6);
        
    }
}
