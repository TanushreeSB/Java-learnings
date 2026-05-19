class ConstructorChaining_Student {
    String name;
    int age;
    
    ConstructorChaining_Student(){
        this("not known",0);
    }
    
    ConstructorChaining_Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name + " " + age);
    }
    
    public static void main(String args[]){
        ConstructorChaining_Student s = new ConstructorChaining_Student();
        ConstructorChaining_Student s1 = new ConstructorChaining_Student("Tanshree",22);
        s.display();
        s1.display();
        //System.out.println(s.name + " " + s.age);
    }
