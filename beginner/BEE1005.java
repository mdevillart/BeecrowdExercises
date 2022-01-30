import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        double MEDIA = (((A * 3.5) + (B * 7.5)) / 11);
        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));
    }
}
