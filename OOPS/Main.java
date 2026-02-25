class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String brandname = "BMW";

    public String getBrandName() {
        return brandname;
    }
}

public class Main {
    public static void main(String args[]) {

        Car obj = new Car();
        obj.honk();
        System.out.println("Car: " + obj.brand + " " + obj.getBrandName());
    }
}

// Inheritance demo, subclass (child) - the class that inherits from another class
