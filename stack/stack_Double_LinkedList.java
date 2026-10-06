class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class stack_Double_LinkedList {

    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top.prev = newNode;
            top = newNode;
        }
        System.out.println(data + " inserted");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(top.data + " deleted");
            top = top.next;
            if (top != null) {
                top.prev = null;
            }
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stack_Double_LinkedList s = new stack_Double_LinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack:");
        s.display();
        s.peek();
        s.pop();
        System.out.println("After Delete:");
        s.display();
    }
}