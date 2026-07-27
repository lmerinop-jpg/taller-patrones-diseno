/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public class JefeInventario extends ManejadorCambio {
    @Override
    public void procesarSolicitud(Producto producto) {
        if (producto.enBodega) {
            System.out.println("Producto en bodega certificado.");
            if (producto.precio > 1000.0) {
                System.out.println("El producto supera los 1000 USD. Requiere aprobación del gerente.");
                if (siguiente != null) siguiente.procesarSolicitud(producto);
            } else {
                System.out.println("Cambio aprobado y procesado exitosamente.");
            }
        } else {
            System.out.println("Rechazado: No hay existencia en bodega para reposición.");
        }
    }
}