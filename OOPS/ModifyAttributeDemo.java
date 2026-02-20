public class ModifyAttributeDemo {
  int x; // In Java, variables declared inside a class are called "attributes".

  public static void main(String[] args) {
    ModifyAttributeDemo myObj = new ModifyAttributeDemo();
    myObj.x = 40;
    System.out.println(myObj.x); // 40 , You can access attributes by creating an object of the class, and by using the dot syntax (.)
  }
}

---------------------------------------------------------------------------------

// If you don't want the ability to override existing values, declare the attribute as final:
/*
Example
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
*/
