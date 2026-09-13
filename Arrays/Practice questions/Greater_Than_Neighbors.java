class Greater_Than_Neighbors {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 7, 3, 6, 4};

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}

/*
“Elements with At Least Two Significant Neighbors” you mean an element is significant when it is greater than both its immediate neighbors
*/
