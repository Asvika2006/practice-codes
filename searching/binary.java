import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target value");
        int ele = sc.nextInt();
        int Left = 0;
        int Right = Size - 1;
        int target = -1;
        while (Left <= Right) {
            int mid = (Left + Right) / 2;
            if (arr[mid] == ele) {
                target = mid;
                break;
            } else if (arr[mid] < ele) {
                Left = mid + 1;
            } else {
                Right = mid - 1;
            }
        }
        if (target == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element is in the index:" + target);
        }

    }
}