public class FinalVariableDemo {
    public static void main(String[] args) {

        final int myNum = 15;   // final variable
        System.out.println("Initial value: " + myNum);

        myNum = 20;  // ❌ Compile-time error
    }
}

/*
If you don't want others (or yourself) to overwrite existing values, 
use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
*/
