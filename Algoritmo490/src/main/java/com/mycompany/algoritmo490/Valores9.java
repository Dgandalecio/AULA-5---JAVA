/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo490;

/**
 *
 * @author Servidor-GI
 */
public class Valores9 {
    
    String nome[] =new String[10];
    
 public static int restantes(String vet[], int tam, String x){
     
     int i,cont;
     cont=0;
     
     for( i=0; i<tam; i++){
         
         if (vet[i].equals(x)){
             vet[i]= "*"; cont++;
         }
        
     }
      return (cont);
 }
    
}
    

