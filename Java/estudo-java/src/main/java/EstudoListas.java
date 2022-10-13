import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        //ArrayList

        ArrayList<Integer> numeros = new ArrayList<>(); //não suporta tipos primitivos dentro de <> ex: <int>, <double>

        numeros.add(10);
        numeros.add(20);
        numeros.add(100);
        System.out.println(numeros);
        System.out.println(numeros.get(2)); // numeros[2]

        numeros.set(0,500); // numeros[0] = 500, substitui o valor da posição 0 por 500
        System.out.println(numeros);

        numeros.remove(0); //remove o elemento na posição 0
        System.out.println(numeros);

        numeros.add(1, 200);
        numeros.add(3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size());  //tamanho do array

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("-------------------");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //retorna true or false
        System.out.println(numeros.indexOf(100)); //qual a posição
        System.out.println(numeros.indexOf(500)); //retorno -1 significa que não encontrou o elemento
        System.out.println(numeros.lastIndexOf(200)); //mostra o último enocntrado
    }
}
