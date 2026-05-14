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
class InsertAtEndinSinglyLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        // Empty list
        if(head == null) {
            head = newNode;
            return;
        }

        // Traversal to last node
        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        // Connect new node
        temp.next = newNode;
    }

    // Traversal / Display
    void display() {

        // temp starts from head
        Node temp = head;

        // Traverse until null
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

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input loop
        for(int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int value = sc.nextInt();

            list.insert(value);
        }

        System.out.println("\nTraversing Linked List:");

        list.display();

        sc.close();
    }
}
