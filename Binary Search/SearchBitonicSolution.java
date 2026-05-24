class SearchBitonicSolution {

    // ascending binary search
    static int binarySearchAsc(int[] arr, int low, int high, int key) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // descending binary search
    static int binarySearchDesc(int[] arr, int low, int high, int key) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // find peak element
    static int findPeak(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            else {
                high = mid;
            }
        }

        return low;
    }

    public static int searchBitonic(int[] arr, int key) {

        int peak = findPeak(arr);

        // search in increasing part
        int left = binarySearchAsc(arr, 0, peak, key);

        if (left != -1) {
            return left;
        }

        // search in decreasing part
        return binarySearchDesc(arr, peak + 1, arr.length - 1, key);
    }
}
