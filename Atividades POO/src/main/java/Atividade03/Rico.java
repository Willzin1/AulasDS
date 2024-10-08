/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Admin
 */
public class Rico extends Pessoa{
    String carro;
    String empresa; 
    
    public Rico(String nome, String carro, String empresa){
        super(nome);
        this.carro = carro;
        this.empresa = empresa;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("\n" + nome + " é dono da " + empresa);
    }
    
    @Override 
    public void andar(){
        System.out.println(nome + " está dirigindo sua " + carro);
    }
}
