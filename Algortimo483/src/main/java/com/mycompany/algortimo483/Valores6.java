/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algortimo483;

/**
 *
 * @author Servidor-GI
 */
public class Valores6 {
    
    int num[]= new int[4];
    int num1[]= new int[4];
    
    public static int produtointerno(int[]vet1,int[] vet2,int quant){
        
        int prod,i;
        prod=0;
        for(i=0;i<quant;i++){
            prod= prod+ (vet1[i]*vet2[i]);
        }
return(prod);
    
}

}