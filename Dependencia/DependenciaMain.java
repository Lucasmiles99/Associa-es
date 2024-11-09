package Dependencia;

import Associacao.Carro;
import Associacao.Motor;
import Associacao.Pessoa;

public class DependenciaMain {
    public static void main(String[] args) {
        Pessoa dono = new Pessoa("Maria Oliveira", "Rua B, 456");
        Motor motor = new Motor("Volkswagen", 2.0f, 4, "Diesel");
        Carro carro = new Carro("Volkswagen", "Golf", "Azul", 2018, dono, motor);

        Oficina oficina = new Oficina();
        oficina.realizarManutencao(carro);  
    }
}