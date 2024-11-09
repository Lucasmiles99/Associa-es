package Dependencia;

import Associacao.Carro;

public class Oficina {
    public void realizarManutencao(Carro carro) {
        System.out.println("Realizando manutenção no carro: " + carro.getModelo() + ", ano: " + carro.getAno());
    }
}