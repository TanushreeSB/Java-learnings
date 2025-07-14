/*
Method Overloading: Method overloading is a powerful feature in Java that allows a class to have multiple methods with the same name, as long as they have different parameter lists. 
This is also known as compile-time polymorphism or static polymorphism, because the compiler determines which method to call at compile time based on the method signature.
*/

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Kunal Kushwaha");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
