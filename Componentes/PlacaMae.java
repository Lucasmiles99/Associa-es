package Componentes;

public class PlacaMae {
    private String marca;
    private String modelo;
    private String chipset;
    private Processador processador;
    private Memoria memoria;
    private HD hd;

    public PlacaMae(String marca, String modelo, String chipset, Processador processador, Memoria memoria, HD hd) {
        this.marca = marca;
        this.modelo = modelo;
        this.chipset = chipset;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "PlacaMae [marca = " + marca + ", modelo = " + modelo + ", chipset = " + chipset + 
               ", processador = " + processador + ", memoria = " + memoria + ", hd = " + hd + "]";
    }
}