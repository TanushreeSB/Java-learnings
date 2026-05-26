// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class SecondMax {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(10);
        list.add(29);
        list.add(30);
        
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        
        for(int num:list){
            if(num > max){
                secondmax = max;
                max = num;
            }
            else if(num > secondmax && num < max){
                secondmax = num;
            }
        }
        
        System.out.println(secondmax);
    }
}
