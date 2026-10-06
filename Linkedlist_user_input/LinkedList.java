import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int n) {
        data = n;
        next = null;
    }
}

public class LinkedList {
    Node head;

    void createlist(int Size, Scanner sc) {
        for (int i = 0; i < Size; i++) {
            int n = sc.nextInt();
            Node newNode = new Node(n);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void insertatbeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertatend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    void insertatposition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (position == 1) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertatvalue(int data, int value) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.data != value) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteatbeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void deleteatend() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteatposition(int position) {
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    void deleteatvalue(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    void update(int oldValue, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
    }

    void updateatposition(int position, int newValue) {
        if (head == null) {
            return;
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        temp.data = newValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter Size:");
        int Size = sc.nextInt();
        System.out.println("Enter Element:");
        list.createlist(Size, sc);
        // list.insertatbeginning(10);
        list.insertatend(20);
        // list.insertatposition(30, 2);
        // list.insertatvalue(30,20);
        // list.deleteatbeginning();
        list.deleteatend();
        // list.deleteatposition(2);
        // list.deleteatvalue(30);
        // list.update(30,40);
        // list.updateatposition(2,50);
        list.display();
    }
}