// Following is a simple program to demonstrate
// syntax of Nested Switch Statements.
import java.io.*;

class NestedSwitchCase {

    public static void main (String[] args)
    {
        int x = 1, y = 2;
    
        // Outer Switch
        switch (x) {
    
        // If x == 1
        case 1:
    
            // Nested Switch
    
            switch (y) {
    
            // If y == 2
            case 2:
                System.out.println("Choice is 2");
                break;
    
            // If y == 3
            case 3:
                System.out.println("Choice is 3");
                break;
            }
            break;
    
        // If x == 4
        case 4:
            System.out.println("Choice is 4");
            break;
    
        // If x == 5
        case 5:
            System.out.println("Choice is 5");
            break;
    
        default:
            System.out.println("Choice is other than 1, 2 3, 4, or 5");
            
        }
    }
}
