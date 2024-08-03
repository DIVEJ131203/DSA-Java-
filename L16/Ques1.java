import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int no2 = sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int no3 = sc.nextInt();
        System.out.println("Average:" + average(no1, no2, no3));
    }
}

static int average(int x, int y, int z) {
    return (x + y + z) / 3;
}