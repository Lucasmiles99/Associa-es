package Componentes;

public class HD {
    private String marca;
    private String modelo;
    private float capacidade;
    private float rpm;

    public HD(String marca, String modelo, float capacidade, float rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "HD [marca = " + marca + ", modelo = " + modelo + ", capacidade = " + capacidade + ", rpm = " + rpm + "]";
    }
}