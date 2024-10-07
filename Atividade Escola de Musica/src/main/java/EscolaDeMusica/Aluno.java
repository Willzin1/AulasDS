/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaDeMusica;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa implements Identificavel{

    private String matricula;
            
    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }

    @Override
    public String atividade() {
        return "O aluno deverá frequentar aulas e praticar instrumentos.";
    }
    
    @Override
    public String getId(){
        return matricula;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Identificador: " + getId();
    }
}
