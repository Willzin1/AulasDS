/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import EscolaDeMusica.Aluno;
import EscolaDeMusica.Funcionario;
import EscolaDeMusica.Pessoa;
import EscolaDeMusica.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main( String[] args){
        
        List<Pessoa> Pessoas = new ArrayList<>();
        
        Pessoas.add(new Aluno("Will", 23, "ALU-001"));
        Pessoas.add(new Funcionario("Heitor", 18, "FUNC-001"));
        Pessoas.add(new Professor("Warwick", 65, "PROF-001"));
        
        for (Pessoa pessoa : Pessoas){
            System.out.println(pessoa.toString());
            System.out.println("Atividade: " + pessoa.atividade() + "\n");
            
        }
    }
}
