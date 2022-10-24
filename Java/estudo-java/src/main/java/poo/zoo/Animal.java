package poo.zoo;

public interface Animal { //interface só pode ter métodos, sem corpo, se tiver só métodos usa interface, atributos + métodos usa class
    void dormir();
    void fazerSom();
    void comer(String comida);

    String comida = "milho";
}
class Gato implements Animal {

    @Override
    public void dormir() {

    }

    @Override
    public void fazerSom() {

    }

    @Override
    public void comer(String comida) {

    }
}
class Galinha implements Animal {

        @Override
        public void dormir() {
            System.out.println("zzz cocoricó");
        }

        @Override
        public void fazerSom() {
            System.out.println("có có có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("Delicia de " + comida);
        }

        public static void main(String[] args) {
            Galinha galinha = new Galinha();
            Gato gato = new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("Milho");

            gato.fazerSom();
            gato.dormir();
            gato.comer("ração");

            Animal animalGalinha = new Galinha();
            Animal animalGatinho = new Gato();
            animalGatinho.fazerSom();
            animalGalinha.fazerSom();



        }
}



