import java.io.IOException;
import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int S = scanner.nextInt();

        int maiorAB = Math.max(A, B);
        int maior = Math.max(maiorAB, S);
        System.out.println(maior + " eh o maior");
    }
}
