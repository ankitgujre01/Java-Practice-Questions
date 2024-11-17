import java.util.Scanner;

public class CalcuateSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side;
        System.out.print("Enter Side = ");
        side = scanner.nextDouble();

        System.out.println("Area of Square = " + side*side);
    }
}
