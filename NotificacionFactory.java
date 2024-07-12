public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "Email":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Intentan robar la base de datos" + tipo);
        }
    }
}

