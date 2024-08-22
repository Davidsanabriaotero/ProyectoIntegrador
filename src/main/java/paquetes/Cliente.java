package main.java.paquetes;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String identificacion;
    private String telefono;

    public Cliente(int id, String nombre, String direccion, String identificacion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "', direccion='" + direccion +
                "', identificacion='" + identificacion + "', telefono='" + telefono + "'}";
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getIdentificacion() { return identificacion; }
    public String getTelefono() { return telefono; }
}
