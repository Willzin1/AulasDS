/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Admin
 */
public class Pobre extends Pessoa{
    
    int salario;
    
    public Pobre(String nome, int salario){
        super(nome);
        this.salario = salario;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println(nome + " é um trabalhador e seu salário é " + salario + " reais");
    }
    

    @Override 
    public void andar(){
        System.out.println(nome + " está pedalando sua bicicleta");
    }
      
}
