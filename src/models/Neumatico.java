package models;

public class Neumatico {
    private String marca;
    private String tamaño;
    private String presion;
    private String estado;

    public Neumatico() {
    }

    public Neumatico(String marca, String tamaño, String presion, String estado) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presión: " + presion);
        System.out.println("Estado: " + estado);
    }
    
}
