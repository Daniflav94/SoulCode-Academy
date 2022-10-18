package poo;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        if(altura > 0 && altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida");
        }
    }

    public void setPeso(double peso) {
        if(peso > 0 && peso < 500) {
            this.peso = peso;
        }else {
            System.out.println("Peso inválido");
        }
    }
}
