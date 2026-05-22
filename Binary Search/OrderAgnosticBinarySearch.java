class OrderAgnosticBinarySearch {
    int orderAgnosticBinarySearch(int arr[], int n, int target) {
        int left = 0, right = n - 1;

        // Detect order of array
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            // If array is ascending
            if (isAscending) {
                if (target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // If array is descending
            else {
                if (target > arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }

        return -1; // Not found
    }
}

public class Main {
    public static void main(String[] args) {
        OrderAgnosticBinarySearch obj = new OrderAgnosticBinarySearch();

        // Example 1: Ascending array
        int ascArr[] = {2, 4, 6, 8, 10, 12};
        int ascKey = 8;
        System.out.println("Ascending array: Element " + ascKey +
                           " found at index " + obj.orderAgnosticBinarySearch(ascArr, ascArr.length, ascKey));

        // Example 2: Descending array
        int descArr[] = {20, 15, 10, 5, 2};
        int descKey = 10;
        System.out.println("Descending array: Element " + descKey +
                           " found at index " + obj.orderAgnosticBinarySearch(descArr, descArr.length, descKey));
    }
}
