package Exercicios.bichinho;

public class Main {
    public static void main(String[] args) {
        Bichinho pow = new Bichinho("Pow", 100.0);
        Comida batata = new Comida("Batata", 15.0);
        pow.comer(batata);
        pow.comer(batata);
        System.out.println(pow.getBucho());
        pow.dormir(2);
        pow.comer(batata);

        pow.acordar();
        System.out.println(pow.getBucho());
        System.out.println(pow.getPeso());

        Comida frango = new Comida("Frango", 10.0);

        pow.comer(batata);
        pow.comer(frango);
        System.out.println(pow.getPeso());
        pow.comer(batata);
        System.out.println(pow.getBucho());



    }
}
