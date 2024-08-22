package main.java.paquetes;
import java.util.Date;

public class Factura {
    private int id;
    private float montoTotal;
    private Date fechaEmision;

    public Factura(int id, float montoTotal, Date fechaEmision) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.fechaEmision = fechaEmision;
    }

    public void generarFactura() {
        System.out.println("Factura generada: " + this);
    }

    @Override
    public String toString() {
        return "Factura{id=" + id + ", montoTotal=" + montoTotal + ", fechaEmision=" + fechaEmision + "}";
    }

    // Getters y Setters
    public int getId() { return id; }
    public float getMontoTotal() { return montoTotal; }
    public Date getFechaEmision() { return fechaEmision; }
}
