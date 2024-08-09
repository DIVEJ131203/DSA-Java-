
import java.util.Scanner;

public class Question3 {
    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
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
        transpose(arr);
        System.out.println(arr);
        sc.close();
    }

}
