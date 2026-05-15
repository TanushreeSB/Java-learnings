import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

// Circular Linked List class
class insertAtPositionINCircularLinkedList {

    Node head;

    // Insert at end (used for building initial list)
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

    // Insert at position
    void insertAtPosition(int data, int pos) {

        Node newNode = new Node(data);

        // insert at beginning
        if (pos == 1) {

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
            head = newNode;

            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        System.out.print("Enter number of initial nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            cll.insertAtEnd(sc.nextInt());
        }

        System.out.println("\nOriginal List:");
        cll.display();

        System.out.print("\nEnter data to insert: ");
        int data = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        cll.insertAtPosition(data, pos);

        System.out.println("\nAfter Insertion at Position:");
        cll.display();

        sc.close();
    }
}
