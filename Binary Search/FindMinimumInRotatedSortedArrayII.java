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

If duplicates block the decision (nums[mid] == nums[end]), we safely reduce end by one, since nums[end] cannot be the unique minimum.

Complexity
Time: Worst case 
𝑂(𝑛)
 (when many duplicates force us to shrink one by one).

Average case: 
𝑂(log𝑛), (like standard binary search).

Space: 
𝑂(1)

*/
