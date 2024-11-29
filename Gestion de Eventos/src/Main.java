// Clase Main: punto de entrada del sistema
public class Main {
    public static void main(String[] args) {
        // Mensaje de bienvenida
        System.out.println("Bienvenido al sistema de gestión de eventos");

        // Crear una sala con capacidad y tamaño
        // La clase Sala se usa para definir las características del lugar del evento
        Sala sala = new Sala(100, 75.5f);
        System.out.println("Sala creada con capacidad de " + sala.getCapacidadPersonas() + " personas y tamaño de " + sala.getTamaño() + " m2");

        // Crear un material audiovisual con nombre y cantidad
        // La clase MaterialAudiovisual gestiona los equipos necesarios para los eventos
        MaterialAudiovisual material = new MaterialAudiovisual("Proyector", 2);
        material.agregarMaterial(1); // Agregar un material adicional
        System.out.println("Material creado: " + material.getNombre() + " con cantidad " + material.getCantidad());

        // Crear un registro para un evento
        // La clase Registro almacena información sobre los participantes
        Registro registro = new Registro("EVT001", "2024-11-29", true);
        registro.registrarParticipante(); // Registrar un participante
        System.out.println("Registro creado con ID: " + registro.getIdentificador() + " y fecha: " + registro.getFechaRegistro());

        // Crear una invitación con un destinatario, fecha y estado inicial
        Invitacion invitacion = new Invitacion("Juan Pérez", "2024-12-01", Estado.PENDIENTE);

        // Mostrar el estado inicial de la invitación
        invitacion.mostrarEstado();

        // Aceptar la invitación
        invitacion.aceptarInvitacion();

        // Mostrar el estado actualizado de la invitación
        invitacion.mostrarEstado();

        // Crear una agenda para gestionar eventos
        // La clase Agenda permite almacenar y visualizar eventos
        Agenda agenda = new Agenda();

        // Crear un evento con sus atributos
        // La clase Evento define los datos principales del evento
        Evento evento = new Evento("Conferencia de Tecnología", "2024-12-05", "Centro de Convenciones", 4.0f, "Un evento sobre las últimas tecnologías");
        agenda.agregarEvento(evento); // Agregar el evento a la agenda
        System.out.println("Evento creado: " + evento.getNombre() + " el " + evento.getFecha() + " en " + evento.getLugar());

        // Visualizar los eventos de la agenda
        agenda.visualizarAgenda();

        // Mensaje de despedida
        System.out.println("El sistema ha finalizado correctamente. Gracias por usarlo.");
    }
}

