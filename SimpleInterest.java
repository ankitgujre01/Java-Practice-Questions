import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        double principle, rate, time, si;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle : ");
        principle = sc.nextDouble();
        System.out.println("Enter Rate : ");
        rate = sc.nextDouble();
        System.out.println("Enter Time : ");
        time = sc.nextDouble();

        si = principle * rate * time / 100;

        System.out.println("Simple Interest = " + si);
    }

}
