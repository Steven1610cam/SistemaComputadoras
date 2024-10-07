package modelo;

public class SistemaOperativo {
    private String nombre;
    private String version;
    private String desarrollador;

    public SistemaOperativo() {
    }

    public SistemaOperativo(String nombre, String version, String desarrollador) {
        this.nombre = nombre;
        this.version = version;
        this.desarrollador = desarrollador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "Sistema Operativo [Nombre: " + nombre + ", Versión: " + version + ", Desarrollador: " + desarrollador + "]";
    }
}
