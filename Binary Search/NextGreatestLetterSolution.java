class NextGreatestLetterSolution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i] > target){
                ans = letters[i];
                break;
            }
        }
        return ans;   
    }
}

______________________________________________________________________________________________________________________________________________________________________________________________________________________________

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        char ans = letters[0];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                ans = letters[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
