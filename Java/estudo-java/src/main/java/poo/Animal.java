package poo;

public class Animal {
    private String nome;
    private String especie;
    private boolean peludo;

    public void comer(){
        System.out.println("Gosto muito de comer...");
    }

    public void reproduzir(){}

    public void dormir(){}

    public Animal(String nome, String especie, boolean peludo) {
        this.nome = nome;
        this.especie = especie;
        this.peludo = peludo;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isPeludo() {
        return peludo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", peludo=" + peludo +
                '}';
    }
}
