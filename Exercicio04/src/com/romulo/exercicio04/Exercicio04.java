/*
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
 * vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, 
 * ou seja: C[i] = A[i] + B[i].
 */
package com.romulo.exercicio04;

import java.util.Scanner;

/**
 *
 * @author Rõmulo de Carvalho.
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetB.length];
        
        for(int i=0, j=0; i<vetA.length; i++, j++){
            System.out.println("Digite o " + (i+1) + "º valor de A: ");
            vetA[i] = tecla.nextInt();
            System.out.println("Digite o " + (i+1) + "º valor de B: ");
            vetB[i] = tecla.nextInt();
            vetC[i] = vetA[i] + vetB[i];
            
            
        }
        for(int i = 0; i<vetC.length; i++){
            System.out.println("A soma de " + vetA[i] + " + " + vetB[i] + 
                    " vale: " + vetC[i] + "!");
        }
        
       
    }
    
}
