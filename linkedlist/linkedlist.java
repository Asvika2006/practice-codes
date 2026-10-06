class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class linkedlist {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.next = n3;

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.print("null");
    }
}