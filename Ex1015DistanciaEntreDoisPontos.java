import java.util.Locale;
import java.util.Scanner;

public class Ex1015DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String entrada1 = sc.nextLine();
        String entrada2 = sc.nextLine();
        
        String[] parte1 = entrada1.split(" ");
        String[] parte2 = entrada2.split(" ");

        double pontoX1 = Double.parseDouble(parte1[0]);
        double pontoY1 = Double.parseDouble(parte1[1]);

        double pontoX2 = Double.parseDouble(parte2[0]);
        double pontoY2 = Double.parseDouble(parte2[1]);

        double disX = Math.pow((pontoX2 - pontoX1), 2);
        double disY = Math.pow((pontoY2 - pontoY1), 2);
        double dis = Math.pow((disX + disY), 0.5);
        System.out.printf("%.4f", dis);
        
    }
}
