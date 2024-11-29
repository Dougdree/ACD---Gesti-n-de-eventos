// Clase Sala: representa una sala donde se realizan eventos
public class Sala {
    private int capacidadPersonas;
    private float tamaño;

    // Constructor de Sala
    public Sala(int capacidadPersonas, float tamaño) {
        this.capacidadPersonas = capacidadPersonas;
        this.tamaño = tamaño;
    }

    // Getters y Setters
    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}
