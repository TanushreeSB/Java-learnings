/************************************************************

    Following is the class structure:

    class Node {
        int data;
        Node next;
        Node child;

        Node() {
            this.data = 0;
            this.next = null;
            this.child = null;
        }
    }

************************************************************/

public class FlattenALinkedListSolution {

    // Merge two sorted child lists
    private static Node merge(Node a, Node b) {

        Node dummy = new Node();
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.data < b.data) {

                temp.child = a;
                a = a.child;

            } else {

                temp.child = b;
                b = b.child;
            }

            temp = temp.child;
            temp.next = null;
        }

        if (a != null) {
            temp.child = a;
        }

        if (b != null) {
            temp.child = b;
        }

        return dummy.child;
    }

    public static Node flattenLinkedList(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Flatten right side
        head.next = flattenLinkedList(head.next);

        // Merge current and right
        head = merge(head, head.next);

        return head;
    }
}
