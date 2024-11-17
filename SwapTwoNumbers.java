import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number :");
        num1 = scanner.nextInt();
        System.out.println("Enter second Number : ");
        num2 = scanner.nextInt();

        System.out.println("before Swapping " + "first number = " + num1 + " second number = "+ num2);

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap " + "first number = " + num1 + " second number = " + num2);
    }
}
