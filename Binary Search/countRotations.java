public class RotationCount {

    public static int countRotations(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            // If array is already sorted, smallest is at low
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            // Check if mid is the minimum
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Decide which half to search
            if (arr[mid] <= arr[high]) {
                high = mid - 1; // go left
            } else {
                low = mid + 1;  // go right
            }
        }
        return -1; // should not happen if array is rotated sorted
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("Array rotated " + countRotations(arr) + " times.");
    }
}
