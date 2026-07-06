import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }

        System.out.println("Binary = " + binary);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class DecimalToBinaryBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary = " + binary);
    }
}
