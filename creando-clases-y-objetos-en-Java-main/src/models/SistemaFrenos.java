package models;

public class SistemaFrenos {
    private String tipo;
    private String discos;
    private String abs;
    private String estado;
    private String mantenimiento;

    public SistemaFrenos() {
    }

    

    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getDiscos() {
        return discos;
    }



    public void setDiscos(String discos) {
        this.discos = discos;
    }



    public String getAbs() {
        return abs;
    }



    public void setAbs(String abs) {
        this.abs = abs;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public String getMantenimiento() {
        return mantenimiento;
    }



    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
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
