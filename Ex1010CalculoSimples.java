import java.util.Locale;
import java.util.Scanner;

public class Ex1010CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String lista = sc.nextLine();
        String lista1 = sc.nextLine();

        String[] partes = lista.split(" ");
        int cod = Integer.parseInt(partes[0]);
        int qnt = Integer.parseInt(partes[1]);
        double val = Float.parseFloat(partes[2]);
        
        String[] partes1 = lista1.split(" ");
        int cod1 = Integer.parseInt(partes1[0]);
        int qnt1 = Integer.parseInt(partes1[1]);
        double val1 = Float.parseFloat(partes1[2]);
        double pag = qnt * val + qnt1 * val1;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pag);

    }    
}
