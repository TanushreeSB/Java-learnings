import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SearchInSinglyLinkedList {

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

    // Search element
    void search(int key) {

        Node temp = head;

        int position = 1;

        while (temp != null) {

            // Element found
            if (temp.data == key) {
                System.out.println("Element found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        // Element not found
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

        System.out.println("\nLinked List:");
        list.display();

        // Search element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        list.search(key);

        sc.close();
    }
}
