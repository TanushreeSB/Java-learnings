/* Binary Search is an efficient searching algorithm used to find the position of a target element in a sorted array.
It works by repeatedly dividing the search interval in half:

Compare the target with the middle element.

If equal → return the index.

If smaller → search the left half.

If larger → search the right half.

Continue until the element is found or the interval becomes empty.

T.C: 𝑂(log𝑛) Even if the element is not present, the array keeps halving until empty.
S.C: O(1)
*/

import java.util.Scanner;

class BinarySearchCode {
    // Binary search method
    int binsrch(int arr[], int key) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // return index if found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // return -1 if not found
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = scan.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter " + num + " sorted elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = scan.nextInt();

        BinarySearchCode obj = new BinarySearchCode();
        int result = obj.binsrch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        scan.close();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class BinarySearchCode {
    // Binary search method
    int binsrch(int arr[], int key) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // return index if found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // return -1 if not found
    }
}

public class Main {
    public static void main(String[] args) {
        // Hardcoded sorted array
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        
        // Key to search
        int key = 10;

        BinarySearchCode obj = new BinarySearchCode();
        int result = obj.binsrch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class BinarySearchCode {
    // Binary search method
    static int binsrch(int arr[], int key) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // return index if found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        // Hardcoded sorted array
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        
        // Key to search
        int key = 10;

        //BinarySearchCode obj = new BinarySearchCode();
        int result = binsrch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
