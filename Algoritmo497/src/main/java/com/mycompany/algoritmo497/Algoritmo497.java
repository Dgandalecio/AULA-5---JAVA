/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo497;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algoritmo497 {

    public static void main(String[] args) {
                int L, c, n, aux;
        Valores4 pr = new Valores4();

        for (L = 0; L < 10; L++) {
            pr.num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L + 1) + ":"));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca"));

        pr.ordena(pr.num, 10);
        c = pr.busca(pr.num, 10, n);

        System.out.println("\nVETOR");
        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + "-" + pr.num[L]);
        }
        c++;

        if (c!= 0) {
            System.out.println("posicao do vetor: " + c);
        } else {
            System.out.println("nao encontrado");
        }
    }
}