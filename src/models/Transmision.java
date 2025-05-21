package models;

public class Transmision {
    private String tipo;
    private int marchas;
    private String traccion;
    private String estado;

    public Transmision() {
    }

    

    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public int getMarchas() {
        return marchas;
    }



    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }



    public String getTraccion() {
        return traccion;
    }



    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
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
