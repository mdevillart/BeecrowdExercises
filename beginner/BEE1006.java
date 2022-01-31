import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        float MEDIA = (((A * 2) + (B * 3) + (C * 5)) / 10);
        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));
    }
}
