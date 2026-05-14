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

class InsertATBeginningnDoublyLinkedList {

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Connect new node to old head
        newNode.next = head;

        // Connect old head back to new node
        head.prev = newNode;

        // Move head to new node
        head = newNode;
    }

    // Display forward
    void displayForward() {
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display backward
    void displayBackward() {
        Node temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.displayForward();
        list.displayBackward();
    }
}



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// with user input
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

class DoublyLinkedList {

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Link new node with current head
        newNode.next = head;
        head.prev = newNode;

        // Move head to new node
        head = newNode;
    }

    // Display list forward
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

            list.insertAtBeginning(data);
        }

        // Display list
        list.display();

        sc.close();
    }
}
