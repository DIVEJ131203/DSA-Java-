import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + i * num);
        }
        sc.close();
    }

}
