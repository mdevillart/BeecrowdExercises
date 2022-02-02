import java.io.IOException;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String workerName = scanner.next();
        double workerSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        double bonus = ((totalSales / 100) * 15);
        double TOTAL = bonus + workerSalary;
        System.out.println("TOTAL = R$ " + String.format("%.2f", TOTAL));
    }
}
