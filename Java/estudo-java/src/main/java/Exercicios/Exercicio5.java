package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos números deseja armazenar?");
        int quantidade = entrada.nextInt();

        int[] arrayNumeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o número: ");
            arrayNumeros[i] = entrada.nextInt();
        }

        int soma = 0;
        for (int numero:arrayNumeros) {
            soma += numero;
        }

        int media = soma / quantidade;

        System.out.println("Soma dos números: " + soma + "\nMédia: " + media);
    }
}
