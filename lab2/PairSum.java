import java.util.Scanner;

public class PairSum{
    public static int [] findPairSum(int [] arr, int target){
        for (int i = 0; i <= arr.length - 2; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                if (arr[i] + arr[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target = input.nextInt();

        int[] result = findPairSum(arr, target);


        if(result != null){
            System.out.println("Pair found at indices " + result[0] + " and " + result[1]);
        } else{
            System.out.println("Not found");
        }
    }
}
