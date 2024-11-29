// Clase MaterialAudiovisual: representa los materiales necesarios para un evento
public class MaterialAudiovisual {
    private String nombre;
    private int cantidad;

    // Constructor de MaterialAudiovisual
    public MaterialAudiovisual(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para agregar material adicional
    public void agregarMaterial(int cantidadAdicional) {
        this.cantidad += cantidadAdicional;
    }
}
