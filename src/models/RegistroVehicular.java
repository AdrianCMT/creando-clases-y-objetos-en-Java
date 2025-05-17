package models;

public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String fechaRegistro;
    private String fechaVencimiento;

    public RegistroVehicular() {
    }

    public RegistroVehicular(String matricula, String propietario, String fechaRegistro, String fechaVencimiento) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void displayInfo() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
    }
}
