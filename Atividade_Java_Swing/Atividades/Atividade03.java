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
public class Atividade03 {
    public static void main(String[] args){
        // Declarando as variáveis
        double []notas = new double [3];
        
        // Usando um loop
        for (int i = 0; i < notas.length; i++){
            String notaString = JOptionPane.showInputDialog("Insira a " + (i + 1)+ "° nota: ");
            notas[i] = Double.parseDouble(notaString);
        }
        
        // Usando um loop para iterar sobre cada nota e executar a lógica
        for (int i = 0; i < notas.length; i++){
            Double nota = notas[i];
            
           if (nota >= 6){
               JOptionPane.showMessageDialog(null, (i + 1) +"° Aluno. \nNota: " + notas[i] + "\nEstado: Aprovado");
           }else{
               JOptionPane.showMessageDialog(null, (i + 1) +"° Aluno. \nNota: " + notas[i] + "\nEstado: Reprovado");
           } 
        }
    }
}
