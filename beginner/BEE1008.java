import java.io.IOException;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int workerNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        float salaryPerHour = scanner.nextFloat();
        float SALARY = (workedHours * salaryPerHour);
        System.out.println("NUMBER = " + workerNumber);
        System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
    }
}
