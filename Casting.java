import java.util.Scanner;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}

/*
output:

30 40
Sum = 70.0

*/

****************************************************************************************************************************************************************************************************

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}

/*
output:

10 30.0
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)

*/
