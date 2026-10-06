class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteAtPosition(int position) {

        if (head == null) {
            return;
        }

        // Delete first node
        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class delete_by_position {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBeg(30);
        list.insertAtBeg(20);
        list.insertAtBeg(10);

        System.out.println("Before deletion:");
        list.display();

        list.deleteAtPosition(1);

        System.out.println("\nAfter deletion:");
        list.display();
    }
}