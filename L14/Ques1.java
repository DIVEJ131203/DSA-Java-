import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.println("Enter Number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum = evensum + number;
            } else {
                oddsum = oddsum + number;
            }
            System.out.println("Do you want to continue(1) else 0");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("ODD0: " + oddsum);
        System.out.println("EVEN: " + evensum);
        sc.close();
    }

}