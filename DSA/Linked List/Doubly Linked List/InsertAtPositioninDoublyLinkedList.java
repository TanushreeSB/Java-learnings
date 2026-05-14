import java.util.Scanner;

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

class InsertAtPositioninDoublyLinkedList {

    Node head;

    // Insert at end (to create list)
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

    // Insert at specific position
    void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {

            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
            return;
        }

        Node temp = head;

        // Move to previous position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Insert node
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Display list
    void display() {

        Node temp = head;

        System.out.print("Doubly Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        // Create initial list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            list.insertAtEnd(data);
        }

        System.out.println("Before Insertion:");
        list.display();

        // Insert at position
        System.out.print("Enter new data: ");
        int newData = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        list.insertAtPosition(newData, pos);

        System.out.println("After Insertion:");
        list.display();

        sc.close();
    }
}
