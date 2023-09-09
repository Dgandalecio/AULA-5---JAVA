/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo495;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algoritmo495 {

    public static void main(String[] args) {
      
        Valores3 pr = new Valores3();
        int L, c, t, tl;

        for (L = 0; L < 5; L++) {
            pr.nome[L][0] = JOptionPane.showInputDialog("Digite nome");
        }

        pr.ordena(pr.nome, 5);
        System.out.println("NOMES ORDENADOS");

        for (L = 0; L < 5; L++) {
            System.out.println((L + 1) + "-" + pr.nome[L][0]);
        }
    }
}

