/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregado;


/**
 *
 * @author willi
 */
public final class porComissao extends Empregado {
    private double salario;
    private double comissao;
    private int vendas;
    
    public porComissao(String n, String f, double s, double c, int v){
        super(n, f);
        setSalario(s);
        setComissao(c);
        setVendas(v);
    }
    
    public void setSalario(double s){
        salario = (s > 0 ? s : 0.0);
    }
    
    public void setComissao(double c){
        comissao = (c > 0 ? c : 0.0);
    }
    
    public void setVendas(int v){
        vendas = (v > 0 ? v : 0);
    }
    
    @Override
    public double ganha(){
        return salario + comissao * vendas;
    }
    
    @Override
    public String toString(){
        return "Por comissão: " + super.toString();
    }
}
