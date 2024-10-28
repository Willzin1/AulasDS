/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class ListaFrutas {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         
        ArrayList<String>frutas = new ArrayList<String>();
         
        for (int i = 0; i < 5; i++){
            System.out.print("Informe o nome de uma fruta: ");
            String fruta = scanner.nextLine();
            frutas.add(fruta);
        }
        
        // Itera sobre as frutas informadas
        System.out.println("\nFrutas informadas: ");
        for (String fruta : frutas){
            System.out.println("Fruta: " + fruta);
        }
        
        // Remove uma fruta do ArrayList
        String frutaRemovida = frutas.remove(3);
        System.out.println("\nLista sem a fruta removida:");
        for (String fruta : frutas){
            System.out.println("Fruta: " + fruta);
        }
        System.out.println("\nFruta removida: " + frutaRemovida);
        
        // Fazer a busca de uma fruta, se existir retorna true, caso contrário retona false
        System.out.print("\nQual fruta deseja procurar? ");
        String frutaBuscada = scanner.nextLine();
        boolean encontrada = frutas.contains(frutaBuscada);
        System.out.println(encontrada);
    }
}   
