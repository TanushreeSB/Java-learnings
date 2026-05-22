class ReverseBinarySearch {
    // Binary search in descending sorted array
    int binsrch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // found
            } 
            // Notice the condition flips compared to ascending order
            else if (arr[mid] > key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
}

public class Main {
    public static void main(String[] args) {
        // Reverse sorted array
        int arr[] = {20, 17, 15, 10, 8, 5, 2};
        int key = 10;

        ReverseBinarySearch obj = new ReverseBinarySearch();
        int result = obj.binsrch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
