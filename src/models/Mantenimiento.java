package models;

public class Mantenimiento {
    private String historial;
    private String fechaUltimoMantenimiento;
    private String tipoMantenimiento;

    public Mantenimiento() {
    }

    public Mantenimiento(String historial, String fechaUltimoMantenimiento, String tipoMantenimiento) {
        this.historial = historial;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public void displayInfo() {
        System.out.println("Historial: " + historial);
        System.out.println("Fecha del último mantenimiento: " + fechaUltimoMantenimiento);
        System.out.println("Tipo de mantenimiento: " + tipoMantenimiento);
    }
}
