package Exercicios.biblioteca;

import java.util.ArrayList;

public class Autor {

    private String nome;
    private String email;

    ArrayList<Livro> listaLivros = new ArrayList<>();

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Livro escreverLivro(String nome, double preco) {
        Livro novoLivro = new Livro(nome, this, preco);
        listaLivros.add(novoLivro);
        return novoLivro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
