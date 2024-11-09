package Computador;

import Componentes.*;
import EquipamentosEletronicos.EquipamentoEletronico;

public class PCMain {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "i7", 3.5f, 8);
        Memoria memoria = new Memoria("Corsair", "Vengeance", 16, 3200);
        HD hd = new HD("Seagate", "Barracuda", 1024, 7200);
        
        PlacaMae placaMae = new PlacaMae("ASUS", "ROG", "Z390", processador, memoria, hd);
        Gabinete gabinete = new Gabinete("Cooler Master", "ATX", placaMae);
        Monitor monitor = new Monitor("Samsung", "Curved", "1080p");
        Mouse mouse = new Mouse("Logitech", "Wireless");
        Teclado teclado = new Teclado("Razer", "Mechanical");

        PC computador = new PC("Dell", "Alienware", gabinete, monitor, mouse, teclado, 110, 500);
        
        System.out.println(computador);
    }
}