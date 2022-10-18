package poo;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Daniele");
        pessoa1.setSobrenome("Almeida");
        pessoa1.setIdade(28);;
        pessoa1.setPeso(50);;
        pessoa1.setAltura(1.58);;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa("Felipe", "Almeida", 27, 1.75, 75);
        System.out.println(pessoa2.getNome());

        Pessoa recemNascido = new Pessoa("Bob", "Almeida");

        pessoa2.mostrarImc();


        Pessoa pedro = new Pessoa("Pedro", "José", 29, 1.80, 85);

        Pessoa joao = new Pessoa("João", "Santos", 25, 1.90, 90);

        pedro.cumprimentar(joao);
        joao.cumprimentar(pedro);

    }
}
