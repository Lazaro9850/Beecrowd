import java.util.Locale;
import java.util.Scanner;

public class Ex1008Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        double s = sc.nextDouble();
        double salario = h * s;
        System.out.printf("NUMBER = %d\n", n);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
