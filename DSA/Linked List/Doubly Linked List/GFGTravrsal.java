// Java Program for Forward Traversal (Iterative) of
// Doubly Linked List

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class GFGTravrsal {

    // Function to traverse the doubly linked list in
    // forward direction
    static void forwardTraversal(Node head) {
        Node curr = head;

        while (curr != null) {
          
            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Forward Traversal: ");
        forwardTraversal(head);
    }
}
