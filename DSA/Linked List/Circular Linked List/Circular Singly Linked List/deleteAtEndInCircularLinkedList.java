class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class deleteAtEndInCircularLinkedList {

    Node head;

    void deleteAtEnd() {

        if (head == null) return;

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

    void display() {

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        cll.head.next = second;
        second.next = third;
        third.next = cll.head;

        System.out.println("Before deletion:");
        cll.display();

        cll.deleteAtEnd();

        System.out.println("After deletion at end:");
        cll.display();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// with user input

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class CircularLinkedList {

    Node head;

    void insert(int data) {

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

    void deleteAtEnd() {

        if (head == null) return;

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

    void display() {

        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            cll.insert(sc.nextInt());
        }

        System.out.println("Before deletion:");
        cll.display();

        cll.deleteAtEnd();

        System.out.println("After deletion at end:");
        cll.display();

        sc.close();
    }
}
