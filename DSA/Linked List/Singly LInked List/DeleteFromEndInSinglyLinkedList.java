import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DeleteFromEndInSinglyLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            // Move till last node
            while (temp.next != null) {
                temp = temp.next;
            }

            // Connect last node to new node
            temp.next = newNode;
        }
    }

    // Delete from end
    void deleteFromEnd() {

        // Check if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node is present
        if (head.next == null) {
            head = null;
            System.out.println("Node deleted");
            return;
        }

        // Move to second last node
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.next = null;

        System.out.println("Last node deleted");
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

        // Delete last node
        list.deleteFromEnd();

        System.out.println("\nAfter Deletion:");
        list.display();

        sc.close();
    }
}
