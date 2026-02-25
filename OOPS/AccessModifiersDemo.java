package pack1;

public class AccessModifiersDemo {
    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println(obj.publicVar);     // ✅
        // System.out.println(obj.privateVar); ❌ ERROR
        System.out.println(obj.defaultVar);    // ✅
        System.out.println(obj.protectedVar);  // ✅
    }
}

/*
public	The code is accessible for all classes	
private	The code is only accessible within the declared class	
default	The code is only accessible in the same package. This is used when you don't specify a modifier. 
protected	The code is accessible in the same package and subclasses
*/
