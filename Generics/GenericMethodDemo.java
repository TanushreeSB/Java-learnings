
class GenericMethodDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();

        System.out.println(demo.getValue("Hello Generics"));

        // Using with Integer
        Integer num = demo.getValue(123);
        System.out.println(num);

        // Using with Double
        Double d = demo.getValue(45.67);
        System.out.println(d);

        // Using with Boolean
        Boolean b = demo.getValue(true);
        System.out.println(b);
    }
}

class Demo {
    // Generic method: <T> declares type parameter, T is return type
    public <T> T getValue(T data) {
        return data;
    }
}

