package poo;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Daniele";
        pessoa1.sobrenome = "Almeida";
        pessoa1.idade = 28;
        pessoa1.peso = 50.0;
        pessoa1.altura = 1.58;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa("Felipe", "Almeida", 27, 70, 1.75);
        System.out.println(pessoa2.nome);

        Pessoa recemNascido = new Pessoa("Bob", "Almeida");

        System.out.println("O meu IMC é " + pessoa2.calculoImc());
        pessoa2.mostrarImc();

    }
}
