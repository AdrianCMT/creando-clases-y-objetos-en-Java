import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.setMake("Toyota");
        miVehiculo.setModel("Tacoma");
        miVehiculo.setIdentification(345676);
        miVehiculo.setColor("Negro");

        Vehiculo miVehiculo2 = new Vehiculo();
        miVehiculo2.setMake("Chevrolet");
        miVehiculo2.setModel("Silverado");
        miVehiculo2.setIdentification(123456);
        miVehiculo2.setColor("Rojo");

        Vehiculo miVehiculo3 = new Vehiculo();
        miVehiculo3.setMake("Ford");
        miVehiculo3.setModel("F-150");
        miVehiculo3.setIdentification(789012);
        miVehiculo3.setColor("Azul");

        Vehiculo miVehiculo4 = new Vehiculo();
        miVehiculo4.setMake("Honda");
        miVehiculo4.setModel("Civic");
        miVehiculo4.setIdentification(345678);
        miVehiculo4.setColor("Blanco");

        System.out.println("Vehículo 1:");
        System.out.println("Vehículo: " + miVehiculo.getMake());
        System.out.println("Modelo: " + miVehiculo.getModel());
        System.out.println("Identificación: " + miVehiculo.getIdentification());
        System.out.println("Color: " + miVehiculo.getColor());

        System.out.println("--------------------------------------------------");

        System.out.println("vehículo 2:");
        System.out.println("vehículo: " + miVehiculo2.getMake());
        System.out.println("modelo: " + miVehiculo2.getModel());
        System.out.println("identificación: " + miVehiculo2.getIdentification());
        System.out.println("color: " + miVehiculo2.getColor());

        System.out.println("--------------------------------------------------");

        System.out.println("vehículo 3:");
        System.out.println("vehículo: " + miVehiculo3.getMake());
        System.out.println("modelo: " + miVehiculo3.getModel());
        System.out.println("identificación: " + miVehiculo3.getIdentification());
        System.out.println("color: " + miVehiculo3.getColor());

        System.out.println("--------------------------------------------------");

        System.out.println("vehículo 4:");
        System.out.println("vehículo: " + miVehiculo4.getMake());
        System.out.println("modelo: " + miVehiculo4.getModel());
        System.out.println("identificación: " + miVehiculo4.getIdentification());
        System.out.println("color: " + miVehiculo4.getColor());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        Motor miMotor = new Motor();
        miMotor.setTipo("Gasolina");
        miMotor.setCilindrada(2500);
        miMotor.setPotencia(200);
        miMotor.setEstado("Nuevo");

        Motor miMotor2 = new Motor();
        miMotor2.setTipo("Diésel");
        miMotor2.setCilindrada(3000);
        miMotor2.setPotencia(250);
        miMotor2.setEstado("Usado");

        Motor miMotor3 = new Motor();
        miMotor3.setTipo("Eléctrico");
        miMotor3.setCilindrada(0);
        miMotor3.setPotencia(150);
        miMotor3.setEstado("Nuevo");

        Motor miMotor4 = new Motor();
        miMotor4.setTipo("Híbrido");
        miMotor4.setCilindrada(2000);
        miMotor4.setPotencia(180);
        miMotor4.setEstado("Usado");

        System.out.println("Tipo de motor: 1");
        System.out.println("Tipo de motor: " + miMotor.getTipo());
        System.out.println("Cilindrada: " + miMotor.getCilindrada());
        System.out.println("Potencia: " + miMotor.getPotencia());
        System.out.println("Estado: " + miMotor.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de motor: 2");
        System.out.println("Tipo de motor: " + miMotor2.getTipo());
        System.out.println("Cilindrada: " + miMotor2.getCilindrada());
        System.out.println("Potencia: " + miMotor2.getPotencia());
        System.out.println("Estado: " + miMotor2.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de motor: 3");
        System.out.println("Tipo de motor: " + miMotor3.getTipo());
        System.out.println("Cilindrada: " + miMotor3.getCilindrada());
        System.out.println("Potencia: " + miMotor3.getPotencia());
        System.out.println("Estado: " + miMotor3.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de motor: 4");
        System.out.println("Tipo de motor: " + miMotor4.getTipo());
        System.out.println("Cilindrada: " + miMotor4.getCilindrada());
        System.out.println("Potencia: " + miMotor4.getPotencia());
        System.out.println("Estado: " + miMotor4.getEstado());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        Transmision miTransmision = new Transmision();
        miTransmision.setTipo("Manual");
        miTransmision.setMarchas(6);
        miTransmision.setTraccion("4x4");
        miTransmision.setEstado("Nuevo");

        Transmision miTransmision2 = new Transmision();
        miTransmision2.setTipo("Automática");
        miTransmision2.setMarchas(8);
        miTransmision2.setTraccion("4x2");
        miTransmision2.setEstado("Usado");

        Transmision miTransmision3 = new Transmision();
        miTransmision3.setTipo("CVT");
        miTransmision3.setMarchas(0);
        miTransmision3.setTraccion("4x4");
        miTransmision3.setEstado("Nuevo");

        Transmision miTransmision4 = new Transmision();
        miTransmision4.setTipo("Manual");
        miTransmision4.setMarchas(5);
        miTransmision4.setTraccion("4x2");
        miTransmision4.setEstado("Usado");

        System.out.println("Tipo de transmisión: 1");
        System.out.println("Tipo de transmisión: " + miTransmision.getTipo());
        System.out.println("Número de marchas: " + miTransmision.getMarchas());
        System.out.println("Tracción: " + miTransmision.getTraccion());
        System.out.println("Estado: " + miTransmision.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de transmisión: 2");
        System.out.println("Tipo de transmisión: " + miTransmision2.getTipo());
        System.out.println("Número de marchas: " + miTransmision2.getMarchas());
        System.out.println("Tracción: " + miTransmision2.getTraccion());
        System.out.println("Estado: " + miTransmision2.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de transmisión: 3");
        System.out.println("Tipo de transmisión: " + miTransmision3.getTipo());
        System.out.println("Número de marchas: " + miTransmision3.getMarchas());
        System.out.println("Tracción: " + miTransmision3.getTraccion());
        System.out.println("Estado: " + miTransmision3.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de transmisión: 4");
        System.out.println("Tipo de transmisión: " + miTransmision4.getTipo());
        System.out.println("Número de marchas: " + miTransmision4.getMarchas());
        System.out.println("Tracción: " + miTransmision4.getTraccion());
        System.out.println("Estado: " + miTransmision4.getEstado());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        Chasis miChasis = new Chasis();
        miChasis.setTipo("Monocasco");
        miChasis.setDimensiones("4.5m x 1.8m x 1.6m");
        miChasis.setPeso("1500 kg");
        miChasis.setMaterial("Acero");

        Chasis miChasis2 = new Chasis();
        miChasis2.setTipo("Escalera");
        miChasis2.setDimensiones("5.0m x 2.0m x 1.8m");
        miChasis2.setPeso("2000 kg");
        miChasis2.setMaterial("Aluminio");

        Chasis miChasis3 = new Chasis();
        miChasis3.setTipo("Monocasco");
        miChasis3.setDimensiones("4.8m x 1.9m x 1.7m");
        miChasis3.setPeso("1600 kg");
        miChasis3.setMaterial("Acero");

        Chasis miChasis4 = new Chasis();
        miChasis4.setTipo("Escalera");
        miChasis4.setDimensiones("5.2m x 2.1m x 1.9m");
        miChasis4.setPeso("2100 kg");
        miChasis4.setMaterial("Aluminio");

        System.out.println("Tipo de chasis: 1");
        System.out.println("Tipo de chasis: " + miChasis.getTipo());
        System.out.println("Dimensiones: " + miChasis.getDimensiones());
        System.out.println("Peso: " + miChasis.getPeso());
        System.out.println("Material: " + miChasis.getMaterial());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de chasis: 2");
        System.out.println("Tipo de chasis: " + miChasis2.getTipo());
        System.out.println("Dimensiones: " + miChasis2.getDimensiones());
        System.out.println("Peso: " + miChasis2.getPeso());
        System.out.println("Material: " + miChasis2.getMaterial());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de chasis: 3");
        System.out.println("Tipo de chasis: " + miChasis3.getTipo());
        System.out.println("Dimensiones: " + miChasis3.getDimensiones());
        System.out.println("Peso: " + miChasis3.getPeso());
        System.out.println("Material: " + miChasis3.getMaterial());

        System.out.println("-------------------------------------------------");

        System.out.println("Tipo de chasis: 4");
        System.out.println("Tipo de chasis: " + miChasis4.getTipo());
        System.out.println("Dimensiones: " + miChasis4.getDimensiones());
        System.out.println("Peso: " + miChasis4.getPeso());
        System.out.println("Material: " + miChasis4.getMaterial());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");


        Neumatico miNeumatico = new Neumatico();
        miNeumatico.setMarca("Michelin");
        miNeumatico.setTamaño("225/45 R17");
        miNeumatico.setPresion("32 PSI");
        miNeumatico.setEstado("Nuevo");

        Neumatico miNeumatico2 = new Neumatico();
        miNeumatico2.setMarca("Bridgestone");
        miNeumatico2.setTamaño("235/50 R18");
        miNeumatico2.setPresion("30 PSI");
        miNeumatico2.setEstado("Usado");

        Neumatico miNeumatico3 = new Neumatico();
        miNeumatico3.setMarca("Goodyear");
        miNeumatico3.setTamaño("215/55 R16");
        miNeumatico3.setPresion("34 PSI");
        miNeumatico3.setEstado("Nuevo");

        Neumatico miNeumatico4 = new Neumatico();
        miNeumatico4.setMarca("Pirelli");
        miNeumatico4.setTamaño("245/40 R19");
        miNeumatico4.setPresion("28 PSI");
        miNeumatico4.setEstado("Usado");

        System.out.println("Marca: 1"); 
        System.out.println("Marca: " + miNeumatico.getMarca());
        System.out.println("Tamaño: " + miNeumatico.getTamaño());
        System.out.println("Presión: " + miNeumatico.getPresion());
        System.out.println("Estado: " + miNeumatico.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Marca: 2");
        System.out.println("Marca: " + miNeumatico2.getMarca());
        System.out.println("Tamaño: " + miNeumatico2.getTamaño());
        System.out.println("Presión: " + miNeumatico2.getPresion());
        System.out.println("Estado: " + miNeumatico2.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Marca: 3");
        System.out.println("Marca: " + miNeumatico3.getMarca());
        System.out.println("Tamaño: " + miNeumatico3.getTamaño());
        System.out.println("Presión: " + miNeumatico3.getPresion());
        System.out.println("Estado: " + miNeumatico3.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Marca: 4");
        System.out.println("Marca: " + miNeumatico4.getMarca());
        System.out.println("Tamaño: " + miNeumatico4.getTamaño());
        System.out.println("Presión: " + miNeumatico4.getPresion());
        System.out.println("Estado: " + miNeumatico4.getEstado());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");


        SistemaElectrico miSistemaElectrico = new SistemaElectrico();
        miSistemaElectrico.setBateria("12V");
        miSistemaElectrico.setLuces("LED");
        miSistemaElectrico.setSensores("Presión de neumáticos");
        miSistemaElectrico.setSistemaDeNavegacion("GPS");

        SistemaElectrico miSistemaElectrico2 = new SistemaElectrico();
        miSistemaElectrico2.setBateria("24V");
        miSistemaElectrico2.setLuces("Xenón");
        miSistemaElectrico2.setSensores("Estacionamiento");
        miSistemaElectrico2.setSistemaDeNavegacion("Ninguno");

        SistemaElectrico miSistemaElectrico3 = new SistemaElectrico();
        miSistemaElectrico3.setBateria("12V");
        miSistemaElectrico3.setLuces("Halógeno");
        miSistemaElectrico3.setSensores("Ninguno");
        miSistemaElectrico3.setSistemaDeNavegacion("Ninguno");

        SistemaElectrico miSistemaElectrico4 = new SistemaElectrico();
        miSistemaElectrico4.setBateria("12V");
        miSistemaElectrico4.setLuces("LED");
        miSistemaElectrico4.setSensores("Cámara de reversa");
        miSistemaElectrico4.setSistemaDeNavegacion("GPS");

        System.out.println("Sistema electrico: 1");
        System.out.println("Batería: " + miSistemaElectrico.getBateria());
        System.out.println("Luces: " + miSistemaElectrico.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico.getSensores());
        System.out.println("Sistema de Navegación: " + miSistemaElectrico.getSistemaDeNavegacion());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema electrico: 2");
        System.out.println("Batería: " + miSistemaElectrico2.getBateria());
        System.out.println("Luces: " + miSistemaElectrico2.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico2.getSensores());
        System.out.println("Sistema de Navegación: " + miSistemaElectrico2.getSistemaDeNavegacion());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema electrico: 3");
        System.out.println("Batería: " + miSistemaElectrico3.getBateria());
        System.out.println("Luces: " + miSistemaElectrico3.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico3.getSensores());
        System.out.println("Sistema de Navegación: " + miSistemaElectrico3.getSistemaDeNavegacion());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema electrico: 4");
        System.out.println("Batería: " + miSistemaElectrico4.getBateria());
        System.out.println("Luces: " + miSistemaElectrico4.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico4.getSensores());
        System.out.println("Sistema de Navegación: " + miSistemaElectrico4.getSistemaDeNavegacion());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        SistemaFrenos miSistemaFrenos = new SistemaFrenos();
        miSistemaFrenos.setTipo("ABS");
        miSistemaFrenos.setDiscos("Delanteros y traseros");
        miSistemaFrenos.setAbs("Sí");
        miSistemaFrenos.setEstado("Nuevo");

        SistemaFrenos miSistemaFrenos2 = new SistemaFrenos();
        miSistemaFrenos2.setTipo("No ABS");
        miSistemaFrenos2.setDiscos("Delanteros");
        miSistemaFrenos2.setAbs("No");
        miSistemaFrenos2.setEstado("Usado");

        SistemaFrenos miSistemaFrenos3 = new SistemaFrenos();
        miSistemaFrenos3.setTipo("ABS");
        miSistemaFrenos3.setDiscos("Delanteros y traseros");
        miSistemaFrenos3.setAbs("Sí");
        miSistemaFrenos3.setEstado("Nuevo");

        SistemaFrenos miSistemaFrenos4 = new SistemaFrenos();
        miSistemaFrenos4.setTipo("No ABS");
        miSistemaFrenos4.setDiscos("Delanteros");
        miSistemaFrenos4.setAbs("No");
        miSistemaFrenos4.setEstado("Usado");

        System.out.println("Sistema de frenos: 1");
        System.out.println("Tipo de frenos: " + miSistemaFrenos.getTipo());
        System.out.println("Discos: " + miSistemaFrenos.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos.getAbs());
        System.out.println("Estado: " + miSistemaFrenos.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema de frenos: 2");
        System.out.println("Tipo de frenos: " + miSistemaFrenos2.getTipo());
        System.out.println("Discos: " + miSistemaFrenos2.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos2.getAbs());
        System.out.println("Estado: " + miSistemaFrenos2.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema de frenos: 3");
        System.out.println("Tipo de frenos: " + miSistemaFrenos3.getTipo());
        System.out.println("Discos: " + miSistemaFrenos3.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos3.getAbs());
        System.out.println("Estado: " + miSistemaFrenos3.getEstado());

        System.out.println("-------------------------------------------------");

        System.out.println("Sistema de frenos: 4");
        System.out.println("Tipo de frenos: " + miSistemaFrenos4.getTipo());
        System.out.println("Discos: " + miSistemaFrenos4.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos4.getAbs());
        System.out.println("Estado: " + miSistemaFrenos4.getEstado());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        RegistroVehicular miRegistroVehicular = new RegistroVehicular();
        miRegistroVehicular.setMatricula("ABC123");
        miRegistroVehicular.setPropietario("Adrian Morales");
        miRegistroVehicular.setFechaRegistro("2025-10-12");
        miRegistroVehicular.setFechaVencimiento("2026-10-12");

        RegistroVehicular miRegistroVehicular2 = new RegistroVehicular();
        miRegistroVehicular2.setMatricula("XYZ456");
        miRegistroVehicular2.setPropietario("Juan Pérez");
        miRegistroVehicular2.setFechaRegistro("2025-10-12");
        miRegistroVehicular2.setFechaVencimiento("2026-10-12");

        RegistroVehicular miRegistroVehicular3 = new RegistroVehicular();
        miRegistroVehicular3.setMatricula("LMN789");
        miRegistroVehicular3.setPropietario("María López");
        miRegistroVehicular3.setFechaRegistro("2025-10-12");
        miRegistroVehicular3.setFechaVencimiento("2026-10-12");

        RegistroVehicular miRegistroVehicular4 = new RegistroVehicular();
        miRegistroVehicular4.setMatricula("DEF012");
        miRegistroVehicular4.setPropietario("Carlos García");
        miRegistroVehicular4.setFechaRegistro("2025-10-12");
        miRegistroVehicular4.setFechaVencimiento("2026-10-12");

        System.out.println("Registro vehicular: 1");
        System.out.println("Matrícula: " + miRegistroVehicular.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular.getPropietario());
        System.out.println("Fecha de Registro: " + miRegistroVehicular.getFechaRegistro());
        System.out.println("Fecha de Vencimiento: " + miRegistroVehicular.getFechaVencimiento());

        System.out.println("-------------------------------------------------");

        System.out.println("Registro vehicular: 2");
        System.out.println("Matrícula: " + miRegistroVehicular2.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular2.getPropietario());
        System.out.println("Fecha de Registro: " + miRegistroVehicular2.getFechaRegistro());
        System.out.println("Fecha de Vencimiento: " + miRegistroVehicular2.getFechaVencimiento());

        System.out.println("-------------------------------------------------");

        System.out.println("Registro vehicular: 3");
        System.out.println("Matrícula: " + miRegistroVehicular3.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular3.getPropietario());
        System.out.println("Fecha de Registro: " + miRegistroVehicular3.getFechaRegistro());
        System.out.println("Fecha de Vencimiento: " + miRegistroVehicular3.getFechaVencimiento());

        System.out.println("-------------------------------------------------");

        System.out.println("Registro vehicular: 4");
        System.out.println("Matrícula: " + miRegistroVehicular4.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular4.getPropietario());
        System.out.println("Fecha de Registro: " + miRegistroVehicular4.getFechaRegistro());
        System.out.println("Fecha de Vencimiento: " + miRegistroVehicular4.getFechaVencimiento());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        Mantenimiento miMantenimiento = new Mantenimiento();
        miMantenimiento.setHistorial("Cambio de aceite");
        miMantenimiento.setFechaUltimoMantenimiento("2025-10-12");
        miMantenimiento.setTipoMantenimiento("Preventivo");
        miMantenimiento.setEstado("Realizado");

        Mantenimiento miMantenimiento2 = new Mantenimiento();
        miMantenimiento2.setHistorial("Cambio de frenos");
        miMantenimiento2.setFechaUltimoMantenimiento("2025-10-12");
        miMantenimiento2.setTipoMantenimiento("Correctivo");
        miMantenimiento2.setEstado("Realizado");

        Mantenimiento miMantenimiento3 = new Mantenimiento();
        miMantenimiento3.setHistorial("Revisión de motor");
        miMantenimiento3.setFechaUltimoMantenimiento("2025-10-12");
        miMantenimiento3.setTipoMantenimiento("Preventivo");
        miMantenimiento3.setEstado("Realizado");

        Mantenimiento miMantenimiento4 = new Mantenimiento();
        miMantenimiento4.setHistorial("Cambio de batería");
        miMantenimiento4.setFechaUltimoMantenimiento("2025-10-12");
        miMantenimiento4.setTipoMantenimiento("Correctivo");
        miMantenimiento4.setEstado("Realizado");

        System.out.println("Mantenimiento: 1");
        System.out.println("Historial: " + miMantenimiento.getHistorial());
        System.out.println("Fecha del último mantenimiento: " + miMantenimiento.getFechaUltimoMantenimiento());
        System.out.println("Tipo de mantenimiento: " + miMantenimiento.getTipoMantenimiento());
        System.out.println("Estado: " + miMantenimiento.getEstado());

        System.out.println("---------------------------------------------------");

        System.out.println("Mantenimiento: 2");
        System.out.println("Historial: " + miMantenimiento2.getHistorial());
        System.out.println("Fecha del último mantenimiento: " + miMantenimiento2.getFechaUltimoMantenimiento());
        System.out.println("Tipo de mantenimiento: " + miMantenimiento2.getTipoMantenimiento());
        System.out.println("Estado: " + miMantenimiento2.getEstado());

        System.out.println("---------------------------------------------------");

        System.out.println("Mantenimiento: 3");
        System.out.println("Historial: " + miMantenimiento3.getHistorial());
        System.out.println("Fecha del último mantenimiento: " + miMantenimiento3.getFechaUltimoMantenimiento());
        System.out.println("Tipo de mantenimiento: " + miMantenimiento3.getTipoMantenimiento());
        System.out.println("Estado: " + miMantenimiento3.getEstado());

        System.out.println("--------------------------------------------------");

        System.out.println("Mantenimiento: 4");
        System.out.println("Historial: " + miMantenimiento4.getHistorial());
        System.out.println("Fecha del último mantenimiento: " + miMantenimiento4.getFechaUltimoMantenimiento());
        System.out.println("Tipo de mantenimiento: " + miMantenimiento4.getTipoMantenimiento());
        System.out.println("Estado: " + miMantenimiento4.getEstado());

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");


        Sensor miSensor = new Sensor();
        miSensor.setTipo("Ultrasonido");
        miSensor.setUbicacion("Delantero");
        miSensor.setEstado("Operativo");
        miSensor.setMarca("Bosch");

        Sensor miSensor2 = new Sensor();
        miSensor2.setTipo("Radar");
        miSensor2.setUbicacion("Trasero");
        miSensor2.setEstado("Operativo");
        miSensor2.setMarca("Valeo");

        Sensor miSensor3 = new Sensor();
        miSensor3.setTipo("Cámara");
        miSensor3.setUbicacion("Delantero");
        miSensor3.setEstado("Operativo");
        miSensor3.setMarca("Sony");

        Sensor miSensor4 = new Sensor();
        miSensor4.setTipo("Lidar");
        miSensor4.setUbicacion("Delantero");
        miSensor4.setEstado("Operativo");
        miSensor4.setMarca("Velodyne");

        System.out.println("Tipo de sensor: 1");
        System.out.println("Tipo de sensor: " + miSensor.getTipo());
        System.out.println("Ubicación: " + miSensor.getUbicacion());
        System.out.println("Estado: " + miSensor.getEstado());
        System.out.println("Marca: " + miSensor.getMarca());
        

        System.out.println("--------------------------------------------------");
        
        System.out.println("Tipo de sensor: 2");
        System.out.println("Tipo de sensor: " + miSensor2.getTipo());
        System.out.println("Ubicación: " + miSensor2.getUbicacion());
        System.out.println("Estado: " + miSensor2.getEstado());
        System.out.println("Marca: " + miSensor2.getMarca());

        System.out.println("--------------------------------------------------");
        
        System.out.println("Tipo de sensor: 3");
        System.out.println("Tipo de sensor: " + miSensor3.getTipo());
        System.out.println("Ubicación: " + miSensor3.getUbicacion());
        System.out.println("Estado: " + miSensor3.getEstado());
        System.out.println("Marca: " + miSensor3.getMarca());

        System.out.println("--------------------------------------------------");

        System.out.println("Tipo de sensor: 4");
        System.out.println("Tipo de sensor: " + miSensor4.getTipo());
        System.out.println("Ubicación: " + miSensor4.getUbicacion());
        System.out.println("Estado: " + miSensor4.getEstado());
        System.out.println("Marca: " + miSensor4.getMarca());
    }

}
