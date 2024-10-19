public class FindMax {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 3, 6};
        int maximum = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }

        }
        System.out.println("Maximum element = " + maximum);
    }
}
