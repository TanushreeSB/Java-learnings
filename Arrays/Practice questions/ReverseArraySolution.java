class ReverseArraySolution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        
        for(int i = 0;i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }   
    }
}
