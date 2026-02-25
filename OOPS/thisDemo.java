// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class thisDemo {
    int x;
    
    public Main(int x){
        this.x = x;
    }

    public static void main(String[] args) {
        thisDemo obj = new thisDemo(2);
        System.out.println("Value of x: " + obj.x);
    }
}

// The this keyword in Java refers to the current object in a method or constructor.
// The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
