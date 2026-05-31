import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortExample {

    public static List<Integer> quick_sort(List<Integer> arr) {
        // Base case: lists with 0 or 1 elements are already sorted
        if (arr.size() <= 1) {
            return arr;
        }
        
        int pivotIndex = arr.size() - 1; // Last element as pivot
        int pivot = arr.get(pivotIndex);
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        // Partitioning
        for (int i = 0; i < pivotIndex; i++) {
            if (arr.get(i) <= pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }
        
        // Combine results
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(quick_sort(left));
        sorted.add(pivot);
        sorted.addAll(quick_sort(right));
        
        return sorted;
    }

    // Main method to test your implementation
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        
        System.out.println("Original List: " + data);
        List<Integer> sortedData = quick_sort(data);
        System.out.println("Sorted List:   " + sortedData);
    }
}
