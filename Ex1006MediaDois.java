import java.util.Scanner;
import java.util.Locale;
public class Ex1006MediaDois {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double m = ((n1 * 2)+(n2 * 3)+(n3 * 5)) / 10;
        System.out.printf("MEDIA = %.1f%n", m);
    }    
}
