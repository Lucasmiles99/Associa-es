package Componentes;

public class Processador {
    private String marca;
    private String modelo;
    private float clock;
    private float cache;

    public Processador(String marca, String modelo, float clock, float cache) {
        this.marca = marca;
        this.modelo = modelo;
        this.clock = clock;
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "Processador [marca = " + marca + ", modelo = " + modelo + ", clock = " + clock + ", cache = " + cache + "]";
    }
}