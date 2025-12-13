import java.util.Scanner;

public class Ex1018Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        int n100 = entrada / 100;
        int resto = entrada % 100;
        
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

        int n1 = resto;
        System.out.println(entrada);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
        
    }
}
