package Componentes;

public class Monitor {
    private String marca;
    private String modelo;
    private String resolucao;

    public Monitor(String marca, String modelo, String resolucao) {
        this.marca = marca;
        this.modelo = modelo;
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Monitor [marca = " + marca + ", modelo = " + modelo + ", resolucao = " + resolucao + "]";
    }
}