class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class insertatbeginning {

    Node head;

    void insertAtBeg(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertend(int data) {
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

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {

        insertatbeginning list = new insertatbeginning();

        list.insertAtBeg(30);
        list.insertAtBeg(20);
        list.insertAtBeg(10);

        list.display();
    }
}