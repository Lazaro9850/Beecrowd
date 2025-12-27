import java.util.Locale;
import java.util.Scanner;

public class Ex1036FormulaDeBhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] lista = entrada.split(" ");

        double a = Double.parseDouble(lista[0]);
        double b = Double.parseDouble(lista[1]);
        double c = Double.parseDouble(lista[2]);

        double delta = (Math.pow(b, 2.0)) - 4 * (a * c);
        if (delta >= 0 && a > 0.0) {
            double x1 = (- b + Math.pow(delta, 0.50)) / (2 * a);
            double x2 = (- b - Math.pow(delta, 0.50)) / (2 * a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.println("Impossivel calcular");
        }
        
    }
}
