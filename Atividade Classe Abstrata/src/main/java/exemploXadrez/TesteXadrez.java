/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploXadrez;

import Xadrez.Bispo;
import Xadrez.Cavalo;
import Xadrez.Peao;
import Xadrez.Peca;

/**
 *
 * @author willi
 */
public class TesteXadrez {
    public static void main(String[] args){
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
    }
}
