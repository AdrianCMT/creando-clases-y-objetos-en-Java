package models;

public class Neumatico {
    private String marca;
    private String tamaño;
    private String presion;
    private String estado;

    public Neumatico() {
    }

    

    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getTamaño() {
        return tamaño;
    }



    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }



    public String getPresion() {
        return presion;
    }



    public void setPresion(String presion) {
        this.presion = presion;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
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
