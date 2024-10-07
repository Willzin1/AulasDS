/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class Carro extends Veiculo{
    
    public String tipoCombustivel;

    public Carro(String marcaVei, String modeloVei, int anoVei, String tipoCombustivel) {
        super(marcaVei, modeloVei, anoVei);
        this.tipoCombustivel = tipoCombustivel;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Carro com " + tipoCombustivel + " acelerando...");
    }
    
}
