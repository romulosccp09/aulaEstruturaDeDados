/*Faça um programa que leia um vetor de 10 posições e em seguida um valor X 
qualquer. Seu programa deverá fazer uma busca do valor de X no vetor lido e 
informar a posição em que foi encontrado ou se não foi encontrado.*/

package com.romulo;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
      Scanner tecla = new Scanner(System.in);
      
      int[] vetor = new int[10];
      //int[] vetor1 = new int[vetor.length];
      int busca;
      for(int i = 0; i<vetor.length; i++){
          System.out.println("Digite o primeiro nùmero: ");
          vetor[i] = tecla.nextInt();
           
      }
      
      //busca
        System.out.println("digite um número: ");
        busca = tecla.nextInt();
        for(int i=0, j=0; i<vetor.length; i++, j++){
            if(busca == vetor[i]){
                System.out.println("O número " + busca + ", está na posição: "
                + i+"!");
                
                
        }
            else if (busca != vetor[i]){
                System.out.println("não há no vetor!"); break;
            
            }
            
                     
        //vetor1[j] = vetor[i];   
        
    }
     
     
     
     }   
      /*  for(int j=0; j<vetor1.length; j++){
            if(busca != vetor1[j]){
                System.out.println("Não existe no vetor!"); 
            
            }
        
        
        }*/
        
       
    
}

    
