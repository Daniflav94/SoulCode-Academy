import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Bem-vinda, " + nome);

        System.out.println();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

        //Calcular IMC

        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("IMC: %.2f\n", imc);
    }
}
