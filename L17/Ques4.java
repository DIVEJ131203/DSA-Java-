import java.util.Scanner;

public class Ques4 {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        System.out.println("Enter 10 numbers in array");
        reverse(num);
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
        sc.close();
    }
}