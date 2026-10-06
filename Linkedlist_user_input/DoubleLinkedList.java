import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int n) {
        this.data = n;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList {
    Node head;

    void createList(int Size, Scanner sc) {
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
                newNode.prev = temp;
            }
        }
    }

    void DisplayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void DisplayBackward() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
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
        newNode.prev = temp;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAfterValue(int data, int value) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    void deleteAtEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    void update(int oldValue, int newValue) {
        Node temp = head;
        while (temp != null && temp.data != oldValue) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        temp.data = newValue;
    }

    void updateAtPosition(int position, int newValue) {
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.data = newValue;
    }

    void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        list.createList(size, sc);
        System.out.println("Display Forward: ");
        list.DisplayForward();
        System.out.println("Display Backward: ");
        list.DisplayBackward();
        list.insertAtBeginning(10);
        list.insertAtEnd(50);
        list.insertAtPosition(25, 3);
        list.insertAfterValue(35, 30);
        System.out.println("After Insertions: ");
        list.DisplayForward();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(2);
        list.deleteByValue(30);
        list.update(25, 26);
        list.updateAtPosition(2, 27);
        list.reverse();
        list.DisplayForward();
        // You can call other methods here to test insert, delete, and update operations
    }
}