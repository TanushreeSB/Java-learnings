public class ParameterDemo {
  static void myMethod(String fname) {
    System.out.println(fname + " Shinde");
  }

  public static void main(String[] args) { 
// When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}

// Liam Shinde
// Jenny Shinde
// Anja Shinde

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Multiple Parameters

public class Main {
  static void myMethod(String fname,int age) {
    System.out.println(fname + " Shinde " + "is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam",12);
    myMethod("Jenny",13);
    myMethod("Anja",14);
  }
}

// Liam Shinde is 12
// Jenny Shinde is 13
// Anja Shinde is 14
