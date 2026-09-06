import java.util.*;

class KlargestElements {
    public static void main(String[] args) {
        int num[] = {11,33,100,85,66,99};
        int k = 3;

        Arrays.sort(num);
        for(int i=num.length-1;i>=num.length-k;i--){
             System.out.println(num[i]);
        }
       
    }
}
