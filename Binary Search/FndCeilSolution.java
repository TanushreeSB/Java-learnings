// User function Template for Java
class FndCeilSolution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i] >= x){
                return i;
            }
        }
        return -1;
    }
}

/*

Why Immediate Return?

Since array is sorted:

1 2 4 6 10

the first element satisfying:

arr[i] >= x

is automatically the smallest valid one.

T.C: O(n) S.C: O(1)


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] >= x){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}

/*
T.C: O(log n), S.C: O(1)

Need smallest greater value
→ move LEFT


Why We Store and Continue
ans = mid;
end = mid - 1;

Meaning:

"This is a possible answer,
but let me check if a smaller valid answer exists."
When Can We Directly Return?

Only in linear search:

for(...)

because array is checked from left to right.

The first valid element is automatically the smallest valid one.

But binary search jumps around, so current mid may not be optimal yet.
*/
