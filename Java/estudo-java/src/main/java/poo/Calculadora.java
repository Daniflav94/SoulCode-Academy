package poo;

public class Calculadora {

    public static double PI = 3.14;

    public static double soma(double a, double b){ //método estático - não pertence ao objeto mas sim a classe, não depende
        //que seja criado um objeto para chamar um método
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        System.out.println(resultadoSoma);
        System.out.println(Calculadora.PI);
    }
}
