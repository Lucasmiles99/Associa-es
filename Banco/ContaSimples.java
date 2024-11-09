package Banco;

public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public ContaSimples(Banco banco, int agencia, int numeroConta, Pessoa correntista) {
        super(banco, agencia, numeroConta, correntista);
        this.saldoPoupanca = 0.0;
    }

    public boolean depositarPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean sacarPoupanca(double valor) {
        if (valor > 0 && saldoPoupanca >= valor) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaSimples [saldoPoupanca = " + saldoPoupanca + ", toString() = " + super.toString() + "]";
    }
}