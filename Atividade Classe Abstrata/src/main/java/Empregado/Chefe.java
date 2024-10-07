/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregado;

/**
 *
 * @author willi
 */
public final class Chefe extends Empregado{
    
    private double salario;
    
    public Chefe(String n, String f, double s){
        super(n, f);
        setSalario(s);
    }
    
    public void setSalario(double s){
        salario = (s > 0 ? s : 0.0);
    }
    
    @Override
    public double ganha() {
        return salario;
    }
    
    @Override
    public String toString(){
        return "Chefe: " + super.toString();
    }
    
}
