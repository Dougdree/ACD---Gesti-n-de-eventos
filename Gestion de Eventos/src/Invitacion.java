// Clase Invitacion: representa una invitación para un evento
public class Invitacion {
    private String destinatario;
    private String fecha;

    // Constructor de Invitacion
    public Invitacion(String destinatario, String fecha) {
        this.destinatario = destinatario;
        this.fecha = fecha;
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
}
