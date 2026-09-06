import java.util.*;

class SecondLargest {
    public static void main(String[] args) {
        int num[] = {11,33,44,85,66,99};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i=0;i<num.length;i++){
            if(num[i] > largest){
                second = largest;
                largest = num[i];
            } else if(num[i] > second) {
                  second = num[i];          
            }
        }

        System.out.println(second);
    }
}
