package poo;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        super(nome, idade, peso);
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override //sobreescreve o método
    public void emitirSom(){
        System.out.println("Au au au");
    }

    @Override
    public void brincar() {
        super.brincar();
        this.emitirSom();
        this.dormir();
    }

    @Override
    public void comer(String comida) {
        if (comida.equals(this.comidaFavorita)) {
            super.comer(comida);
        } else {
            System.out.println("Não quis comer " + comida);
        }
    }

    public void correrAtrasMoto(){
        this.emitirSom();
        System.out.println("Correndo atras da moto");
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("banana");

        Cachorro bob = new Cachorro("Bob", 7, 18, "Pão", "Viralata");
        bob.dormir();
        bob.emitirSom();
        bob.comer(bob.comidaFavorita);
        bob.comer("cebola");
        bob.setPeso(20);
        System.out.println(bob.getPeso());
        bob.brincar();
        bob.correrAtrasMoto();
    }
}

