import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element : ");
        r = sc.nextInt();

        for (int i = r; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
