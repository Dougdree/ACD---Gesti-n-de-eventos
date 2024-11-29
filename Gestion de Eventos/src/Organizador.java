// Clase Organizador: hereda de Persona y organiza eventos
public class Organizador extends Persona {

    // Constructor de Organizador
    public Organizador(String nombre, String apellido, String cedula, String email) {
        super(nombre, apellido, cedula, email);
    }

    // Métodos específicos de Organizador
    public void gestionarEvento() {
        System.out.println("Gestionando el evento...");
    }

    public void crearEvento() {
        System.out.println("Creando un nuevo evento...");
    }

    public void cancelarEvento() {
        System.out.println("Cancelando el evento...");
    }

    public void modificarEvento() {
        System.out.println("Modificando el evento...");
    }

    @Override
    public void trabajar() {
        System.out.println("El organizador está trabajando en el evento.");
    }
}
