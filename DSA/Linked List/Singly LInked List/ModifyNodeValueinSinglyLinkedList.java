import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ModifyNodeValueinSinglyLinkedList {

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

    // Modify node value
    void modify(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            // Element found
            if (temp.data == oldValue) {

                temp.data = newValue;

                System.out.println("Node modified");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Element not found");
    }

    // Display linked list
    void display() {

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

        // Modify values
        System.out.print("\nEnter old value: ");
        int oldValue = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        list.modify(oldValue, newValue);

        System.out.println("\nUpdated Linked List:");
        list.display();

        sc.close();
    }
}
