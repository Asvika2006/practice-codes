import java.util.Scanner;

public class stack_user_input {

    int stack[];
    int top = -1;

    stack_user_input(int size) {
        stack = new int[size];
    }

    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top: " + stack[top]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        stack_user_input s = new stack_user_input(size);

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            s.push(data);
        }

        s.peek();
        s.pop();
        s.peek();
    }
}