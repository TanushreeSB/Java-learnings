// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class ConstructorDemo {
    int x;
    
    public Main(int y){
        x = y;
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(2);
        System.out.println(obj.x);
    }
}

/*

constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.

It can be used to set initial values for object attributes:

*/
