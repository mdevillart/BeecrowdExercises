import java.io.IOException;
import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double rectangleTriangle = (((1 / 2.0) * A) * C);
        double radiusCircleC = pi * (Math.pow(C, 2));
        double trapeziumArea = (((1 / 2.0) * (A + B)) * C);
        double squareArea = Math.pow(B, 2);
        double rectangleArea = A * B;
        System.out.println("TRIANGULO: " + String.format("%.3f", rectangleTriangle));
        System.out.println("CIRCULO: " + String.format("%.3f", radiusCircleC));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeziumArea));
        System.out.println("QUADRADO: " + String.format("%.3f", squareArea));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));
    }
}
