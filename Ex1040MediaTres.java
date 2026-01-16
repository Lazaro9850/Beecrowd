import java.util.Locale;
import java.util.Scanner;

public class Ex1040MediaTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10.00;
        double mediaTruncada = Math.floor(media * 10) / 10;

        System.out.println("Media: " + mediaTruncada);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double exame = sc.nextDouble();
            System.out.println("Nota do exame: " + exame);

            double mediaFinal = (media + exame) / 2.0;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
    }
}
