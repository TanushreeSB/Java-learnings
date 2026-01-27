public class JavaMathDemo {
    public static void main(String[] args) {

        // Max and Min
        System.out.println("Max of 5 and 10: " + Math.max(5, 10));
        System.out.println("Min of 5 and 10: " + Math.min(5, 10));

        // Square root
        System.out.println("Square root of 64: " + Math.sqrt(64));

        // Absolute value
        System.out.println("Absolute value of -4.7: " + Math.abs(-4.7));

        // Power
        System.out.println("2 to the power of 8: " + Math.pow(2, 8));

        // Rounding methods
        System.out.println("Round 4.6: " + Math.round(4.6));
        System.out.println("Ceil 4.1: " + Math.ceil(4.1));
        System.out.println("Floor 4.9: " + Math.floor(4.9));

        // Random number (0.0 to 1.0)
        System.out.println("Random number (0.0 - 1.0): " + Math.random());

        // Random number between 0 and 100
        int randomNum = (int)(Math.random() * 101);
        System.out.println("Random number (0 - 100): " + randomNum);
    }
}
