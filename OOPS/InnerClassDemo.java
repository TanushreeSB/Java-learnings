class Outer {

    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        innerObj.display();
    }
}

// An Inner Class is a class inside another class i.e. A helper class that belongs only to the outer class.

/*
Why Do We Use It?

To logically group classes

To increase security

To access private members of outer class
*/
