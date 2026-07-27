/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public class GerenteTienda extends ManejadorCambio {
    @Override
    public void procesarSolicitud(Producto producto) {
        System.out.println("Aprobación final del gerente concedida para producto de alto valor.");
        System.out.println("Cambio aprobado y procesado exitosamente.");
    }
}