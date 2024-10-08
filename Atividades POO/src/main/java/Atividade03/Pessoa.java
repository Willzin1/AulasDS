/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Admin
 */
public class Pessoa {
    String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public void exibirInfo(){
        System.out.println("Meu nome é " + nome);
        
    }
    
    public void andar(){
        System.out.println(nome + " está caminhando...");
    }
    
}
