package Computador;

import EquipamentosEletronicos.EquipamentoEletronico;
import Componentes.*;

public class PC extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private Gabinete gabinete;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public PC(String marca, String modelo, Gabinete gabinete, Monitor monitor, Mouse mouse, Teclado teclado, 
                      float tensao, float consumo) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computador [marca = " + marca + ", modelo = " + modelo + ", gabinete = " + gabinete + 
               ", monitor = " + monitor + ", mouse = " + mouse + ", teclado = " + teclado + ", " + super.toString() + "]";
    }
}