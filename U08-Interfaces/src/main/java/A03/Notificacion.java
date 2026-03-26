/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A03;

/**
 *
 * @author ariad
 */
class NotificacionEmail implements Notificable {
    public void enviarNotificacion(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}

class NotificacionSMS implements Notificable {
    public void enviarNotificacion(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}

class NotificacionPush implements Notificable {
    public void enviarNotificacion(String mensaje) {
        System.out.println("Push enviado: " + mensaje);
    }
}
