// Floor means: Greatest element ≤ x

class FloorSolution {
    public int findFloor(int[] arr, int x) {

        int ans = -1;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] <= x) {
                ans = i;
            }
            else {
                break; // floor cannot exist further because array is sorted.
            }
        }

        return ans;
    }
}

// TC → O(n) , SC → O(1)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int findFloor(int[] arr, int x) {

        int start = 0, end = arr.length - 1;
        int ans = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] <= x) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}

// TC → O(log n), SC → O(1)
