package models;
public class Vehiculo {
    private String make;
    private String model;
    private int identification;
    private String color;

    public Vehiculo(){}
    
    public Vehiculo(String make, String model, int identification, String color) {
        this.make = make;
        this.model = model;
        this.identification = identification;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Identification: " + identification);
        System.out.println("Color: " + color);
    }
}