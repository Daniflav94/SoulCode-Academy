package Exercicios;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Daniele", "Almeida", 5000);

        System.out.println(empregado.salarioAnual());
        System.out.println(empregado.aumentarSalario(100));
        System.out.println(empregado.nomeCompleto());
    }
}
