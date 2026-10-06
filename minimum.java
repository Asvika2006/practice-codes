import java.util.Scanner;

public class minimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
