/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
 * defina e escreva a média aritmética simples dos elementos ímpares armazenados 
 * neste vetor.
 */
package com.romulo;

import java.util.Scanner ;
/**
 *
 * @author Rômulo de Carvalho.
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetA = new int[10];
        int somaPar = 0, somaImpar =0, cont1 = 0,
                cont2 = 0;
        double mediaPar,  mediaImpar;
         for (int i = 0; i < vetA.length; i++) {
             System.out.println("Digite o " + (i+1) + "° número: ");
             vetA[i] = tecla.nextInt();
             
             if(vetA[i] %2 == 0){
                 somaPar = somaPar + vetA[i];
                 cont1 = cont1+1;
                 
                 
             } else if(vetA[i] % 2 !=0){
                 somaImpar = somaImpar + vetA[i];
                 cont2 = cont2 + 1;
             }
            
        }
         mediaImpar = somaImpar / cont2;
         mediaPar = somaPar / cont1;
         System.out.println(" A soma dos números pares vale: " + somaPar + 
                 ", e sua média vale -> " + mediaPar + "!");
         System.out.println(" A soma dos números ímpares vale: " + somaImpar +
                 ", e sua média vale -> " + mediaImpar + "!");
         
         
    }
    
}
