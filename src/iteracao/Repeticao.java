package iteracao;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        // Estruturas de repeticao condicionais
        int contador = 0;
        int limite = 10;

        while (contador < limite) {
            contador++;
            System.out.println(contador);
        }

        contador = 0;

        do {
            contador++;
            System.out.println(contador);
        } while (contador < limite);


        /*
        Doacoes crianca esperanca para arrecadar R$ 1.000.000,00
         */

        Scanner in = new Scanner(System.in);
        int doacao = 0;
        int totalDoacoes = 0;

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("Digite o valor da doação.");
            doacao = in.nextInt();
            totalDoacoes += doacao;
            System.out.println("Total atual: " + totalDoacoes);
            if (totalDoacoes >= 1_000_000) {
                break;
            }
        }

        totalDoacoes = 0;

        do {
            System.out.println("Digite o valor da doação.");
            doacao = in.nextInt();
            totalDoacoes += doacao;
            System.out.println("Total atual: " + totalDoacoes);
        } while (totalDoacoes < 1_000_000);

        List<String> alunos = Arrays.asList("Gabriel", "Luis", "Camila", "Bruna");

        for (String nome : alunos) {
            System.out.println(nome);
        }

        alunos.forEach(n -> System.out.println(n));

        alunos.forEach(System.out::println);
    }
}
