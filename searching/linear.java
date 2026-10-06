import java.util.Scanner;

public class linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target value:");
        int ele = sc.nextInt();
        int target = -1;
        for (int i = 0; i < Size; i++) {
            if (arr[i] == ele) {
                target = i;
                break;
            }
        }
        if (target == -1) {
            System.out.println("The element is not found.");

        } else {
            System.out.println("The element is in the target :" + target);
        }
    }

}