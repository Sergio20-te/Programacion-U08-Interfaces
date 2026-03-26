/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A02;

/**
 *
 * @author ariad
 */
interface MetodoPago {
    double IVA = 0.21;

    void procesarPago(double importe);

    default void logTransaccion(double importe) {
        System.out.println("Transacción registrada: " + importe + "€");
    }

    default void generarFactura(double importe) {
        logTransaccion(importe);
        double total = importe + (importe * IVA);
        System.out.println("Total con IVA: " + total + "€");
    }
}