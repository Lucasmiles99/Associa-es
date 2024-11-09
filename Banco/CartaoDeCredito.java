package Banco;

public class CartaoDeCredito {
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
        this.numero = numero;
        this.operadora = operadora;
        this.limite = limite;
        this.tipoDeCartao = tipoDeCartao;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito [numero = " + numero + ", operadora = " + operadora + 
               ", limite = " + limite + ", tipoDeCartao = " + tipoDeCartao + "]";
    }
}