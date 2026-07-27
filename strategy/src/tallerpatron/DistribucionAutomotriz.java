/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpatron;

public class DistribucionAutomotriz implements EstrategiaDistribucion {
    @Override
    public void distribuir(String articulo, String destino) {
        System.out.println("Distribuyendo " + articulo + " a " + destino + " por vía automotriz.");
    }
}
