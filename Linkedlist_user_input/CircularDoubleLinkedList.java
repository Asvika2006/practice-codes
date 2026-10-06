class CircularDoubleLinkedList {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    static void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            n.next = n;
            n.prev = n;
        } else {
            Node last = head.prev;

            n.next = head;
            n.prev = last;
            last.next = n;
            head.prev = n;
        }
    }

    static void delete() {
        if (head == null)
            return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        last.prev.next = head;
        head.prev = last.prev;
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