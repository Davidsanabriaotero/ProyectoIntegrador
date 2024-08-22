package main.java.paquetes;

import java.util.Date;

public class Envio {
    private int id;
    private Date fechaEnvio;
    private Date fechaEntrega;
    private float costo;
    private String direccionDestino;
    private Cliente remitente;
    private Cliente destinatario;
    private Paquete paquete;

    public Envio(int id, Date fechaEnvio, Date fechaEntrega, float costo, String direccionDestino, Cliente remitente, Cliente destinatario, Paquete paquete) {
        this.id = id;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        this.direccionDestino = direccionDestino;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.paquete = paquete;
    }

    public void registrarEnvio() {
        System.out.println("Envío registrado: " + this);
    }

    @Override
    public String toString() {
        return "Envio{id=" + id + ", fechaEnvio=" + fechaEnvio + ", direccionDestino='" + direccionDestino +
                "', costoEnvio=" + costo + ", remitente=" + remitente.getNombre() +
                ", destinatario=" + destinatario.getNombre() + ", paquete=" + paquete + "}";
    }


    public void actualizarEstado(String nuevoEstado) {
        paquete.setEstado(nuevoEstado);
    }

    // Getters y Setters
    public int getId() { return id; }
    public Date getFechaEnvio() { return fechaEnvio; }
    public Date getFechaEntrega() { return fechaEntrega; }
    public float getCosto() { return costo; }
    public Cliente getRemitente() { return remitente; }
    public Cliente getDestinatario() { return destinatario; }
    public Paquete getPaquete() { return paquete; }
}
