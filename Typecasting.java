import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(56.78f);
        System.out.println(num);

        int a = 257;
        byte b = (byte)(a);

        System.out.println(b); // byte size is till 256, so to print we get remainder 257- 256 = 1

        int number = 'A';
        System.out.println(number);
    }
}

/* 
output:
56
1
65
*/
