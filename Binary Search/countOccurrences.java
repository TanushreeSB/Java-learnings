import java.util.*;

public class OccurrenceCounter {

    public static int firstOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1; // go left for first occurrence
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1; // go right for last occurrence
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int countOccurrences(int[] arr, int x) {
        int first = firstOcc(arr, x);
        if (first == -1) return 0; // element not found

        int last = lastOcc(arr, x);
        return (last - first + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
        int x = 2;

        System.out.println("Count = " + countOccurrences(arr, x));
    }
}
