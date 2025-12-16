import java.util.Scanner;

public class Ex1019ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        int horas = entrada / 3600;
        int resto = entrada % 3600;

        int minutos = resto / 60;
        resto = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, resto);
        
    }    
}
