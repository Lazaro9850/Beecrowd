import java.util.Scanner;

public class Ex1013OMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        String[] parte = entrada.split(" ");
        int a = Integer.parseInt(parte[0]);
        int b = Integer.parseInt(parte[1]);
        int c = Integer.parseInt(parte[2]);

        int mab = (a + b + Math.abs(a - b)) /2;
        int maior = (c + mab + Math.abs(c - mab)) / 2;
        System.out.printf("%d eh o maior\n", maior);
    }    
}
