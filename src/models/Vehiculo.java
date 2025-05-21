package models;
public class Vehiculo {
    private String make;
    private String model;
    private int identification;
    private String color;

    public Vehiculo(){}
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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