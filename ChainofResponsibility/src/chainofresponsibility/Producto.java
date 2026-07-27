/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public class Producto {
    public String nombre;
    public double precio;
    public boolean enGarantia;
    public boolean falloCubierto;
    public boolean enBodega;

    public Producto(String nombre, double precio, boolean enGarantia, boolean falloCubierto, boolean enBodega) {
        this.nombre = nombre;
        this.precio = precio;
        this.enGarantia = enGarantia;
        this.falloCubierto = falloCubierto;
        this.enBodega = enBodega;
    }
}
