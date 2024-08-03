import java.util.Scanner;

public class Ques3 {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        System.out.println("Enter 10 numbers in array");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter key");
        int key;
        key = sc.nextInt();
        int temp = binarySearch(num, key);
        System.out.println("index " + temp);
        sc.close();
    }
}
