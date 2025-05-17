package models;

public class Motor {
    private String tipo;
    private int cilindrada;
    private int potencia;
    private String estado;



    public Motor() {
    }

    public Motor(String tipo, int cilindrada, int potencia, String estado) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Estado: " + estado);
    }
}
