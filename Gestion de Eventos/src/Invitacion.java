// Clase Invitacion: representa una invitación enviada a un participante
public class Invitacion {
    private String destinatario; // Nombre o identificación del destinatario de la invitación
    private String fecha;        // Fecha en que se envió la invitación
    private Estado estado;       // Estado actual de la invitación (usando el enumerador Estado)

    // Constructor de Invitacion
    public Invitacion(String destinatario, String fecha, Estado estado) {
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Getters y Setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Método para aceptar la invitación
    public void aceptarInvitacion() {
        this.estado = Estado.ACEPTADA;
        System.out.println("La invitación ha sido aceptada.");
    }

    // Método para rechazar la invitación
    public void rechazarInvitacion() {
        this.estado = Estado.RECHAZADA;
        System.out.println("La invitación ha sido rechazada.");
    }

    // Método para mostrar el estado actual de la invitación
    public void mostrarEstado() {
        System.out.println("El estado de la invitación es: " + this.estado);
    }
}

