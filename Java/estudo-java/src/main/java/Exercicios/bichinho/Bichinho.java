package Exercicios.bichinho;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.bucho = new ArrayList<>();
        this.estaDormindo = false;
    }

    public void comer(Comida comida) {
        if (this.estaDormindo){
            System.out.println("zzzZzz não é hora de comer!");
        } else if (this.bucho.contains(comida)){
            System.out.println("Já comi " + comida.getNome());
        } else {
            this.bucho.add(comida);
            System.out.println("Que delícia obrigadoo");
            this.peso += comida.getPeso();
        }
    }

    public void dormir(int horas){
        this.estaDormindo = true;
        double porcentagemPeso = this.peso * 0.1;
        double quilosPerdidos = horas * porcentagemPeso;
        this.peso -= quilosPerdidos;
        this.bucho.clear();
    }

    public void acordar(){
        this.estaDormindo = false;
        System.out.println("Oláaaa, estou descansado");
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<Comida> getBucho() {
        return bucho;
    }

    public boolean isEstaDormindo() {
        return estaDormindo;
    }
}
