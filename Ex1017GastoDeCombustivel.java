import java.util.Locale;
import java.util.Scanner;

public class Ex1017GastoDeCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int vm = sc.nextInt();

        double l = (h * vm) / 12.0;
        System.out.printf("%.3f\n", l);
    }    
}
