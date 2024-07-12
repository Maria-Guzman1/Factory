public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Prueba de mensaje... " + mensaje);
    }
}