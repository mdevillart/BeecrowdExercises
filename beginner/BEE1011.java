import java.io.IOException;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        double pi = 3.14159;
        double volume = ((4 / 3.0) * pi * (Math.pow(radius, 3)));
        System.out.println("VOLUME = " + String.format("%.3f", volume));
    }
}
