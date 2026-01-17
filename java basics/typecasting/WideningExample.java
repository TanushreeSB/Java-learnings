public class WideningExample {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;      // byte → short
        char c = (char) s; // short → char (needs cast because char is unsigned)
        int i = c;        // char → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("char value: " + c);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
    }
}
