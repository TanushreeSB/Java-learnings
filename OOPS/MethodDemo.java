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

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class MethodDemo {
    public void MyMethod(){
        System.out.println("I love Java");
    }

    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.MyMethod();
    }
}

/*

Access Methods With an Object
This method is non-static.
Non-static methods belong to an object, not the class.

*/
