import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        int a = 23_00_000; // here _ ignored we can't write comma
        System.out.println(a);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

/*
output:
Please enter some input: 10
Your roll number is 10
2300000

564.6758463 (keyboard input)
564.67584 ( here we get floating point error )

10 ( if we give 10 as keyboard inout then 10.0 as output beacuse of float: Type casting)
10.0
*/
