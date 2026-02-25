// An interface is a blueprint of a class that contains only method declarations (no body).
interface Animal {
    void sound();   // abstract method (no body)
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog says: Bow Bow");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}
