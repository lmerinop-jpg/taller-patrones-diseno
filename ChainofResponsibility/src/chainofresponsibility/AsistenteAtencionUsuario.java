/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public class AsistenteAtencionUsuario extends ManejadorCambio {
    @Override
    public void procesarSolicitud(Producto producto) {
        if (producto.enGarantia) {
            System.out.println("Garantía verificada. Pasando a revisión técnica.");
            if (siguiente != null) siguiente.procesarSolicitud(producto);
        } else {
            System.out.println("Rechazado: El producto no está en periodo de garantía.");
        }
    }
}