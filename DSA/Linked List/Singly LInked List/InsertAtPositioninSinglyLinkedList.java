import java.util.Scanner;

// Node class
class Node {

    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class InsertAtPositioninSinglyLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if(head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;
    }

    // Insert at specific position
    void insertAtPosition(int data, int position) {

        // Create new node
        Node newNode = new Node(data);

        // Insert at beginning
        if(position == 1) {

            newNode.next = head;

            head = newNode;

            return;
        }

        // Traverse to node before position
        Node temp = head;

        for(int i = 1; i < position - 1; i++) {

            temp = temp.next;
        }

        // Connect nodes
        newNode.next = temp.next;

        temp.next = newNode;
    }

    // Display linked list
    void display() {

        Node temp = head;

        while(temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        // Number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input
        for(int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int value = sc.nextInt();

            list.insert(value);
        }

        // Display original list
        System.out.println("\nOriginal Linked List:");

        list.display();

        // Insert at position
        System.out.print("\nEnter new data: ");
        int data = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        list.insertAtPosition(data, position);

        // Display updated list
        System.out.println("\nLinked List After Insertion:");

        list.display();

        sc.close();
    }
}
