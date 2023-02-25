package controle;

public class Triangulos {
    public static void main(String[] args) {
        int a = 22;
        int b = 20;
        int c = 11;

        if ((a > (b + c))
                || (b > (a + c))
                || (c > (a + b))) {
            System.out.println("Forma triangulo");
        } else if (a == b && a == c) {
            System.out.println("Triangulo equilátero.");
        } else if (a == b || a == c) {
            System.out.println("Triangulo isosceles.");
        } else {
            System.out.println("Triangulo escaleno.");
        }
    }
}
