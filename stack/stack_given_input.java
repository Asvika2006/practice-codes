import java.util.Scanner;

public class stack_given_input {
    int[] stack = new int[5];
    int top = -1;

    void push(int data) {
        if (top == 4) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Deleted element is:" + stack[top]);
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is:" + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        stack_given_input s = new stack_given_input();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
