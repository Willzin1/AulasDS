/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade02;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro("Cachorro", 15);
        Gato cat1 = new Gato("Gato", 5);
        
        // Cachorro
        System.out.println("Espécie: " + dog1.especie + "\nIdade: " + dog1.idade);
        dog1.latir();
        dog1.caminhar();
        
        // Gato
        System.out.println("\nEspécie: " + cat1.especie + " \nIdade: " + cat1.idade);
        cat1.miar();
        cat1.caminhar();
    }
}
