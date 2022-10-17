package poo;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) { //construtor
        //this => representa o objeto
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }

    void dizOla(){
        System.out.println("Olá tudo bem? Meu nome é " + this.nome);
    }

    double calculoImc() {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void mostrarImc() {
        double imc = this.calculoImc();
        System.out.println("O meu IMC é " + imc);
    }
}
