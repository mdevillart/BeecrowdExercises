import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) throws IOException {
        double  n = 3.14159;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double r = scanner.nextDouble();
        double area = n*(r*r);
        System.out.println("A=" + String.format("%.4f", area));
    }
}
