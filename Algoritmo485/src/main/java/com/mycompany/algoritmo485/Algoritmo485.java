/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo485;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algoritmo485 {

    public static void main(String[] args) {
       int L,c;
       
       Valores7 pr = new Valores7();
       
       for(L=0; L<6; L++){
           
        pr.num[L]=Integer.parseInt(JOptionPane.showInputDialog("Digite Numero "+ (L+1)+":"));
       
       }
        for(L=0; L<6; L++){
             pr.num1[L]=(JOptionPane.showInputDialog("Digite caracter "+ (L+1)+":"));
             
        }
          pr.multivetor(pr.num, pr.num1, 6);
    }
}
