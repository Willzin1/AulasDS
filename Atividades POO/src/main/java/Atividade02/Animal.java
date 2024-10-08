/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade02;

/**
 *
 * @author Admin
 */
public class Animal {
    String especie; 
    int idade;
    
    public Animal (String especie, int idade){
        this.especie = especie;
        this.idade = idade;
    }
    
    public void caminhar(){
        System.out.println(this.especie + " está caminhando...");
    }
}