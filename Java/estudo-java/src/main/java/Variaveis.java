public class Variaveis {
    public static void main(String[] args){
        System.out.println("Hello, world");

        int idade = 20;
        double salario = 4500.99;
        float nota = 7.5f; //sufixo para float, menos preciso que double
        long populacaoTerra = 7_900_000_000l;

        boolean tarefaConcluida = false;
        int i = 1, j = 0, k = 1000;

        String nome = "dani";
        char letra = 'd';

        int teste = 10;
        teste = 9;

        final int teste2 = 200; //não pode mudar o valor

        int a = 7;
        int b = 2;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println(a / b); // 3 , dois inteiros resulta em inteiro, ignora a parte decimal

        int sete = 7;
        double dois = 2.0;

        System.out.println(sete / dois); // 3.5

        //Math

        double x = Math.sqrt(144); //12 raiz quadrada
        double y = Math.pow(5, 2); //25
        System.out.println(Math.PI);

        // Casting

        int pi = (int) Math.PI; //irá converter para inteiro e perder os números após a virgula

        int dois2 = 2;

        double resultado = sete / (double) dois2; // 7 / 2.0 = 3.5





    }
}
