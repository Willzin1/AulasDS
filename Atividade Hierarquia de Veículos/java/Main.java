/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Corsa", "Chevrolet", 2010);
        Carro v2 = new Carro("Golf", "Volkswagen", 2015, "Gasolina");
        CarroEletrico v3 = new CarroEletrico("BYD", "Dolphin", 2020, "Elétrico", 100);
        Moto m1 = new Moto("Honda", "Biz", 2018, "Alcool");
        
        // Classe Veículo
        v1.acelerar();
        v1.frear();
        
        // Classe Carro
        v2.acelerar();
        
        // Classe Carro Elétrico
        v3.acelerar();
        v3.carregarBateria();
        System.out.println(v3.capacidadeBateria + " kWh");
        
        // Classe Moto
        m1.acelerar();
        m1.empinarMoto();
    }
}
