import java.util.Scanner;

public class selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
