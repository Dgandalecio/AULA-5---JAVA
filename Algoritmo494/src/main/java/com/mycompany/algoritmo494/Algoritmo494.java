/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo494;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algoritmo494 {

    public static void main(String[] args) {
        int L,c,t,tl;
        Valores1 pr = new Valores1();
        
        for(L=0;L<3;L++){
            
            pr.nome[L]=JOptionPane.showInputDialog("Digite o nome");
            pr.ender[L]=JOptionPane.showInputDialog("Digite o endereco");
            pr.prof[L]=JOptionPane.showInputDialog("Digite a profissao");
        }
          for(L=0;L<2;L++){
              
              for(c=(L+1);c<3;c++){
                  if (pr.nome[L].compareTo(pr.nome[c]) > 0){
                      
                      pr.troca(pr.nome[L],pr.nome[c]);
                      pr.troca(pr.ender[L],pr.ender[c]);
                      pr.troca(pr.prof[L], pr.prof[c]);
                      
                  }
              }
          }
           for(L=0;L<3;L++){
               System.out.println(pr.nome[L]+"\t"+pr.ender[L]+"\t"+pr.prof[L]);
           }
    }
}
