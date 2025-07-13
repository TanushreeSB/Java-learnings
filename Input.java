import java.util.Scanner;

public class Input {
    public static void Input(String[] args) {
        Scanner sc = new Scanner(System.in);  // To take input

        System.out.print("Enter something: ");
        String input = sc.nextLine();         // Read user input

        System.out.println("You entered: " + input);  // Print it

        sc.close();  // Close Scanner
    }
}


/*

output:

Enter something: tanu
You entered: tanu

*/

/*

Scanner sc = new Scanner(System.in);
🔹 Scanner
This is the class name from Java’s standard library (java.util.Scanner) that helps you read input (like from keyboard, files, etc.).

🔹 sc
This is the name of the variable (you can name it anything, like input, reader, etc.).
Here, sc is just a short name we’re using to represent the Scanner object.

🔹 =
This is the assignment operator. It assigns the object on the right-hand side to the variable on the left-hand side.

🔹 new
This is a keyword in Java that is used to create a new object (in this case, a new Scanner object).

🔹 new Scanner(...)
This part creates a new instance (object) of the Scanner class.

🔹 System.in
This is a built-in input stream that refers to the keyboard input (standard input).
System is a predefined class, and in is a static field of type InputStream.

*/
