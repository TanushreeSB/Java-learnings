import java.util.*;

class Main {
    
    public static int linearSearch(int arr[], int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int target = 5;
        
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
}

// Linear search is a searching algorithm in which each element of the array is checked one by one from the beginning to the end until the target element is found or the list ends
// T.C: O(n) S.C: O(1)
