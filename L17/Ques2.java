import java.util.Scanner;

public class Ques2 {
    public static int largestNumber(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        int l = largestNumber(num);
        System.out.println("Highest Number " + l);
        sc.close();
    }
}
