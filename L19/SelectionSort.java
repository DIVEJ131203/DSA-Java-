import java.util.Scanner;

public class SelectionSort {
    public static void SelectionSortDescending(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int minpos = turn;
            {
                for (int j = turn + 1; j < arr.length; j++) {
                    if (arr[minpos] < arr[j]) {
                        minpos = j;
                    }
                }
            }
            int temp = arr[turn];
            arr[turn] = arr[minpos];
            arr[minpos] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSortDescending(arr);
        sc.close();
    }
}
