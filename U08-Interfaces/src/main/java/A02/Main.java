/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A02;

/**
 *
 * @author ariad
 */
public class Main {
    public static void main(String[] args) {
        MetodoPago p1 = new PagoBizum();
        MetodoPago p2 = new PagoTarjeta();

        p1.procesarPago(100);
        p1.generarFactura(100);

        p2.procesarPago(200);
        p2.generarFactura(200);
    }
}
