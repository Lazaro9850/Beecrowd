import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ex1038Lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> precos = new HashMap<>();

        precos.put(1, 4.00);
        precos.put(2, 4.50);
        precos.put(3, 5.00);
        precos.put(4, 2.00);
        precos.put(5, 1.50);

        String entrada = sc.nextLine();
        String[] lista = entrada.split(" ");
        int cod = Integer.parseInt(lista[0]);
        int qnt = Integer.parseInt(lista[1]);

        System.out.printf("Total: R$ %.2f\n", precos.get(cod) * qnt);

    }
}
