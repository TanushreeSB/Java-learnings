class FindMinimumInRotatedSortedAray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Minimum is in right half
                start = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                end = mid;
            }
        }
        return nums[start];
    }
}

/*

Why this works
If nums[mid] > nums[end], the rotation point (and minimum) must be to the right of mid.

Otherwise, the minimum is at mid or to its left.

Loop continues until start == end, which is the minimum index.

👉 This is the standard O(log n) solution for Find Minimum in Rotated Sorted Array (LeetCode 153).

*/
