import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("X is positive");
        } else {
            System.out.println("X is Negative");
        }
        sc.close();
    }
}
