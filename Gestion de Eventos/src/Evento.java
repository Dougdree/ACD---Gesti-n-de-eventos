// Clase Evento: representa un evento con participantes y detalles
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private float duracion;
    private String descripcion;
    private List<Participante> participantes;

    // Constructor de Evento
    public Evento(String nombre, String fecha, String lugar, float duracion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.participantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    // Método para agregar un participante al evento
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }
}
