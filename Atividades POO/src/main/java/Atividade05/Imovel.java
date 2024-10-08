/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade05;


/**
 *
 * @author Admin
 */
public class Imovel {
    private String endereco, descricaoImo;
    private int precoImo;
    
    public Imovel(String endereco, String descricaoImo, int precoImo) {
        this.endereco = endereco;
        this.descricaoImo = descricaoImo;
        this.precoImo = precoImo;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getDescricao(){
        return descricaoImo;
    }
    
    public int getPreco(){
        return precoImo;
    }
    
    public String mostraInfo(){
        // Formatando preço para string
        String precoFormatado = String.format("%, .2f", precoImo / 100.0);
        return "Endereço: " + endereco + "\nDescrição: " + descricaoImo + "\nPreço: R$" + precoFormatado;
    }
}
