import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class AllCasesDeletionInCircularLinkedList {

    Node head;

    // Insert at end
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

    // Insert at beginning
    void insertAtBeginning(int data) {

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
        head = newNode;
    }

    // Delete at beginning
    void deleteAtBeginning() {

        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    // Delete at end
    void deleteAtEnd() {

        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    // Delete at position
    void deleteAtPosition(int pos) {

        if (head == null) return;

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Node del = temp.next;

        if (del == head) return;

        temp.next = del.next;
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

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        while (true) {

            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Delete at End");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at Position");
            System.out.println("6. Display");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    cll.insertAtEnd(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    cll.insertAtBeginning(sc.nextInt());
                    break;

                case 3:
                    cll.deleteAtEnd();
                    break;

                case 4:
                    cll.deleteAtBeginning();
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    cll.deleteAtPosition(sc.nextInt());
                    break;

                case 6:
                    cll.display();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
