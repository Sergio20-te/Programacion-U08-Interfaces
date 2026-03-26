/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package A01;

/**
 *
 * @author ariad
 */
interface DispositivoConectado {
    String TIPO_RED = "Wi-Fi 7";

    void encender();
    void apagar();

    default void conectar() {
        System.out.println("Conectando a la red " + TIPO_RED);
    }

    default void mostrarInfoGeneral() {
        System.out.println("Dispositivo conectado a red moderna.");
    }
}