/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A04;

/**
 *
 * @author ariad
 */
class ImpresoraBasica implements Imprimible {
    public void imprimir() {
        System.out.println("Imprimiendo documento");
    }
}

class ImpresoraAvanzada implements Multifuncion {
    public void imprimir() {
        System.out.println("Impresión avanzada");
    }

    public void escanear() {
        System.out.println("Escaneando documento");
    }
}