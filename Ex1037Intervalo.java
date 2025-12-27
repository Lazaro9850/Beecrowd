import java.util.Locale;
import java.util.Scanner;

public class Ex1037Intervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double entrada = sc.nextDouble();
        
        if (entrada <= 100 && entrada > 75) {
            System.out.println("Intervalo (75,100]");
        } else if (entrada <= 75 && entrada > 50) {
            System.out.println("Intervalo (50,75]");
        } else if (entrada <= 50 && entrada > 25) {
            System.out.println("Intervalo (25,50]");
        } else if (entrada <= 25 && entrada >= 0) {
            System.out.println("Intervalo [0,25]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
