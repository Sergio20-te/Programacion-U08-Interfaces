/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A03;

/**
 *
 * @author ariad
 */
public class Main {
    public static void main(String[] args) {

        Notificable[] canales = {
            new NotificacionEmail(),
            new NotificacionSMS(),
            new NotificacionPush()
        };

        for (Notificable canal : canales) {
            canal.enviarNotificacion("Mantenimiento urgente del servidor");
        }
    }
}
