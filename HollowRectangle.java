
import java.util.Scanner;
class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter elements : ");
        r = sc.nextInt();
        c = sc.nextInt();

        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                if(i == 1 || i == r || j ==  1 || j ==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}