/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        Pobre p1 = new Pobre("William", 1000);
        Rico r1 = new Rico("João", "Ferrari", "Coca-cola");
        Miseravel m1 = new Miseravel("Pedro");
        
        // Pobre
        p1.exibirInfo();
        p1.andar();
        
        // Rico
        r1.exibirInfo();
        r1.andar();
        
        // Miserável
        m1.exibirInfo();
        m1.andar();
    }
}