// Clase Registro: almacena información sobre los registros de eventos
public class Registro {
    private String identificador;
    private String fechaRegistro;
    private boolean estado;

    // Constructor de Registro
    public Registro(String identificador, String fechaRegistro, boolean estado) {
        this.identificador = identificador;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    // metodo de registrar participantes
    public void registrarParticipante(){
        System.out.println("Participante registrado");
    }
}
