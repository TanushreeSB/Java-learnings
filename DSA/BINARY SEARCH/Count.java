import java.util.*;

public class Count {

    public static int firstOcc(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k == arr[mid]) {
                ans = mid;
                end = mid - 1;   // go left
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k == arr[mid]) {
                ans = mid;
                start = mid + 1;  // go right
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int countOcc(int[] arr, int k) {
        int firstcount = firstOcc(arr, k);
        if (firstcount == -1) return 0;

        int lastcount = lastOcc(arr, k);
        return lastcount - firstcount + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int k = 4;

        System.out.println(countOcc(arr, k));
    }
}
