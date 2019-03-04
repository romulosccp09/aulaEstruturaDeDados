/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
 *determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.
 * and open the template in the editor.
 */
package exercicio05;

import java.util.Scanner;

/**
 *
 * @author rRômulo de Carvalho.
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int soma = 0;
        
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetor1[i] = tecla.nextInt();
            
            soma = soma + vetor1[i] ;
            
            
            
            
        }
        System.out.println("A soma vale: " + soma + "!");
        
        if(soma % 5 == 0){
            System.out.println(soma + ", é multiplo de 5.");      
        
        }else{
            System.out.println(soma + ", não é multiplo de 5.");
        }
        
        
    }
    
}
