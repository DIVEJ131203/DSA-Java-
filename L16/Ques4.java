import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        int sum = sumofdigits(num);
        System.out.println(sum);
        sc.close();
    }

    public static int sumofdigits(int number) {
        int sum = 0;
        int temp = 0;
        while (number != 0) {
            temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
        return sum;
    }
}
