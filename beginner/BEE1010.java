import java.io.IOException;
import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int firstProductCode = scanner.nextInt();
        int firstProductQty = scanner.nextInt();
        float firstProductUnitValue = scanner.nextFloat();
        int secondProductCode = scanner.nextInt();
        int secondProductQty = scanner.nextInt();
        float secondProductUnitValue = scanner.nextFloat();
        float TOTAL = ((firstProductQty * firstProductUnitValue) + (secondProductQty * secondProductUnitValue));
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", TOTAL));
    }
}
