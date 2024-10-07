package modelo;

public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;
    private SistemaOperativo sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String procesador, SistemaOperativo sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Computadora [Marca: " + marca + ", Modelo: " + modelo + ", Procesador: " + procesador 
                + ", Sistema Operativo: " + sistemaOperativo + "]";
    }
}
