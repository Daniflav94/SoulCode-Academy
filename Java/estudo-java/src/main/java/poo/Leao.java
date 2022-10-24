package poo;

public class Leao {
    private String nome;
    private int idade;
    private double peso;
    private String corJuba;

    public void comer(){
        this.peso += 0.5;
    }


    public Leao(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.corJuba = corJuba;
    }

    public Leao(String nome, int idade, double peso, String corJuba) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.corJuba = corJuba;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCorJuba() {
        return corJuba;
    }

    @Override
    public String toString() {
        return "Leao{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", corJuba='" + corJuba + '\'' +
                '}';
    }


}
