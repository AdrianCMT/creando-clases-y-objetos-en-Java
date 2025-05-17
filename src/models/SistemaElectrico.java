package models;

public class SistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;
    private String sistemaDeNavegacion;

    public SistemaElectrico() {
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
