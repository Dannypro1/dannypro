
import java.util.Scanner;
public class SubarraySum {
    public static boolean hasSubarrayWithSum(int[] arr, int target) {
        int n = arr.length;
        int currentSum = 0;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            if (currentSum == target) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);

        int[] arr = {4, 2, 7, 1, 9, 5};
        System.out.println("enter the target ");
        int target = obj.nextInt();

        System.out.println(hasSubarrayWithSum(arr, target));  // Output: true
    }
}