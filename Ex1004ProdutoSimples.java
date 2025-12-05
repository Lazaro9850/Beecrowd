import java.util.Scanner;

public class Ex1004ProdutoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int p = n1 * n2;
        System.out.printf("PROD = %d\n", p);
    }    
}
