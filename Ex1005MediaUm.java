import java.util.Locale;
import java.util.Scanner;

public class Ex1005MediaUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double m = (n1 * 3.5 + n2 * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", m);
    }    
}
