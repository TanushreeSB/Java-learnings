class FindpeakIndexInMountainArraySolution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        int start = 0,end = n-1;
        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}

/*

Use binary search to check whether mid is in the increasing or decreasing part of the mountain array and move toward the peak accordingly.
Time Complexity: O(log n)
Space Complexity: O(1)

*/
