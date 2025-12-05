import java.util.Scanner;

public class Ex1001ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        int n1 = objeto.nextInt();
        int n2 = objeto.nextInt();

        int X = n1 + n2;

        System.out.println("X = "  +  X);
        objeto.close();
    }
}
