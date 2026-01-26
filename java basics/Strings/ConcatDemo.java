public class ConcatDemo {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        int age = 25;

        // Using concat() and + together
        String fullName = firstName.concat(" ").concat(lastName);
        String result = "My name is " + fullName + " and I am " + age + " years old.";

        System.out.println(result);
    }
}

/*
output:
My name is John Doe and I am 25 years old.

This example clearly shows:
concat() → joining strings
+ operator → mixing strings and variables

*/
