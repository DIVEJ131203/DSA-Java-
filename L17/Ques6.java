import java.util.Scanner;

public class Ques6 {
    public static void subArrayContinous(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = temp; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        subArrayContinous(num);
        sc.close();
    }
}
