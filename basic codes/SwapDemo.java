public class SwapDemo {
    public static void main(String[] args){
        
        int m = 9, n = 5;
        System.out.println("Before swapping: m = " + m
                           + ", n = " + n);

        // Step 1: XOR m and n, store result in m
        m = m ^ n;
        
        // Step 2: XOR new m with n to get original m in n
        n = m ^ n;
        
        // Step 3: XOR new m with new n to
        // get original n in m
        m = m ^ n;

        System.out.println("After swapping: m = " + m
                           + ", n = " + n);
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class SwapDemo{
    public static void main(String[] args){
        
        int m = 9, n = 5;
        System.out.println("Before swapping: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}
