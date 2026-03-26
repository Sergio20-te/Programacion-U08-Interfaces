/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A01;

/**
 *
 * @author ariad
 */
public class Main {
    public static void main(String[] args) {
        Bombilla b = new Bombilla();
        Televisor t = new Televisor();

        b.encender();
        b.conectar();
        b.mostrarInfoGeneral();

        t.encender();
        t.conectar();
        t.mostrarInfoGeneral();
    }
}