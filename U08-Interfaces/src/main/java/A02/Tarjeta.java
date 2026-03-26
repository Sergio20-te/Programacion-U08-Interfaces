/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A02;

/**
 *
 * @author ariad
 */
class PagoTarjeta implements MetodoPago {
    public void procesarPago(double importe) {
        System.out.println("Pago con tarjeta de " + importe + "€ realizado");
    }
}
