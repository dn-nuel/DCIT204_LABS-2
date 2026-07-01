import java.util.Scanner;

public class FindMax{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("The largest number is " +FindMaxBruteForce(arr));

    }


    public static int FindMaxBruteForce(int [] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
