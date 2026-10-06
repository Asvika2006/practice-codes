class CircularSIngleLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    static void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = n;
            n.next = head;
        }
    }

    static void delete() {
        if (head == null)
            return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != head)
            temp = temp.next;

        temp.next = head;
    }

    static void display() {
        if (head == null)
            return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        delete();
        display();
    }
}