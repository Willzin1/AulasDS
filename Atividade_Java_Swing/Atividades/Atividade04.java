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
public class Atividade04 {
    public static void main(String[] args){
        int n1;
        String num1;
        
        num1 = JOptionPane.showInputDialog("Insira um número: ");
        
        n1 = Integer.parseInt(num1);
        
        if (n1 > 0) {
            JOptionPane.showMessageDialog(null, "O número informado é positivo.");
        }else if(n1 < 0){
            JOptionPane.showMessageDialog(null,"O número informado é negativo.");
        }else{
            JOptionPane.showMessageDialog(null, "O número informado é 0.");
        }
    }
}
