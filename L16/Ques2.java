import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter an integer");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
