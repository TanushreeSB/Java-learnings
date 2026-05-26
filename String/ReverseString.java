public class ReverseString {
    public static void main(String[] args) {
        
        String name = "Tanushree borase";
        
        // Reverse using StringBuilder
        String reversed = new StringBuilder(name).reverse().toString();
        
        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversed);
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;

public class ReverseUsingCollection {
    public static void main(String[] args) {

        String name = "Tanushree borase";

        // Convert string to ArrayList of characters
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : name.toCharArray()) {
            list.add(ch);
        }

        // Reverse using Collections
        Collections.reverse(list);

        // Convert back to string
        StringBuilder reversed = new StringBuilder();

        for (char ch : list) {
            reversed.append(ch);
        }

        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversed);
    }
}
