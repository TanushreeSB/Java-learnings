public class NarrowingExample {
    public static void main(String[] args) {

        double d = 100.04;
        float f = (float) d;   // double → float
        long l = (long) f;     // float → long
        int i = (int) l;       // long → int
        char c = (char) i;     // int → char
        short s = (short) c;   // char → short
        byte b = (byte) s;     // short → byte

        System.out.println("double value: " + d);
        System.out.println("float value: " + f);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
        System.out.println("char value: " + c);
        System.out.println("short value: " + s);
        System.out.println("byte value: " + b);
    }
}
