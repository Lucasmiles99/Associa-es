package Componentes;

public class Memoria {
    private String marca;
    private String modelo;
    private float capacidade;
    private float velocidade;

    public Memoria(String marca, String modelo, float capacidade, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Memoria [marca = " + marca + ", modelo = " + modelo + ", capacidade = " + capacidade + 
               ", velocidade = " + velocidade + "]";
    }
}