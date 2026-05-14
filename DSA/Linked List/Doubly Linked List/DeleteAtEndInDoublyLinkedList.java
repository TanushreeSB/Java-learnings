class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DeleteAtEndInDoublyLinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // connect new node
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from end
    void deleteFromEnd() {

        // case 1: empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // case 2: only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // unlink last node
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

    // Main method
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        System.out.println("Original List:");
        dll.display();

        dll.deleteFromEnd();

        System.out.println("After Deletion from End:");
        dll.display();
    }
}
