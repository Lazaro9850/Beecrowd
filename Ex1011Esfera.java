import java.util.Scanner;
import java.util.Locale;
public class Ex1011Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        double a = (4.0 / 3.0) * 3.14159 * (Math.pow(raio, 3));
        System.out.printf("VOLUME = %.3f%n", a);
    }    
}
