import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head;

    void createList(int size, Scanner sc) {
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            Node newNode = new Node(n);
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;

                while (temp.next != head) {
                    temp = temp.next;
                }

                temp.next = newNode;
                newNode.next = head;
            }
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void insertAtValue(int data, int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        do {
            if (temp.data == value) {

                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println("Value not found");
    }

    // DELETE AT BEGINNING
    void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    // DELETE AT END
    void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    // DELETE AT POSITION
    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        if (temp.next == head) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }

    // DELETE BY VALUE
    void deleteAtValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        do {

            if (temp.next.data == value) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println("Value not found");
    }

    // UPDATE BY VALUE
    void update(int oldValue, int newValue) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {

            if (temp.data == oldValue) {

                temp.data = newValue;
                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println("Value not found");
    }

    // UPDATE BY POSITION
    void updateAtPosition(int position, int newValue) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        temp.data = newValue;
    }

    // REVERSE
    void reverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next;

        do {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        } while (current != head);

        head.next = prev;
        head = prev;
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Enter the size of the list:");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        list.createList(size, sc);

        System.out.println("\nOriginal List:");
        list.display();

        // INSERT AT BEGINNING
        System.out.println("\nEnter element to insert at beginning:");
        int data = sc.nextInt();

        list.insertAtBeginning(data);

        System.out.println("After insertion at beginning:");
        list.display();

        // INSERT AT END
        System.out.println("\nEnter element to insert at end:");
        data = sc.nextInt();

        list.insertAtEnd(data);

        System.out.println("After insertion at end:");
        list.display();

        // INSERT AT POSITION
        System.out.println("\nEnter element and position:");
        data = sc.nextInt();
        int position = sc.nextInt();

        list.insertAtPosition(data, position);

        System.out.println("After insertion at position:");
        list.display();

        // INSERT AFTER VALUE
        System.out.println("\nEnter element and value after which to insert:");
        data = sc.nextInt();
        int value = sc.nextInt();

        list.insertAtValue(data, value);

        System.out.println("After insertion after value:");
        list.display();

        // DELETE AT BEGINNING
        list.deleteAtBeginning();

        System.out.println("\nAfter deleting beginning:");
        list.display();

        // DELETE AT END
        list.deleteAtEnd();

        System.out.println("After deleting end:");
        list.display();

        // DELETE AT POSITION
        System.out.println("\nEnter position to delete:");
        position = sc.nextInt();

        list.deleteAtPosition(position);

        System.out.println("After deleting position:");
        list.display();

        // DELETE BY VALUE
        System.out.println("\nEnter value to delete:");
        value = sc.nextInt();

        list.deleteAtValue(value);

        System.out.println("After deleting value:");
        list.display();

        // UPDATE BY VALUE
        System.out.println("\nEnter old value and new value:");
        int oldValue = sc.nextInt();
        int newValue = sc.nextInt();

        list.update(oldValue, newValue);

        System.out.println("After update:");
        list.display();
        System.out.println("\nEnter position and new value:");
        position = sc.nextInt();
        newValue = sc.nextInt();

        list.updateAtPosition(position, newValue);

        System.out.println("After update at position:");
        list.display();
        list.reverse();

        System.out.println("\nAfter reverse:");
        list.display();

        sc.close();
    }
}