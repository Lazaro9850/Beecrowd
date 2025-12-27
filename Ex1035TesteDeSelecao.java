import java.util.Scanner;

public class Ex1035TesteDeSelecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] lista = entrada.split(" ");

        int a = Integer.parseInt(lista[0]);
        int b = Integer.parseInt(lista[1]);
        int c = Integer.parseInt(lista[2]);
        int d = Integer.parseInt(lista[3]);

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
