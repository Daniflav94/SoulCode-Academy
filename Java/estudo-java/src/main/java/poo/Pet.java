package poo;

public class Pet {
    private String nome;
    private int idade;
    private double peso;

    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void emitirSom(){

        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Comendo " + comida);
    }

    public void dormir(){
        System.out.println("Dormindo...");
    }

    public void brincar(){
        System.out.println("Brincando...");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
