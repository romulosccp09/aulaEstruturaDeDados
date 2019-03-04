/*
 * Faça um programa que leia um vetor de 10 posições e que armazene em um vetor .
 * B todos os números pares, e posteriormente os ímpares.
 * and open the template in the editor.
 */
package com.romulo.exercicio03;

import java.util.Scanner;

/**
 *
 * @author rd-sccp
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for(int i =0, j=0; i<vetorA.length; i++, j++){
            System.out.println("Digite o " + (i+1) + "º valor");
            vetorA[i] = entrada.nextInt();
            vetorB[j] = vetorA[i];
        }
        
        System.out.print("Pares: ");
        for(int i=0, j=0; i<vetorA.length; i++, j++){
            if(vetorA[i]%2 ==0){
                System.out.print(vetorB[j] + " ");
            }
            
            
        }
        
        System.out.println("");
        
        System.out.print("Ímpares: ");
        for(int i=0, j=0; i<vetorA.length; i++, j++){
            
            if(vetorA[i]%2!=0){
                System.out.print(vetorB[j] + " ");
            }
            
        }
    }

    
}
