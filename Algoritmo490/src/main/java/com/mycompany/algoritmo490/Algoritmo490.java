/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo490;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algoritmo490 {

    public static void main(String[] args) {
      int L;
      Valores9 pr = new Valores9();
      
         for(L=0;L<10;L++){
             
          pr.nome[L]=   JOptionPane.showInputDialog("Digite palavra em letras minusculas "+(L+1)+ ":");
             
       pr.restantes(pr.nome,pr.nome[L].length(), "c");
        }
         for(L=0;L<10;L++){
             System.out.println((L+1)+ "-"+pr.nome[L]);
         }
    }
}
