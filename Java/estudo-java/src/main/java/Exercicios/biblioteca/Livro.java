package Exercicios.biblioteca;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor=" + autor +
                ", preco=" + preco +
                '}';
    }
}
