import java.util.Scanner;

// Node class
class Node {

    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class InsertATBeginningInSinglyLinkedList {

    Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {

        // Create new node
        Node newNode = new Node(data);

        // Connect new node to current head
        newNode.next = head;

        // Move head to new node
        head = newNode;
    }

    // Display linked list
    public void display() {

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

        System.out.print("How many nodes? ");
        int n = sc.nextInt();

        // Taking user input
        for(int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int value = sc.nextInt();

            list.insertAtBeginning(value);
        }

        System.out.println("\nLinked List:");

        list.display();

        sc.close();
    }
}
