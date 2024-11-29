// Clase abstracta Persona: base para Organizadores y Participantes
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;

    // Constructor de Persona
    public Persona(String nombre, String apellido, String cedula, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void trabajar();
}
