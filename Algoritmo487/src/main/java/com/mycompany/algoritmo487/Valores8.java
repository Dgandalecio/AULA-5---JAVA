/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo487;

/**
 *
 * @author Servidor-GI
 */
public class Valores8 {
    
    int num[] = new int[10];
    
    public static int inverte(int vet[],int max){
        
        int k,i,aux;
        k=max;
        for(i=0;i<max/2; i++){
            aux=vet[i];
           k--;
           
           vet[i]= vet[k];
           vet[k]=aux;
        }
return 0;
    }
}
