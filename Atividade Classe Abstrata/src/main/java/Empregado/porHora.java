/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregado;

/**
 *
 * @author willi
 */
public final class porHora extends Empregado{

    private double valor;
    private double horas;
    
    public porHora(String n, String f, double v, double h){
        super(n, f);
        setValor(v);
        setHoras(h);
    }
    
    public void setValor(double v){
        valor = (v > 0 ? v : 0.0);
    }
    
    public void setHoras(double h){
        horas = (h >= 0 && h <= 300 ? h : 0.0);
    }
    
    @Override
    public double ganha() {
        return valor * horas;
    }
    
    @Override
    public String toString(){
        return "Por hora: " + super.toString();
    }
}
