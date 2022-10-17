package poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean flex;
    int qtdPortas;
    double combustivel;
    double consumo;
    boolean estaLigado;

    public Carro(String modelo, String marca, int ano, boolean flex, int qtdPortas, double combustivel, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.flex = flex;
        this.qtdPortas = qtdPortas;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.estaLigado = false;

    }

    double abastecer(double litros) {
        return this.combustivel += litros;
    }
    // Ligar
    void ligar() {
        this.estaLigado = true;
    }

    // Desligar
    void desligar() {
        this.estaLigado = false;
    }

    // Viajar
    boolean viajar(String local, double distancia) { // tentar viajar, se conseguir true, senão false
        if(!this.estaLigado) {
            this.ligar();
        }
        // Calcula quantos litros serão necessários para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivel - totalLitros > 0) {
            this.combustivel -= totalLitros;
            System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivel + " L");
            return true; // a viagem aconteceu
        } else {
            System.out.println("A viagem não foi possível.");
            return false; // a viagem não será possível
        }
    }

    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 150, 15);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2, 200, 10);

        System.out.println(carro1.combustivel);
        carro1.abastecer(5);
        System.out.println(carro1.combustivel);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano); // 2019
        carro1.ano = 2022;
        System.out.println(carro1.ano); // 2022

        boolean viajou = carro1.viajar("Fortaleza", 30000);
        boolean viajou2 = carro2.viajar("Guarujá", 100);
        System.out.println(viajou);
        System.out.println(viajou2);
    }
}

