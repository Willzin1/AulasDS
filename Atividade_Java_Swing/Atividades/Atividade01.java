/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Atividade01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        // Declarando as variáveis
        int n1;
        int n2;
        String num2;
        String num1;
        
        // Inicializando as variáveis
        num1 = JOptionPane.showInputDialog("Informe o 1° número: ");
        num2 = JOptionPane.showInputDialog("Informe o 2° número: ");
        
        // Convertendo os números informados (String) para o tipo Integer
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        
        // Fazendo a lógica
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "O 1° número (" + n1 + ") é maior.");
        }else if(n1 < n2){
            JOptionPane.showMessageDialog(null, "O 2° número (" + n2 + ") é maior.");
        }else{
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
}
