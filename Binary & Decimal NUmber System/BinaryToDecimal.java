import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  import java.util.Scanner;

public class BinaryToDecimalBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal = " + decimal);
    }
}
