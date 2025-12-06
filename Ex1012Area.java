import java.util.Locale;
import java.util.Scanner;

public class Ex1012Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        String[] lista = s.split(" ");
        double a = Float.parseFloat(lista[0]);
        double b = Float.parseFloat(lista[1]);
        double c = Float.parseFloat(lista[2]);

        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * (Math.pow(c, 2));
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}