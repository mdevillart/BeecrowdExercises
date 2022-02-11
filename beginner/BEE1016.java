import java.io.IOException;
import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        int minutes = (km * 2);
        System.out.println(minutes + " minutos");
    }
}
