public class StringMethodsDemo {

    public static void main(String[] args) {

        // 1. Creating a String
        // A String stores text inside double quotes
        String greeting = "Hello";
        System.out.println("Greeting: " + greeting);

        // --------------------------------------------------

        // 2. Finding the length of a String
        // length() returns the total number of characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Length of alphabet string: " + alphabet.length());

        // --------------------------------------------------

        // 3. Converting to Uppercase and Lowercase
        // toUpperCase() converts all letters to capital letters
        // toLowerCase() converts all letters to small letters
        String message = "Hello World";
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // --------------------------------------------------

        // 4. Finding a word or character position
        // indexOf() returns the index of the first occurrence of text
        // Index starts from 0
        String sentence = "Please locate where 'locate' occurs!";
        System.out.println("Index of 'locate': " + sentence.indexOf("locate"));

        // --------------------------------------------------

        // 5. Accessing a character using charAt()
        // charAt(index) returns the character at the given position
        String word = "Hello";
        System.out.println("Character at index 0: " + word.charAt(0));
        System.out.println("Character at index 4: " + word.charAt(4));

        // --------------------------------------------------

        // 6. Comparing Strings
        // equals() compares the content of two strings
        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println("txt1 equals txt2: " + txt1.equals(txt2));
        System.out.println("txt3 equals txt4: " + txt3.equals(txt4));

        // --------------------------------------------------

        // 7. Removing whitespace
        // trim() removes spaces from the beginning and end of a string
        String spacedText = "   Hello World   ";
        System.out.println("Before trim: [" + spacedText + "]");
        System.out.println("After trim:  [" + spacedText.trim() + "]");
    }
}
