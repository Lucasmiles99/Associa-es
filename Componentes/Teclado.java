package Componentes;

public class Teclado {
    private String marca;
    private String tipo;

    public Teclado(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Teclado [marca = " + marca + ", tipo = " + tipo + "]";
    }
}