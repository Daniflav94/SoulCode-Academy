import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        numeros[3] = 10;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; // 0..49
        numeros2[0] = 500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José", "Renato", "Victor"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();

        int[] quantidades = new int[quantidade];

        //exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];
        double soma = 0;

        for (int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da " + i + "ª nota: ");
            notasProva[i] = entrada.nextDouble();
        }

        for(double nota : notasProva){
            soma += nota;
        }
        double media = soma / totalNotas;
        System.out.println(media);
    }

}
