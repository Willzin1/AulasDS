/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaDeMusica;

/**
 *
 * @author Admin
 */
public abstract class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade;
    }
    
    public abstract String atividade();
}
