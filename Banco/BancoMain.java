package Banco;

public class BancoMain {
    public static void main(String[] args) {
        Banco banco = new Banco(1, "Banco do Brasil", 50);
        Pessoa pessoa = new Pessoa("Lucas Miles", "Praça da ce, 123");

        ContaSimples contaSimples = new ContaSimples(banco, 1234, 567890, pessoa);
        contaSimples.depositar(500.0);
        contaSimples.depositarPoupanca(200.0);
        System.out.println(contaSimples);

        CartaoDeCredito cartao = new CartaoDeCredito(12345678, "Visa", 2000.0, "Gold");
        ContaEspecial contaEspecial = new ContaEspecial(banco, 1234, 987654, pessoa, 1000.0, cartao);
        contaEspecial.depositar(1000.0);
        System.out.println(contaEspecial);
    }
}