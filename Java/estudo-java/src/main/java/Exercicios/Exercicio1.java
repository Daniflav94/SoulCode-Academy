package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Qual operação deseja realizar? \n 1-Adição\n 2-Subtração\n 3-Multiplicação\n 4-Divisão");
        int operacao = entrada.nextInt();

        double resultado;

        switch (operacao) {
            case 1 -> {
                resultado = num1 + num2;
                System.out.println(resultado);
            }
            case 2 -> {
                resultado = num1 - num2;
                System.out.println(resultado);
            }
            case 3 -> {
                resultado = num1 * num2;
                System.out.println(resultado);
            }
            case 4 -> {
                resultado = num1 / num2;
                System.out.println(resultado);
            }
            default -> {
                System.out.println("Você digitou uma operação inválida!");
            }
        }
    }
}
