package Banco;

public class ContaBancaria {
    protected Banco banco;           
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Pessoa correntista;     

    public ContaBancaria(Banco banco, int agencia, int numeroConta, Pessoa correntista) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaBancaria [banco = " + banco + ", agencia = " + agencia + ", numeroConta = " + numeroConta + 
               ", saldo = " + saldo + ", correntista = " + correntista + "]";
    }
}