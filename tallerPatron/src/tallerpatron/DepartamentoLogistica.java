/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpatron;

public class DepartamentoLogistica {
    private EstrategiaDistribucion estrategia;

    public void setEstrategia(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarDistribucion(String articulo, String destino) {
        if (estrategia != null) {
            estrategia.distribuir(articulo, destino);
        } else {
            System.out.println("No se ha definido una estrategia de distribución.");
        }
    }
}