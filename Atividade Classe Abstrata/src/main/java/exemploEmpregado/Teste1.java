/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploEmpregado;

import java.text.DecimalFormat;

import Empregado.Chefe;
import Empregado.Empregado;
import Empregado.porComissao;
import Empregado.porHora;
import Empregado.porItem;

/**
 *
 * @author willi
 */
public class Teste1 {
    public static void main( String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        Chefe ch = new Chefe("William", "Silva", 3000.00);
        porComissao pc = new porComissao("Ivanildo", "Carneiro", 500.00, 3.00, 150);
        porItem pi = new porItem("Gabrielle", "Marques", 4.50, 300);
        porHora ph = new porHora("Ediene", "Maria", 16.50, 45.50);
        
        System.out.println(ch.toString() + " ganha $" + df.format(ch.ganha()));
        System.out.println(pc.toString() + " ganha $" + df.format(pc.ganha()));        
        System.out.println(pi.toString() + " ganha $" + df.format(pi.ganha()));
        System.out.println(ph.toString() + " ganha $" + df.format(ph.ganha()));
        
    }
}
