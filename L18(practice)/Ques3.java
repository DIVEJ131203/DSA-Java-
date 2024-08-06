import java.util.Scanner;

public class Ques3 {
    public static void maxProfit(int arr[]) {
        int low = 0;
        int temp = 0, temp1 = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (temp > arr[i]) {
                temp1 = arr[i];
            }
            for (int j = i; j < arr.length; j++) {
                if (temp1 > arr[j]) {
                    low = arr[j];
                }
            }
        }
        int profit = temp1 - low;
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of Array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        maxProfit(arr);
    }
}
