package models;

public class SistemaFrenos {
    private String tipo;
    private String discos;
    private String abs;
    private String estado;
    private String mantenimiento;

    public SistemaFrenos() {
    }

    public SistemaFrenos(String tipo, String discos, String abs, String estado, String mantenimiento) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
        this.mantenimiento = mantenimiento;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Discos: " + discos);
        System.out.println("ABS: " + abs);
        System.out.println("Estado: " + estado);
        System.out.println("Mantenimiento: " + mantenimiento);
    }
}
