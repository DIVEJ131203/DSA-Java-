import java.util.Scanner;

public class Question2 {
    public static int secondRowSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int num = secondRowSum(arr);
        System.out.println(num);
        sc.close();
    }
}
