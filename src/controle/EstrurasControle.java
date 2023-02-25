package controle;

public class EstrurasControle {
    public static void main(String[] args) {
        playgroundSwitch();
    }

    private static void playgroundSwitch() {
        /*
        Receber um caracter e definir se ele é:
            vogal, consoante ou numero/aracterespecial.
         */

        String caracter = "7";

        switch (caracter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.printf("%s é uma vogal.", caracter);
                break;
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.printf("%s é um algarismo.", caracter);
                break;
            default:
                System.out.printf("%s é uma consoante ou caracter especial.", caracter);
                break;
        }
    }

    private static void playgroundEstrurasDeControle() {
        int a = 5, b = 10;
        boolean saoIguais = a == b;
        boolean aMaiorQueB = a > b;

        // Controle Aninhado
        if (saoIguais) {
            System.out.printf("%d são iguais %d.\n", a, b);
        } else if (aMaiorQueB) {
            System.out.printf("%d é maior que %d.\n", a, b);
        } else {
            System.out.printf("%d não é maior que %d.\n", a, b);
        }

        /* Receber 3 lados de um triangulo e
            verificar se forma triangulo (cada lado é menor que
            a soma dos lados adjascentes); caso forme
            um triangulo especificar qual o tipo
            [Equilatero, Isosceles e Escaleno]
         */
    }
}
