package models;

public class Sensor {
    private String tipo;
    private String ubicacion;
    private String estado;
    private String marca;

    public Sensor() {
    }

    

    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getUbicacion() {
        return ubicacion;
    }



    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public Sensor(String tipo, String ubicacion, String estado, String marca) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.marca = marca;
    }

    public void displayInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + estado);
        System.out.println("Marca: " + marca);
    }
    
}
