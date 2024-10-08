/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade05;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         // Criando os imóveis
         Imovel imo1 = new Imovel("Rua Alegrete", "Sobrado com 3 dormitórios(1 suíte), cozinha, sala, banheiro", 15000000);
         Imovel imo2 = new Imovel("Rua Apucarana", "Apartamento com 4 dormitórios (2 suítes), banheiro, sala, cozinha", 25000000);
         
         // Pedindo ao usuário para digitr um número.
         System.out.println("Escolha um imóvel (1 ou 2):");
         int numDigitado = scanner.nextInt();
        
        // Usando condição if-else para definir qual imóvel será apresentado 
        if (numDigitado == 1){
            System.out.println("1° Imóvel:\n" + imo1.mostraInfo());
        } else if (numDigitado == 2) {
            System.out.println("2° Imóvel:\n" + imo2.mostraInfo());
        } else {
            // Para caso o número digitado seja diferente de 1 ou 2
            System.out.println("Número inválido, por favor escolha entre 1 e 2");
        }
    } 
}
