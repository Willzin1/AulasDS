/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Vetor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        int[] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Insira um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }
        
        int menor = numeros[0];
        int maior = numeros[0];
        
        for (int numero : numeros){
            soma += numero;
            
            if (numero < menor){
                menor = numero;
            }
            if (numero > maior){
                maior = numero;
            }
        }
        
         System.out.println("\nNúmeros inseridos: ");
         for (int numero : numeros){
             System.out.println("Número: " + numero);
         }
         
         System.out.println("\nMenor número: " + menor);
         System.out.println("\nMaior número: " + maior);
         System.out.println("\nA soma de todos os números: " + soma);
    }
}
