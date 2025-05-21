package models;

public class Motor {
    private String tipo;
    private int cilindrada;
    private int potencia;
    private String estado;



    public Motor() {
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
