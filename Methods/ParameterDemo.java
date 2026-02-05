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
