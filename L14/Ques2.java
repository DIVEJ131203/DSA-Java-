import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int fac = 1;
        for (int i = 1; i < num + 1; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
        sc.close();
    }
}