/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class CarroEletrico extends Carro{
    
    public int capacidadeBateria; // Digitar somente números
    
    public CarroEletrico(String marcaVei, String modeloVei, int anoVei, String tipoCombustivel, int capacidadeBateria) {
        super(marcaVei, modeloVei, anoVei, tipoCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Carro elétrico acelerando...");
    }
    
    public void carregarBateria(){
        System.out.println("Carregando bateria, por favor aguarde...");
    }
}
