package Exercicios.biblioteca;

public class Main {
    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter - E a Pedra Filosofal", jk,24.9);
        System.out.println(pedraFilosofal);

        System.out.println(pedraFilosofal.getAutor().getNome());
        System.out.println(pedraFilosofal.getPreco());

        jk.escreverLivro("Harry Potter - E a Pedra Filosofal",24.9);
        jk.escreverLivro("Harry Potter - E a Câmara Secreta", 30.0);
        jk.escreverLivro("Harry Potter - E o Prisioneiro de Askaban", 40.0);
        System.out.println(jk.listaLivros);

        System.out.println("Autor: " + jk.listaLivros.get(1).getAutor().getNome());
        System.out.println("Primeiro livro escrito: " + jk.listaLivros.get(0).getNome());

    }
}
