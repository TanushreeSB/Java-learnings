public class MethodDemo {
    static void MyMethod(){
        System.out.println("I love Java");
    }

    
    public static void main(String[] args) {
        MyMethod();
    }
}

// output: I love Java
/*
What does static mean?

static means the method belongs to the class, not to an object.

So you can call it without creating an object.

*/
