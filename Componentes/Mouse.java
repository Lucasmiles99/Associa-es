package Componentes;

public class Mouse {
    private String marca;
    private String tipo;

    public Mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse [marca = " + marca + ", tipo = " + tipo + "]";
    }
}