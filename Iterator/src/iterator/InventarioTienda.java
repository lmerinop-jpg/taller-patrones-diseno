/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

public class InventarioTienda implements ColeccionInventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public IteradorProducto crearIteradorCompradorWeb() {
        return new IteradorCompradorWeb(productos);
    }

    @Override
    public IteradorProducto crearIteradorProveedor() {
        return new IteradorProveedor(productos);
    }
}
