package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] V1 = new int[5];
        int[] V2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("1º Vetor - Digite um número inteiro: ");
             V1[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("2º Vetor - Digite um número inteiro: ");
            V2[i] = entrada.nextInt();
        }
        int numerosIdenticos = 0;

        for (int i = 0; i < V1.length; i++){
            if(V1[i] == V2[i]){
              numerosIdenticos++;
            }
        }
        System.out.println("Os dois vetores possuem " + numerosIdenticos + " números idênticos nas mesmas posições.");
    }
}
