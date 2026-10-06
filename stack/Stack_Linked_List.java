import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack_Linked_List {

    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack_Linked_List s = new Stack_Linked_List();

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            s.push(data);
        }

        System.out.println("Stack:");
        s.display();

        s.peek();

        s.pop();

        System.out.println("After pop:");
        s.display();

        s.peek();
    }
}