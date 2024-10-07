/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class Moto extends Veiculo{
    
    public String combustivel;
    
    public Moto(String marcaVei, String modeloVei, int anoVei, String combustivel) {
        super(marcaVei, modeloVei, anoVei);
        this.combustivel = combustivel;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Moto acelerando...");
    }
    
    public void empinarMoto(){
        System.out.println("Empinando a moto!");
    }
    
}
