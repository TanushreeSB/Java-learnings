abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class NonAcessMethodDemo {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.sound();   // Dog barks
        obj.sleep();   // Sleeping...
    }
}

// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass
// The most commonly used non-access modifiers are final, static, and abstract.
