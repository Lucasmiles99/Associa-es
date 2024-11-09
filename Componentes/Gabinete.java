package Componentes;

public class Gabinete {
    private String modelo;
    private String tipo;
    private PlacaMae placaMae;

    public Gabinete(String modelo, String tipo, PlacaMae placaMae) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        return "Gabinete [modelo = " + modelo + ", tipo = " + tipo + ", placaMae = " + placaMae + "]";
    }
}