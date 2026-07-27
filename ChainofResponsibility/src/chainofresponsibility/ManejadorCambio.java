/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

public abstract class ManejadorCambio {
    protected ManejadorCambio siguiente;

    public void setSiguiente(ManejadorCambio siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesarSolicitud(Producto producto);
}