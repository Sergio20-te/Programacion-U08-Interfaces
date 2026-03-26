/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A01;

/**
 *
 * @author ariad
 */
class Televisor implements DispositivoConectado {

    public void encender() {
        System.out.println("Televisor encendido");
    }

    public void apagar() {
        System.out.println("Televisor apagado");
    }

    @Override
    public void conectar() {
        System.out.println("Televisor conectado a " + TIPO_RED + " buscando actualizaciones de firmware");
    }
}
