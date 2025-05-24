package models;

public class Mantenimiento {
    private String historial;
    private String fechaUltimoMantenimiento;
    private String tipoMantenimiento;
    private String estado;

    public Mantenimiento() {
    }

    

    public String getHistorial() {
        return historial;
    }



    public void setHistorial(String historial) {
        this.historial = historial;
    }



    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }



    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }



    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }



    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public Mantenimiento(String historial, String fechaUltimoMantenimiento, String tipoMantenimiento, String estado) {
        this.historial = historial;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Historial: " + historial);
        System.out.println("Fecha del último mantenimiento: " + fechaUltimoMantenimiento);
        System.out.println("Tipo de mantenimiento: " + tipoMantenimiento);
        System.out.println("Estado: " + estado);
    }
}
