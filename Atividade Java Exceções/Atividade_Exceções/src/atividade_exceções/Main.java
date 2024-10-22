/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_exceções;

import atividade_exceções.GêneroException;
import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    try {
        System.out.print("Qual seu nome?: ");
        String nome = scanner.next();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        verificaIdade(idade);
        
        System.out.print("Qual seu gênero?(M ou F): ");
        String gen = scanner.next();
        verificaGênero(gen, nome);
        
    } catch (MaioridadeException | GêneroException e) {
        System.out.println("Erro: " + e.getMessage());
    } catch(Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
    } finally {
        scanner.close();
    }
}
    
    public static void verificaIdade(int idade) throws MaioridadeException{
        if (idade < 18){
            throw new MaioridadeException ("Esse estabelecimento é somente para maiores de 18 anos.");
        }
    }


    public static void verificaGênero(String gen, String nome) throws GêneroException{
        switch (gen.toUpperCase()){
            case "M": 
                System.out.println("Olá, " + nome + ". Seja bem-vindo ao nosso bar!");
                break;
            case "F": 
                System.out.println("Olá" + nome + ". Seja bem-vinda ao nosso bar!");
                break;
            default:
                throw new GêneroException("Gênero inexistente: " + gen);
        } 
    }
}    
