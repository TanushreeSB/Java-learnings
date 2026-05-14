import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DeletionAtPositioninSinglyLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Delete from position
    void deleteFromPosition(int position) {

        // Check if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            System.out.println("Node deleted");
            return;
        }

        Node temp = head;

        // Move to node before position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Delete node
        temp.next = temp.next.next;

        System.out.println("Node deleted");
    }

    // Display linked list
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            list.insert(data);
        }

        System.out.println("\nOriginal Linked List:");
        list.display();

        // Position input
        System.out.print("\nEnter position to delete: ");
        int position = sc.nextInt();

        list.deleteFromPosition(position);

        System.out.println("\nAfter Deletion:");
        list.display();

        sc.close();
    }
}
