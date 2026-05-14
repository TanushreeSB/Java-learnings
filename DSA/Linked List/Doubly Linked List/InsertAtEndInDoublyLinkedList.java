import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class InsertAtEndInDoublyLinkedList {

    Node head;

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node with new node
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display list
    void display() {

        Node temp = head;

        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // User input
        for (int i = 0; i < n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            list.insertAtEnd(data);
        }

        // Display list
        list.display();

        sc.close();
    }
}
