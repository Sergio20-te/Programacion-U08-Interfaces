/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A04;

/**
 *
 * @author ariad
 */
public class Main {
    public static void main(String[] args) {
        ImpresoraBasica basica = new ImpresoraBasica();
        ImpresoraAvanzada avanzada = new ImpresoraAvanzada();

        basica.imprimir();
        avanzada.imprimir();
        avanzada.escanear();

    }
}