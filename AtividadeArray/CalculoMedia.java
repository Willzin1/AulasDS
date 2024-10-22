
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author willi
 */
public class CalculoMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int alunos = 10;
        double[] notas = new double[alunos];
        
        System.out.print("Informe as notas dos alunos: ");
        for (int i = 0; i < notas.length; i++){
            notas[i] = scanner.nextDouble();
        }
        
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        
        double media = soma / notas.length;
        System.out.println("\nA média aritimética das notas é: " + media);
        System.out.println("\nAs notas abaixo da média são: ");
        
        for (double nota : notas) {
            if(nota < media ){
                System.out.println(nota);
            }
        }
    }  
}

