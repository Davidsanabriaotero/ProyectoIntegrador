package main.java.paquetes;

public class Paquete {
    private int id;
    private float peso;
    private String alto;
    private String ancho;
    private String largo;
    private String tipo; // Básico, Estándar, Dimensionado
    private float costo;
    private String estado;

    public Paquete(int id, float peso, String alto, String ancho, String largo, String tipo, float costo, String estado) {
        this.id = id;
        this.peso = peso;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.tipo = tipo;
        this.costo = costo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{id=" + id + ", peso=" + peso + ", dimensiones=" + largo + "x" + ancho + "x" + alto +
                ", tipo='" + tipo + "', costo=" + costo + ", estado='" + estado + "'}";
    }

    // Getters y Setters
    public int getId() { return id; }
    public float getPeso() { return peso; }
    public String getAlto() { return alto; }
    public String getAncho() { return ancho; }
    public String getLargo() { return largo; }
    public String getTipo() { return tipo; }
    public float getCosto() { return costo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
