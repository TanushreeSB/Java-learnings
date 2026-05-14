class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DeletionAtEndInDoublyLinkedList {
    Node head;

    // Insert at end
    void insertEnd(int data) {
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

    // Delete at end
    void deleteAtEnd() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.prev.next = null;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        System.out.println("Original List:");
        list.display();

        list.deleteAtEnd();

        System.out.println("After Deletion at End:");
        list.display();
    }
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Insert at end
    void insertEnd(int data) {
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

    // Delete at end
    void deleteAtEnd() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.prev.next = null;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input for nodes
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            list.insertEnd(data);
        }

        System.out.println("\nOriginal List:");
        list.display();

        list.deleteAtEnd();

        System.out.println("\nAfter Deletion at End:");
        list.display();

        sc.close();
    }
}
