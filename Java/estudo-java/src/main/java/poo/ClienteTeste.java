package poo;

import java.time.LocalDate;

//Encapsulamento: escolher quais atributos ficarão visíveis fora da classe, por padrão os atributos e métodos são publicos
//private: os métodos/atributos são visíveis apenas na classe, não sendo possível acessar fora da classe
//protected:
//getter: possibilita a leitura dos atributos
//setter: possibilita alteração dos atributos, estabelecer como o valor é alterado
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Daniele", "Almeida", LocalDate.of(1994, 8, 6), 1.58, 50);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getDataNascimento());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setPeso(60);
        System.out.println(cliente1.getPeso());
    }
}
