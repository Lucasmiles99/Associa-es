package Banco;

public class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    private CartaoDeCredito cartao;    

    public ContaEspecial(Banco banco, int agencia, int numeroConta, Pessoa correntista, double limite, CartaoDeCredito cartao) {
        super(banco, agencia, numeroConta, correntista);
        this.diasSemJuros = 30;
        this.limite = limite;
        this.cartao = cartao;  
    }

    @Override
    public String toString() {
        return "ContaEspecial [diasSemJuros = " + diasSemJuros + ", limite = " + limite + 
               ", cartao = " + cartao + ", toString() = " + super.toString() + "]";
    }
}