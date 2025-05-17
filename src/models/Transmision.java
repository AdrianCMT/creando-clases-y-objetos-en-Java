package models;

public class Transmision {
    private String tipo;
    private int marchas;
    private String traccion;
    private String estado;

    public Transmision() {
    }

    public Transmision(String tipo, int marchas, String traccion, String estado) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
        System.out.println("Estado: " + estado);
    }
    
}
