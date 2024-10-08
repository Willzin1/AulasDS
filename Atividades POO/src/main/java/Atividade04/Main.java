package Atividade04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para escolher o tipo de ingresso
        System.out.println("Digite 1 para ingresso normal e 2 para VIP:");
        int tipoIngresso = scanner.nextInt();
        
        Ingresso ingresso;
        
        if (tipoIngresso == 1) {
            ingresso = new Ingresso(tipoIngresso, null);
        } else if (tipoIngresso == 2) {
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoCamarote = scanner.nextInt();
            ingresso = new Ingresso(tipoIngresso, tipoCamarote);
        } else {
            ingresso = new Ingresso(tipoIngresso, null);
        }
        
        // Exibe a descrição e o valor do ingresso
        System.out.println("Tipo do ingresso: " + ingresso.getTipoIngresso());
        System.out.println("Valor do ingresso: R$ " + ingresso.getValor());
    }
}
