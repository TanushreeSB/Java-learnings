public class ScopeDemo {
  public static void main(String[] args) {

    for (int i = 0; i < 3; i++) {
      System.out.println("Loop 1: " + i);
    }

    for (int i = 0; i < 2; i++) {
      System.out.println("Loop 2: " + i);
    }
  }
}


/*

Loop variables are not available outside the loop.
We can safely reuse the same variable name (i, j, etc.) in different loops in the same method

Output:
Loop 1: 0
Loop 1: 1
Loop 1: 2
Loop 2: 0
Loop 2: 1

*/
