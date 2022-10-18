package Exercicios;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double salarioAnual(){
        return this.salario * 12;
    }

    public double aumentarSalario(double aumento){
        return this.salario + aumento;
    }

    public String nomeCompleto(){
        return this.nome + ' ' + this.sobrenome;
    }

}
