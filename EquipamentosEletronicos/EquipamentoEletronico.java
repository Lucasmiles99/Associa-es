package EquipamentosEletronicos;

public class EquipamentoEletronico {
    protected float tensao;
    protected float consumo;

    public EquipamentoEletronico(float tensao, float consumo) {
        this.tensao = tensao;
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "EquipamentoEletronico [tensao = " + tensao + ", consumo = " + consumo + "]";
    }
}