package Associacao;

public class AssociacaoMain {
    public static void main(String[] args) {
        Pessoa dono = new Pessoa("Lucas Miles", "Praca da ce, 123");

        Motor motor = new Motor("Fiat", 1.6f, 4, "Gasolina");

        Carro carro = new Carro("Fiat", "Palio", "Prata", 2020, dono, motor);

        System.out.println(carro);
    }
}