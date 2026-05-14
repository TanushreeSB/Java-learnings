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

class DeleteAtPositionInDoublyLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Move till last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect nodes
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at specific position
    void deleteAtPosition(int position) {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {

            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            System.out.println("Node deleted");
            return;
        }

        Node temp = head;

        // Move to required position
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        // Connect previous node to next node
        temp.prev.next = temp.next;

        // Connect next node back to previous node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        System.out.println("Node deleted");
    }

    // Display forward
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            list.insert(data);
        }

        System.out.println("\nOriginal Doubly Linked List:");
        list.display();

        // Delete position
        System.out.print("\nEnter position to delete: ");
        int position = sc.nextInt();

        list.deleteAtPosition(position);

        System.out.println("\nAfter Deletion:");
        list.display();

        sc.close();
    }
}
