package Exercicios.bichinho;

public class Comida {
    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
