package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("1º Vetor - Digite os valores: ");
        for (int i = 0; i < v1.length; i++) {
             v1[i] = entrada.nextInt();
        }
        System.out.println("2º Vetor - Digite os valores: ");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = entrada.nextInt();
        }
        int numerosIdenticos = 0;

        for (int i = 0; i < 5; i++){
            if(v1[i] == v2[i]){
              numerosIdenticos++;
            }
        }
        System.out.println("Os dois vetores possuem " + numerosIdenticos + " números idênticos nas mesmas posições.");
    }
}
