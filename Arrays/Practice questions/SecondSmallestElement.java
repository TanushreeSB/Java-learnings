import java.util.*;

class SecondSmallestElement {
    public static void main(String[] args) {
        int num[] = {11,33,100,85,66,99};

        int second = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i] < smallest) {
                second = smallest;
                smallest = num[i];
            }else if(num[i] < second && num[i] != smallest){
                second = num[i];
            }
        }
        
        System.out.println(second);    
       
    }
}
