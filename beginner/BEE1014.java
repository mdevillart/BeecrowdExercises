import java.io.IOException;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        float Y = scanner.nextFloat();
        double kml = X/Y;
        System.out.println(String.format("%.3f", kml) + " km/l");
    }
}
