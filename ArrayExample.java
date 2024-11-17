import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the numbers
        System.out.println("\nThe numbers you entered are:");
        for (int num : numbers) {
            System.out.print(num + "\t");
        }

        scanner.close();
    }
}
