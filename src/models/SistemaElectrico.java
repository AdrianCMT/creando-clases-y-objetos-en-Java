package models;

public class SistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;
    private String sistemaDeNavegacion;

    public SistemaElectrico() {
    }

    

    public String getBateria() {
        return bateria;
    }



    public void setBateria(String bateria) {
        this.bateria = bateria;
    }



    public String getLuces() {
        return luces;
    }



    public void setLuces(String luces) {
        this.luces = luces;
    }



    public String getSensores() {
        return sensores;
    }



    public void setSensores(String sensores) {
        this.sensores = sensores;
    }



    public String getSistemaDeNavegacion() {
        return sistemaDeNavegacion;
    }



    public void setSistemaDeNavegacion(String sistemaDeNavegacion) {
        this.sistemaDeNavegacion = sistemaDeNavegacion;
    }



    public SistemaElectrico(String bateria, String luces, String sensores, String sistemaDeNavegacion) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
        this.sistemaDeNavegacion = sistemaDeNavegacion;
    }
    
    public void displayInfo() {
        System.out.println("Batería: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
        System.out.println("Sistema de Navegación: " + sistemaDeNavegacion);
    }
}
