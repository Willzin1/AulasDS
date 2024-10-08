/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade02;

/**
 *
 * @author Admin
 */
public class Cachorro extends Animal {
    
    public Cachorro(String especie, int idade) {
        super(especie, idade);
    }
    
    public void latir(){
        System.out.println(this.especie + " está latindo");
    }
}