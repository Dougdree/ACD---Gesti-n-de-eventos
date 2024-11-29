// Clase Agenda: organiza los eventos
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Evento> eventos;

    // Constructor de Agenda
    public Agenda() {
        this.eventos = new ArrayList<>();
    }

    // Método para agregar un evento a la agenda
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Método para visualizar todos los eventos de la agenda
    public void visualizarAgenda() {
        for (Evento evento : eventos) {
            System.out.println("Evento: " + evento.getNombre() + " - Fecha: " + evento.getFecha());
        }
    }

    // Getters y Setters
    public List<Evento> getEventos() {
        return eventos;
    }
}
