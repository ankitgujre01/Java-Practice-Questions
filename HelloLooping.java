import java.util.Scanner;

public class HelloLooping {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        str = scanner.nextLine();

        for (int i = 1; i < 11 ; i++) {
            System.out.println(str);
        }
    }
}
