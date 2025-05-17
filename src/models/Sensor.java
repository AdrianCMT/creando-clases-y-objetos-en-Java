package models;

public class Sensor {
    private String tipo;
    private String ubicacion;
    private String estado;
    private String marca;

    public Sensor() {
    }

    public Sensor(String tipo, String ubicacion, String estado, String marca) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.marca = marca;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + estado);
        System.out.println("Marca: " + marca);
    }
    
}
