package models;

public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String fechaRegistro;
    private String fechaVencimiento;

    public RegistroVehicular() {
    }

    

    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public String getPropietario() {
        return propietario;
    }



    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }



    public String getFechaRegistro() {
        return fechaRegistro;
    }



    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }



    public String getFechaVencimiento() {
        return fechaVencimiento;
    }



    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
