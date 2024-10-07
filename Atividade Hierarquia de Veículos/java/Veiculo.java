/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    
    // Conector 
    public Veiculo (String marcaVei, String modeloVei, int anoVei) {
        this.marca = marcaVei;
        this.modelo = modeloVei;
        this.ano = anoVei;
    }
    
    public void acelerar(){
        System.out.println("Veiculo acelerando...");
    }
    
    public void frear(){
        System.out.println("Veiculo freando...");
    }
}
