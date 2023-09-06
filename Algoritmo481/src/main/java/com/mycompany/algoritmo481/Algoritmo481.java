/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo481;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor-GI
 */
public class Algoritmo481 {

    public static void main(String[] args) {
       
        int num, base, c;
        
       num= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior ou igual a 0" ));
        
       while(num<0){
           num= Integer.parseInt(JOptionPane.showInputDialog("Numero negativo.Digite um numero maior ou igual a 0" )); 
       }
       base=Integer.parseInt( JOptionPane.showInputDialog("Digite a base em deseja representa-lo(2-10"));
       
       while(base<2||base>10){
           
          base=Integer.parseInt( JOptionPane.showInputDialog("Não sei converter.Digite a base em deseja representa-lo(2-10"));
       }
       Valores5 conversor= new Valores5();
       
     c = conversor.converte(num, base);
     
        System.out.println( "Número em decimal: " + num + "\nNúmero na base " + base + ": " + c);
       
}
}
