package poo;

public class Exemplo {
    private String nome;
    private int idade;

    public Exemplo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Exemplo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
