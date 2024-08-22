package main.java.paquetes;

import java.util.Date;

public class Trazabilidad {
    private int id;
    private Date fecha;
    private String ubicacion;
    private String estado;

    public Trazabilidad(int id, Date fecha, String ubicacion, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() { return id; }
    public Date getFecha() { return fecha; }
    public String getUbicacion() { return ubicacion; }
    public String getEstado() { return estado; }
}
