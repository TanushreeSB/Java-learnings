class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int n = nums.length;

        int start = 0,end = n-1;
        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }else{
                end--;
            }
        }
        return nums[end];
    }
}

/*

Why this works
If the right half is sorted (nums[mid] < nums[end]), the minimum must be in the left half (including mid).

If the left half is sorted (nums[mid] > nums[end]), the minimum must be in the right half.

If duplicates block the decision (nums[mid] == nums[end]), we safely reduce end by one.
But if nums[mid] == nums[end], we cannot decide which side contains the minimum.

Example:

Code
nums = [2, 2, 2, 0, 1]
At some point, mid and end both point to 2.

The minimum could still be to the left (where 0 is).

Or it could be at end itself.
Since we can’t tell, we safely shrink the search space by doing end--.

This way, we don’t lose the minimum, but we reduce the ambiguity caused by duplicates.

Complexity
Time: Worst case 
𝑂(𝑛)
 (when many duplicates force us to shrink one by one).

Average case: 
𝑂(log𝑛), (like standard binary search).

Space: 
𝑂(1)

*/
