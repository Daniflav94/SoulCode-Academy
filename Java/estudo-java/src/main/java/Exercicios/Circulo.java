package Exercicios;

public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio) {
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo() {
        this.raio = 1;

    }

    public double calcularArea(){

        return Math.PI * this.raio * this.raio;

    }

    public double calcularCircunferencia(){

        return 2 * Math.PI * this.raio;

    }

    public double mudarRaio(double raio){
        return this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public String getCor() {
        return cor;
    }
}
