/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo493;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algoritmo493 {

    public static void main(String[] args) {
 
        int L,c,aux;
        
        Valores pr = new Valores();
        
        for (L=0; L<10; L++){
            
            pr.num[L]=Integer.parseInt( JOptionPane.showInputDialog("Digite numero"+(L+1)+":"));
        }
        c= pr.verificaordem(pr.num,10);
        
        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        } else {
            System.out.println("\nNAO ESTA ORDENADO");
        }
            
    }
}
