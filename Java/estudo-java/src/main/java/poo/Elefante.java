package poo;

public class Elefante extends Animal{

    private int tromba;

    public Elefante(String nome, String especie, boolean peludo, int tromba) {
        super(nome, especie, peludo);
        this.tromba = tromba;
    }

    public void pegarObjetoComTromba(){}
    @Override
    public void comer() {
        System.out.println("Gosto muito de comer vegetais!");
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    public int getTromba() {
        return tromba;
    }

    public void setTromba(int tromba) {
        this.tromba = tromba;
    }

    public static void main(String[] args) {
        Animal elefante = new Elefante("Elefante", "Mamífero", false, 60);
        elefante.comer();


    }
}

