import java.util.Scanner;

public class Ques1 {
    public static int largestSumSubArray(int arr[]) {
        int temp = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (sum > temp) {
                    temp = sum;
                }

            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = largestSumSubArray(arr);
        System.out.println(sum);
        sc.close();
    }
}