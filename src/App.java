import models.Vehiculo;
import models.Motor;
import models.Transmision;
import models.Chasis;
import models.Neumatico;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.RegistroVehicular;
import models.Mantenimiento;
import models.Sensor;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Landcruiser", 14365765, "Negro");
        miVehiculo.displayInfo();

        Motor miMotor = new Motor("Gasolina", 1600, 120, "Nuevo");
        miMotor.displayInfo();

        Transmision miTransmision = new Transmision("Manual", 6, "4x4", "Nuevo");
        miTransmision.displayInfo();

        Chasis miChasis = new Chasis("Monocasco", "4.5m x 1.8m x 1.4m", "1500kg", "Aluminio");
        miChasis.displayInfo();

        Neumatico miNeumatico = new Neumatico("All Terrain", "18", "265/70R18", "Nuevo");
        miNeumatico.displayInfo();

        SistemaElectrico miSistemaElectrico = new SistemaElectrico("Batería de 12V", "LED", "Sensores de estacionamiento", "GPS");
        miSistemaElectrico.displayInfo();

        SistemaFrenos miSistemaFrenos = new SistemaFrenos("Discos", "ABS", "Electrónico", "Nuevo", "Cada 20,000 km");
        miSistemaFrenos.displayInfo();

        RegistroVehicular miRegistroVehicular = new RegistroVehicular("ACH773", "Adrian Morales", "2025-10-12", "2026-10-12");
        miRegistroVehicular.displayInfo();

        Mantenimiento miMantenimiento = new Mantenimiento("Cambio de aceite", "2025-10-12", "Preventivo");
        miMantenimiento.displayInfo();

        Sensor miSensor = new Sensor("Sensor de temperatura", "2025-10-12", "Nuevo", "Sensor de presión");
        miSensor.displayInfo();
    }

}
