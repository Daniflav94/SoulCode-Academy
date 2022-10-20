package poo;

public class Bicicleta {
    private int marcha;
    private int velocidade;

    public Bicicleta(int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(21, 0);
        System.out.println(bicicleta);

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marcha=" + marcha +
                ", velocidade=" + velocidade +
                '}';
    }
}
