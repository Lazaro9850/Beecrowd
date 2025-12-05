import java.util.Locale;
import java.util.Scanner;

public class Ex1009SalarioComBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double s = sc.nextDouble();
        double v = sc.nextDouble();

        double salarioNv = (v * 0.15) + s;
        System.out.printf("TOTAL = %.2f%n", salarioNv);
    }    
}
