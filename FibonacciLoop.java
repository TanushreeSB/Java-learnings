import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative number of terms.");
            return;
        }

        if (n == 0) {
            System.out.println("Fibonacci Series: (empty)");
            return;
        }

        if (n == 1) {
            System.out.println("Fibonacci Series: 0");
            return;
        }

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println(); // New line at the end
        input.close();
    }
}
