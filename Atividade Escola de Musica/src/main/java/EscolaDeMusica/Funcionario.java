/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaDeMusica;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa implements Identificavel {
    
    private String cracha;
    
    public Funcionario(String nome, int idade, String cracha){
        super(nome, idade);
        this.cracha = cracha;
    }
    
    public String getCracha(){
        return cracha;
    }
    
    @Override
    public String atividade(){
        return "O funcionário irá realizar atividades administrativas.";
    }
    
    @Override
    public String getId(){
        return cracha;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Identificador: " + getId();
    }
}
