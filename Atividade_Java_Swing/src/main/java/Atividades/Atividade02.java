/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Atividade02 {
    public static void main(String[] args){
         // Declarando as variáveis
        int n1;
        int n2;
        String num1;
        String num2;
        
        // Inicializando as variáveis
        num1 = JOptionPane.showInputDialog("Informe o 1° número: ");
        num2 = JOptionPane.showInputDialog("Informe o 2° número: ");
        
        // Convertendo os números informados (String) para o tipo Integer
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        
        // Fazendo a lógica
        if (n1 % 2 == 0 && n2 % 2 == 0){
            JOptionPane.showMessageDialog(null, "Ambos os números (" + n1 + ", " + n2 + ") são PAR.");
        }else if(n1 % 2 != 0 && n2 % 2 != 0){
            JOptionPane.showMessageDialog(null, "Ambos os números (" + n1 + ", " + n2 + ") são ÍMPAR.");
        }else if(n1 % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é PAR. \n" + "O número " + n2 + " é ÍMPAR." );
        }else{
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é ÍMPAR. \n" + "O número " + n2 + " é PAR.");
        }
    }
}
