import java.util.Scanner;

public class Ques5 {
    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + temp + "," + arr[j] + ")");
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
        subArray(num);
        sc.close();
    }
}
