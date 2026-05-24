class SolutionSearchinRotatedSortedArrays {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot = findPivot(nums);

        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binSearch(nums, pivot, n - 1, target);
        } else {
            return binSearch(nums, 0, pivot - 1, target);
        }

    }

    public int binSearch(int[] nums,int start,int end, int target) {
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

}

/*
Approach:
A rotated sorted array is basically two sorted subarrays joined together.
So the idea is:

Find the pivot — the index of the smallest element.
This tells us where the rotation happened.
After finding the pivot, the array becomes:
A sorted left half
A sorted right half
Now we can perform a normal binary search on the correct half where the target could lie.
By combining these two binary searches, we efficiently find the target in logarithmic time.

Time & Space Complexity
Time complexity:  O(logn)

Space complexity: O(1)



Why nums[mid] > nums[end]
If nums[mid] > nums[end], it means the smallest element must be to the right of mid.
Example: [4,5,6,7,0,1,2] → mid=3 (7), end=6 (2) → 7 > 2, so pivot is in the right half.

Otherwise, the pivot is in the left half (including mid).
Example: [4,5,6,7,0,1,2] → mid=5 (1), end=6 (2) → 1 <= 2, so pivot is at or before mid.

This way, we don’t need to check neighbors — the comparison with end alone is enough to guide the search.


🔄 Why while(start < end) in pivot
Pivot search is about converging until start == end.

If you used <=, the loop would overshoot.

With <, the loop stops exactly when both pointers meet at the pivot index.


🧪 Dry Run: [4,5,6,7,0,1,2]
start=0, end=6, mid=3 → nums[3]=7, nums[6]=2 → 7>2 → start=4

start=4, end=6, mid=5 → nums[5]=1, nums[6]=2 → 1<=2 → end=5

start=4, end=5, mid=4 → nums[4]=0, nums[5]=1 → 0<=1 → end=4

Now start=4, end=4 → pivot found at index 4.

*/

