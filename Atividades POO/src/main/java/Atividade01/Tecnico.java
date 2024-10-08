/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade01;

/**
 *
 * @author Admin
 */
public class Tecnico extends Pessoa{
    String cargo;
    int numMat;
    
    public Tecnico(String nome, String cargo, int numMat){
        super(nome);
        this.cargo = cargo;
        this.numMat = numMat;
    }
    
    public void imprimirTec(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nº Matricula: " + this.numMat);
    }
}