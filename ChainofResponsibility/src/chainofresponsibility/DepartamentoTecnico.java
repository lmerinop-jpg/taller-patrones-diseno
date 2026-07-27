/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public class DepartamentoTecnico extends ManejadorCambio {
    @Override
    public void procesarSolicitud(Producto producto) {
        if (producto.falloCubierto) {
            System.out.println("Fallo cubierto por garantía. Pasando a inventario.");
            if (siguiente != null) siguiente.procesarSolicitud(producto);
        } else {
            System.out.println("Rechazado: El tipo de fallo no está cubierto.");
        }
    }
}