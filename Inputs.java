import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}

/*
output:
Please enter some input: 10
Your roll number is 10
*/
