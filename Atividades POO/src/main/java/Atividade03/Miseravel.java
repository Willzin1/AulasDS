/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Admin
 */
public class Miseravel extends Pessoa{
    
    public Miseravel(String nome){
        super(nome);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("\n" + nome + " é um morador de rua");
    }
    
    @Override 
    public void andar(){
        System.out.println(nome + " estava caminhando descalço e acabou tropeçando em uma pedra...");
    }
}