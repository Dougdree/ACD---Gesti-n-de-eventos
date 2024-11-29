// Clase Participante: hereda de Persona y representa a un asistente o expositor
public class Participante extends Persona {
    // Constructor de Participante
    public Participante(String nombre, String apellido, String cedula, String email) {
        super(nombre, apellido, cedula, email);
    }

    // Método para asistir a un evento
    public void asistirEvento(Invitacion invitacion) {
        System.out.println(getNombre() + " asistirá al evento con invitación: " + invitacion.getDestinatario());
    }

    @Override
    public void trabajar() {
        System.out.println("El participante está asistiendo al evento.");
    }
}
