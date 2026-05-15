class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class insertAtBeginningInCircularLinkedList {

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // move to last node
        while (temp.next != head) {
            temp = temp.next;
        }

        // last node points to new node
        temp.next = newNode;

        // new node points to old head
        newNode.next = head;

        // update head
        head = newNode;
    }

    // Display
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

    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtBeginning(30);
        cll.insertAtBeginning(20);
        cll.insertAtBeginning(10);

        cll.display();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

// with user input
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // move to last node
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CircularLinkedList cll = new CircularLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            cll.insertAtBeginning(data);
        }

        System.out.println("Circular Linked List:");
        cll.display();

        sc.close();
    }
}
