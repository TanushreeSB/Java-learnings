import java.util.*;

class LargestElement {
    public static void main(String[] args) {
        int num[] = {70,90,30,40,50};

        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class LargestElement {
    public static void main(String[] args) {
       int largest = 0;
       int arr[] = {11,22,45,70,90};

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
           }        
        }
        System.out.println(largest);
    }
}
