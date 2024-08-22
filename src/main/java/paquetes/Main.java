package main.java.paquetes;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente remitente = new Cliente(1, "Juan Perez", "Calle 123", "123456789", "555-1234");
        Cliente destinatario = new Cliente(2, "Maria Lopez", "Avenida 456", "987654321", "555-5678");

        // Crear paquete
        Paquete paquete = new Paquete(1, 2.5f, "30", "30", "20", "Basico",20000,"Recibido");

        // Registrar envío
        Envio envio = new Envio(1, new Date(), null, 50.0f, "Avenida 456", remitente, destinatario, paquete);
        envio.registrarEnvio();

        // Generar factura
        Factura factura = new Factura(1, 50.0f, new Date());
        factura.generarFactura();
    }
}
