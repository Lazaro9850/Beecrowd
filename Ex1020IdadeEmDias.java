import java.util.Scanner;

public class Ex1020IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        
        int ano = dias / 365;
        int resto = dias % 365;

        int mes = resto / 30;
        resto = resto % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", resto);
    }    
}
