// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class FactorialExample {
    public static void main(String[] args) {
        int n=5;
        int fact = 1;
        for(int i=n;i>=1;i--){
             fact = i*fact;
        }
        // 5*4*3*2*1
        System.out.println("Factorial of " + n + " is: " + fact);   
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// With Recursion

public class Main {
  static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println("Factorial of 5 is " + factorial(5));
  }
}
