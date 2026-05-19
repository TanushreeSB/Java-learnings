// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class ConstructorChaining_ParentMain{

    public static void main(String args[]){
       // Teacher t = new Teacher();
        child c = new child();
    }
}

class Teacher {
    String name;
    int age;
    
    Teacher(){
        System.out.println("Ananaya");
    }
}

class child extends Teacher{
    child(){
        
        System.out.println("Tanshree");
    }
}

