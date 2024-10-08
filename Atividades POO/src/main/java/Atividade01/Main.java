/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade01;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Assistente a1 = new Assistente("William", "Assistente Administrativo", 1);
        Tecnico t1 = new Tecnico("Heitor", "Técnico", 3);
        
        // Técnico
        t1.imprimirTec();
        
        // Assistente 
        a1.imprimirAssis();
    }
    
}
