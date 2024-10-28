/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author willi
 */
public class ListaNumeros {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         ArrayList<Integer> numInteiros = new ArrayList<Integer>();
         for (int i = 0; i < 5; i++){
            System.out.print("Informe um número: ");
            Integer numero = scanner.nextInt();
            numInteiros.add(numero);
        }
         
         // Organinzando em ordem crescente
         Collections.sort(numInteiros);
         for (Integer numero : numInteiros){
             System.out.println("\nNúmero: " + numero);
             
             if (numero % 2 == 0){
                 System.out.println(numero + " é par");
             }else{
                 System.out.println(numero + " é impar");
             }
         }
     }
}
