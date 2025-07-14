import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit name (e.g., Mango, Apple, Orange, Grapes): ");
        String fruit = input.nextLine(); // Read the fruit name

        // Make it case-insensitive for better user experience
        String lowerCaseFruit = fruit.toLowerCase();

        switch (lowerCaseFruit) {
            case "mango":
                System.out.println("King of fruits");
                break; // Exit the switch after this case
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "grapes": // Case for "Grapes"
                System.out.println("Small fruit");
                break;
            default: // If none of the above cases match
                System.out.println("Please enter a valid fruit");
                // No break needed for default if it's the last case
        }
        input.close();
    }
}
