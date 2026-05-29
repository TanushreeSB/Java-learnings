// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Box<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class GenericsClassDemo {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Box<String> box = new Box<>();

        box.set("Java");
        
        String s = box.get();
        
        System.out.println(s);
        
        Box<Integer> box1 = new Box<>();

        box1.set(100);
        
        Integer i = box1.get();
        
        System.out.println(i);
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Box<String> box = new Box<>("Java");

        System.out.println(box.get());
        
        Box<Integer> box1 = new Box<>(10);

        System.out.println(box1.get());
    }
}
