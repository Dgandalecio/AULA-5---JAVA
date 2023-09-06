/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algortimo483;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algortimo483 {

    public static void main(String[] args) {
      int L,c,aux;
      Valores6 pr = new Valores6();
      
      for(L=0;L<4; L++){
          
          pr.num[L]= Integer.parseInt( JOptionPane.showInputDialog("Digite 1 numero "+ (L+1)+":"));
      }
      for(L=0;L<4; L++){
          pr.num1[L]= Integer.parseInt( JOptionPane.showInputDialog("Digite 2 numero "+ (L+1)+":"));
      }
          c= pr.produtointerno(pr.num,pr.num1,4);
          System.out.println("Vetor A \t Vetor B");
          
          for(L=0;L<4; L++){
              System.out.println(pr.num[L]+"\t"+pr.num1[L]);
          }
          System.out.println("Produto interno"+c);
      }
    }


