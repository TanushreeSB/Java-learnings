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

class DeleteAtFrontInDoublyLinkedList {
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

    // Delete at beginning
    void deleteAtBeginning() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Move head to next node
        head = head.next;

        // Make prev of new head null
        if (head != null) {
            head.prev = null;
        }
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

        list.deleteAtBeginning();

        System.out.println("After Deletion at Beginning:");
        list.display();
    }
}
