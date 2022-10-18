package poo;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private ArrayList<Pessoa> conhecidos = new ArrayList<>();

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Pessoa> getConhecidos() {
        return conhecidos;
    }

    public void setConhecidos(ArrayList<Pessoa> conhecidos) {
        this.conhecidos = conhecidos;
    }

    private double calculoImc() {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    public void mostrarImc() {
        double imc = this.calculoImc();
        System.out.println("O meu IMC é " + imc);
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

    public void dizOla(){
        System.out.println("Olá tudo bem? Meu nome é " + this.nome);
    }

    public boolean conhecePessoa(Pessoa pessoa){
        if (this.conhecidos.contains(pessoa)){
            System.out.println(this.nome + " conhece " + pessoa.nome);
            return true;
        }else {
            System.out.println(this.nome + " não conhece " + pessoa.nome);
            return false;
        }
    }

    public void cumprimentar(Pessoa pessoa){

        if(!this.conhecePessoa(pessoa)){
            this.dizOla();
            pessoa.dizOla();
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this); //this é o objeto que chama cumprimentar
        }else {
            System.out.println("Olá " + pessoa.nome);
            System.out.println("Como vai " + this.nome);
        }
    }

    private void addPessoaNova(Pessoa pessoa){
        System.out.println(this.nome + " conheceu " + pessoa.nome);
        this.conhecidos.add(pessoa);
    }
}
