import java.util.Scanner;

public class Ques2 {
    public static void prefixMaxSubarraySum(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = prefix[end] - prefix[start - 1];
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Max" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        prefixMaxSubarraySum(arr);

        sc.close();
    }
}
