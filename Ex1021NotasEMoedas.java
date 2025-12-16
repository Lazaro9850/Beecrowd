import java.util.Locale;
import java.util.Scanner;

public class Ex1021NotasEMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] partes = entrada.split("\\.");

        int reais = Integer.parseInt(partes[0]);
        int centavos = Integer.parseInt(partes[1]);

        //notas 
        int n100 = reais / 100;
        int resto = reais % 100;
        
        int n50 = resto / 50;
        resto = resto % 50;
        
        int n20 = resto / 20;
        resto = resto % 20;

        int n10 = resto / 10;
        resto = resto % 10;

        int n5 = resto / 5;
        resto = resto % 5;

        int n2 = resto / 2;
        resto = resto % 2;

        //moeda de 1R$
        int n1 = resto;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);

        //moedas
        int m50 = centavos / 50;
        int resto2 = centavos % 50;

        int m25 = resto2 / 25;
        resto2 = resto2 % 25;

        int m10 = resto2 / 10;
        resto2 = resto2 % 10;

        int m5 = resto2 / 5;
        resto2 = resto2 % 5;

        int m1 = resto2;

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", n1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", m5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", m1);
    }    
}
