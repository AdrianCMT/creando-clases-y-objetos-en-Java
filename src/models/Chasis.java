package models;

public class Chasis {
    private String tipo;
    private String dimensiones;
    private String peso;

    public Chasis() {
    }

    public Chasis(String tipo, String dimensiones, String peso) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
    }
}