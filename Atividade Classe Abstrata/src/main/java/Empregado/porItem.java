/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregado;

/**
 *
 * @author willi
 */
public final class porItem extends Empregado{

    private double producao;
    private int quantidade;
    
    public porItem(String n, String f, double p, int q){
        super(n, f);
        setProducao(p);
        setQuantidade(q);
    }
    
    public void setProducao(double p){
        producao = (p > 0 ? p : 0.0);
    }
    
    public void setQuantidade(int q){
        quantidade = (q > 0 ? q : 0);
    }
    
    @Override
    public double ganha() {
        return producao * quantidade;
    }
    
    @Override
    public String toString(){
        return "Por item: " + super.toString();
    }
    
}
