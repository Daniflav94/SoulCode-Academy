import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //"José" -> J = 0, O = 1, S = 2, É = 3

        String nome ="Daniele";

        if (nome == "Daniele"){ //verifica a localização
            System.out.println("São iguais");
        }

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome == "Almeida"){ //não compara o conteúdo e sim localização na memória
            System.out.println("São iguais");
        }else {
            System.out.println("São diferentes");
        }

        if(sobrenome.equals("Almeida")){ //equalIgnoreCase("almeida") ignora maiusculas e minusculas
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        //Outros métodos
        String java = "Java";
        String ja = java.substring(0,2);
        String va = java.substring(2); //corta a partir do 2

        String m1 = "Hello";
        String m2 = "World";
        String m3 = m1.concat(m2); // m1 + m2

        System.out.println(java.length()); //quantos caracteres
        System.out.println(java.isEmpty()); //está vazia?
        System.out.println(java.toUpperCase()); //JAVA
        System.out.println(java.toLowerCase()); //java

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13", "10", "2022"]
        System.out.println(valores[0]);

        String email = "dani@email.com";
        String[] valoresEmail = email.split("@"); // ["dani", "email.com"]
        System.out.println(valoresEmail[0]); // dani

        String teste = "Amanhã é sexta-feira";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2)); // [A,m,a,n,h,ã, , é, ...]
    }
}
