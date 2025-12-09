import java.util.Locale;
import java.util.Scanner;

public class Ex1014Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        double km = Double.parseDouble(entrada);
        double l = sc.nextDouble();
        double kml = km / l;
        System.out.printf("%.3f km/l\n", kml);       
    }    
}
