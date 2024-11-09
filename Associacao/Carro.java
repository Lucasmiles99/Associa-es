package Associacao;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    private Pessoa dono;   
    private Motor motor;   

    public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.dono = dono;
        this.motor = motor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante = '" + fabricante + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", cor = '" + cor + '\'' +
                ", ano = " + ano +
                ", dono = " + dono +
                ", motor = " + motor +
                '}';
    }
}