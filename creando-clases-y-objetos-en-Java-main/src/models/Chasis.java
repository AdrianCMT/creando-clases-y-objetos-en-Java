package models;

public class Chasis {
    private String tipo;
    private String dimensiones;
    private String peso;
    private String material;

    public Chasis() {
    }

    

    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getDimensiones() {
        return dimensiones;
    }



    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }



    public String getPeso() {
        return peso;
    }



    public void setPeso(String peso) {
        this.peso = peso;
    }



    public String getMaterial() {
        return material;
    }



    public void setMaterial(String material) {
        this.material = material;
    }



    public Chasis(String tipo, String dimensiones, String peso, String material) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
        System.out.println("Material: " + material);
    }
}