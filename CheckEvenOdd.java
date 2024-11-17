import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        num = sc.nextInt();

        if(num % 2 != 0){
            System.out.println("Odd = " + num);
        }else{
            System.out.println("even = " + num);
        }
    }
}
