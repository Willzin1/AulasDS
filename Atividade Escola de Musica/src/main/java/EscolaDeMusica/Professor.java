/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaDeMusica;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa implements Identificavel{
    private String registro;
    
    public Professor(String nome, int idade, String registro){
        super(nome, idade);
        this.registro = registro;
    }
    
    @Override
    public String atividade(){
        return "O professor irá ministrar aulas de música.";
    }
    
    @Override
    public String getId(){
        return registro;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Identificador: " + getId();
    }
}
